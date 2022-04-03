package farmacia;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.bson.codecs.configuration.CodecRegistry;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import clases_POJOs.Venta;
import conexion.ConexionMongoDB;
import conexion.PojoCodecRegistry;
import test.Util;
public class Farmacia {

	public static void main(String[] args) {
		
		/***************************************************************************************************************************/		
		//PRIMERA PARTE DEL TP - Conectar con MongoDB
		CodecRegistry pojoCodecRegistry = new PojoCodecRegistry().getPojoCodecRegistry();
		MongoClient clienteMongo = new ConexionMongoDB().getMongoClient();

		//Conexión a la base de datos (si no existe, mongoDB crea la base de datos cuando se alojen datos en ella)
		MongoDatabase farmaciaDB = clienteMongo.getDatabase("farmacia").withCodecRegistry(pojoCodecRegistry);
				
		//Conexión con la colección (si no existe, mongoDB crea la coleccion cuando se alojen datos en ella)
		MongoCollection ventasColeccion = farmaciaDB.getCollection("ventas", Venta.class );
		
		/***************************************************************************************************************************/		
		//SEGUNDA PARTE DEL TP - Carga de datos
			
		//Carga de datos de prueba a la colección en MongoDB
		Datos datos = new Datos();
		List<Venta> ventas = datos.cargaDeDatos();
		ventasColeccion.insertMany(ventas); 		//Cargo de datos a la base de datos
		
		//Para exportar la coleccion ventas en un documento JSON
		try {Runtime.getRuntime().exec("C:\\Program Files\\MongoDB\\Tools\\100\\bin\\mongoexport.exe --host localhost --port 27017 --db farmacia --collection ventas --out ventas.json --jsonArray");  //Para quienes tengan la versión 4.4 de mongo server, las herramientas de mongo (como mongoexport y mongoimport) ahora hay que instalarlas por separado  
		} catch (IOException e) {e.printStackTrace();}
	
		
		/***************************************************************************************************************************/		
		//TERCERA PARTE DEL TP - Consultas
		
		Util util = new Util();
		util.primeraConsulta(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31) );
		util.segundaConsulta(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31) );
		util.terceraConsulta(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31) );
		util.cuartaConsulta(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31) );
		util.quintaConsulta();
		util.sextaConsulta();
		util.septimaConsulta();
		util.octavaConsulta();
			
	}

}
