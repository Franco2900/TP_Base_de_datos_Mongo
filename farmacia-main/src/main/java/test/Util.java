package test;

import clases_POJOs.Item;
import clases_POJOs.Venta;
import conexion.ConexionMongoDB;
import conexion.PojoCodecRegistry;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Accumulators.sum;
import static com.mongodb.client.model.Aggregates.*;
import static com.mongodb.client.model.Projections.*;
import static com.mongodb.client.model.Sorts.descending;

//Acá estan todas las funciones que usamos a lo largo del trabajo práctico

public class Util {
	
	public double calcularTotal(List<Item> items) {
		double total = 0;
		for(Item i: items) {
			total = total + (i.getProducto().getPrecio() * i.getCantidad() );
		}
		return total;
	}

	public void imprimirConsulta(List<Document> resultadoConsulta) {
		
		for(Document doc: resultadoConsulta) {
			System.out.println(((Document) doc).toJson());
		}
		
	}

/***************************************************************************************************************/
	CodecRegistry pojoCodecRegistry = new PojoCodecRegistry().getPojoCodecRegistry();
	
	MongoClient clienteMongo = new ConexionMongoDB().getMongoClient();
	MongoDatabase farmaciaDB = clienteMongo.getDatabase("farmacia").withCodecRegistry(pojoCodecRegistry); //Conexión a la base de datos (si no existe, mongoDB crea la base de datos cuando se alojen datos en ella)
	MongoCollection ventasColeccion = farmaciaDB.getCollection("ventas"); //Conexión con la colección (si no existe, mongoDB crea la coleccion cuando se alojen datos en ella)
/***************************************************************************************************************/
//	1. Un reporte con dos resultados, por un lado el total de la cantidad de ventas de toda la
//	cadena completa (todas las sucursales) y por otro lado las cantidades de ventas agrupadas por
//	sucursales. Todo esto debe ocurrir entre dos fechas pasadas como parámetros (fecha desde y fecha hasta).

	public void primeraConsulta(LocalDate fechaInicio, LocalDate fechaFinal) {
		
		System.out.println("***************************************************************************");
		System.out.println("1° CONSULTA");
		
		MongoCollection primeraConsulta = farmaciaDB.getCollection("primeraConsulta");
		
		Bson filtro = match(and(gte("fecha", fechaInicio), lte("fecha",fechaFinal)) );
		Bson agruparPor = group("$cajero.sucursal", sum("Cantidad ventas", 1) );
		Bson proyectoSucursal = project(fields(excludeId(), include("Cantidad ventas"), computed("Sucursal", "$_id")) );
		Bson ordenamiento = sort(Sorts.ascending("Sucursal"));
		
		List<Document> resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(filtro, agruparPor, proyectoSucursal, ordenamiento) ).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		primeraConsulta.insertMany(resultadoConsulta);
		
		resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(filtro, count("Cantidad ventas global")) ).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		primeraConsulta.insertMany(resultadoConsulta);
		
		try {Runtime.getRuntime().exec("C:\\Program Files\\MongoDB\\Tools\\100\\bin\\mongoexport.exe --host localhost --port 27017 --db farmacia --collection primeraConsulta --out primeraConsulta.json --jsonArray");}
		catch (IOException e) {e.printStackTrace();}
			 
	}
	
	
//	2. Un reporte con las cantidades de ventas agrupadas por obras sociales y además considerar los privados (sin obra social)
//	como un grupo mas. Todo esto debe ocurrir entre dos fechas pasadas como parámetros (fecha desde y fecha hasta)
	
	public void segundaConsulta(LocalDate fechaInicio, LocalDate fechaFinal) {
		
		System.out.println("***************************************************************************");
		System.out.println("2° CONSULTA");
		
		MongoCollection segundaConsulta = farmaciaDB.getCollection("segundaConsulta");
		
		Bson filtro = match(and(gte("fecha", fechaInicio), lte("fecha",fechaFinal)) );
		Bson agruparPor = group("$cliente.obraSocial.nombre", sum("Cantidad ventas", 1) );
		Bson proyecto = project(fields(excludeId(), include("Cantidad ventas"), computed("Obra social", "$_id")) );
		Bson ordenamiento = sort(descending("Cantidad ventas"));
		
		List<Document> resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(filtro, agruparPor, proyecto, ordenamiento) ).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		segundaConsulta.insertMany(resultadoConsulta);
		
		try {Runtime.getRuntime().exec("C:\\Program Files\\MongoDB\\Tools\\100\\bin\\mongoexport.exe --host localhost --port 27017 --db farmacia --collection segundaConsulta --out segundaConsulta.json --jsonArray");}
		catch (IOException e) {e.printStackTrace();}
	}
	

//	3. Un reporte con dos resultados, por un lado el total de la cobranza de toda la cadena
//	completa (todas las sucursales) y por otro lado la cobranza agrupada por sucursales. Todo esto
//	debe ocurrir entre dos fechas pasadas como parámetros (fecha desde y fecha hasta).

	public void terceraConsulta(LocalDate fechaInicio, LocalDate fechaFinal) {
		
		System.out.println("***************************************************************************");
		System.out.println("3° CONSULTA");
		
		MongoCollection terceraConsulta = farmaciaDB.getCollection("terceraConsulta");
		
		Bson filtro = match(and(gte("fecha", fechaInicio), lte("fecha",fechaFinal)) );
		Bson agruparPor = group("$cajero.sucursal", sum("Cobranza", "$total") );
		Bson proyecto = project(fields(excludeId(), include("Cobranza"), computed("Sucursal", "$_id")) );
		Bson ordenamiento = sort(Sorts.ascending("Sucursal"));
		
		List<Document> resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(filtro, agruparPor, proyecto, ordenamiento) ).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		terceraConsulta.insertMany(resultadoConsulta);
		
		Bson agruparGlobal = group("Cobranza", sum("Cobranza global", "$total") );
		Bson proyectoGlobal = project(fields(excludeId(), include("Cobranza global") ));
		resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(filtro, agruparGlobal, proyectoGlobal) ).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		terceraConsulta.insertMany(resultadoConsulta);
		
		try {Runtime.getRuntime().exec("C:\\Program Files\\MongoDB\\Tools\\100\\bin\\mongoexport.exe --host localhost --port 27017 --db farmacia --collection terceraConsulta --out terceraConsulta.json --jsonArray");}
		catch (IOException e) {e.printStackTrace();}
	}
	
	

//	4. Un reporte con las cantidades de ventas agrupadas por tipo de producto (farmacia / perfumería). 
//	Todo esto debe ocurrir entre dos fechas pasadas como parámetros (fecha desde y	fecha hasta)

	public void cuartaConsulta(LocalDate fechaInicio, LocalDate fechaFinal) {
		
		System.out.println("***************************************************************************");
		System.out.println("4° CONSULTA");
		
		MongoCollection cuartaConsulta = farmaciaDB.getCollection("cuartaConsulta");
		
		Bson filtro = match(and(gte("fecha", fechaInicio), lte("fecha",fechaFinal)) );
		Bson separar = unwind("$item");
		Bson agruparPor = group("$item.producto.medicamento", sum("Cantidad ventas", 1) );
		Bson proyecto = project(fields(excludeId(), include("Cantidad ventas"), computed("Es medicamento", "$_id")) );
		
		List<Document> resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(filtro, separar, agruparPor, proyecto) ).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		cuartaConsulta.insertMany(resultadoConsulta);
		
		try {Runtime.getRuntime().exec("C:\\Program Files\\MongoDB\\Tools\\100\\bin\\mongoexport.exe --host localhost --port 27017 --db farmacia --collection cuartaConsulta --out cuartaConsulta.json --jsonArray");}
		catch (IOException e) {e.printStackTrace();}
	}
	
	

//	5. Ranking de monto vendido, agrupado por producto y por sucursal.

	public void quintaConsulta() {
		
		System.out.println("***************************************************************************");
		System.out.println("5° CONSULTA");
		
		MongoCollection quintaConsulta = farmaciaDB.getCollection("quintaConsulta");

		Bson separarItems = unwind("$item");
		Document monto = new Document("$multiply", Arrays.asList("$item.cantidad", "$item.producto.precio") );
		Bson ordenamiento = sort(Sorts.ascending("_id.Sucursal", "_id.Producto"));

		Document agrupar = new Document("$group", new Document("_id", new Document("Sucursal", "$cajero.sucursal").append("Producto", "$item.producto.nombre")).append("Monto", new Document("$sum", monto) ) );

		List<Document> resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(separarItems, agrupar, ordenamiento)).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		quintaConsulta.insertMany(resultadoConsulta);
		
		try {Runtime.getRuntime().exec("C:\\Program Files\\MongoDB\\Tools\\100\\bin\\mongoexport.exe --host localhost --port 27017 --db farmacia --collection quintaConsulta --out quintaConsulta.json --jsonArray");}
		catch (IOException e) {e.printStackTrace();}
	}
	

//	6. Ranking de cantidad de productos vendidos, agrupado por producto y por sucursal.
	
	public void sextaConsulta() {
		
		System.out.println("***************************************************************************");
		System.out.println("6° CONSULTA");
		
		MongoCollection sextaConsulta = farmaciaDB.getCollection("sextaConsulta");
		
		Bson separarItems = unwind("$item");
		Document monto = new Document("$multiply", Arrays.asList("$item.cantidad", "$item.producto.precio") );
		Bson ordenamiento = sort(Sorts.ascending("_id.Sucursal", "_id.Producto") );
		Document agrupar = new Document("$group", new Document("_id", new Document("Sucursal", "$cajero.sucursal").append("Producto", "$item.producto.nombre")).append("Cantidad", new Document("$sum", "$item.cantidad") ) );

		List<Document> resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(separarItems, agrupar, ordenamiento)).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		sextaConsulta.insertMany(resultadoConsulta);
		
		try {Runtime.getRuntime().exec("C:\\Program Files\\MongoDB\\Tools\\100\\bin\\mongoexport.exe --host localhost --port 27017 --db farmacia --collection sextaConsulta --out sextaConsulta.json --jsonArray");}
		catch (IOException e) {e.printStackTrace();}
	}
	
	
//	7. Ranking compras agrupadas por cliente para el total de la cadena. (quiero ver los clientes
//	que mas compraron en toda la cadena, pudieron comprar en mas de una sucursal)

	public void septimaConsulta() {
		
		System.out.println("***************************************************************************");
		System.out.println("7° CONSULTA");
		
		MongoCollection septimaConsulta = farmaciaDB.getCollection("septimaConsulta");
		
		Bson agruparPor = group("$cliente._id", sum("Compras", 1) );
		Bson proyecto = project(fields(excludeId(), include("Compras"), computed("Cliente", "$_id")) );
		Bson ordenamiento = sort(descending("Compras"));

		List<Document> resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(agruparPor, proyecto, ordenamiento) ).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		septimaConsulta.insertMany(resultadoConsulta);
		
		try {Runtime.getRuntime().exec("C:\\Program Files\\MongoDB\\Tools\\100\\bin\\mongoexport.exe --host localhost --port 27017 --db farmacia --collection septimaConsulta --out septimaConsulta.json --jsonArray");}
		catch (IOException e) {e.printStackTrace();}
	}

	
//	8. Ranking compras agrupadas por cliente y por sucursal. (quiero ver como compraron los	clientes intra-sucursal)
	
	public void octavaConsulta() {
		
		System.out.println("***************************************************************************");
		System.out.println("8° CONSULTA");
		
		MongoCollection octavaConsulta = farmaciaDB.getCollection("octavaConsulta");

		Document agrupar = new Document("$group", new Document("_id", new Document("Sucursal", "$cajero.sucursal").append("Cliente", "$cliente._id")).append("Compras", new Document("$sum", 1) ) );
		Document agrupar2 = new Document("$group", new Document("_id", new Document("Sucursal", "$_id.Sucursal").append("Cliente", "$_id.Cliente").append("Compras", "$Compras") ));

		Bson ordenamiento = sort(new BasicDBObject ("_id.Sucursal", 1).append("_id.Compras", -1) );
		
		List<Document> resultadoConsulta = (List<Document>) ventasColeccion.aggregate(Arrays.asList(agrupar, agrupar2, ordenamiento)).into(new ArrayList<>());
		imprimirConsulta(resultadoConsulta);
		octavaConsulta.insertMany(resultadoConsulta);
		
		try {Runtime.getRuntime().exec("C:\\Program Files\\MongoDB\\Tools\\100\\bin\\mongoexport.exe --host localhost --port 27017 --db farmacia --collection octavaConsulta --out octavaConsulta.json --jsonArray");}
		catch (IOException e) {e.printStackTrace();}
	}
	
}
