package farmacia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clases_POJOs.Cliente;
import clases_POJOs.Domicilio;
import clases_POJOs.Empleado;
import clases_POJOs.Item;
import clases_POJOs.ObraSocial;
import clases_POJOs.Producto;
import clases_POJOs.Venta;
import test.Util;

public class Datos {
	
	public List<Venta> cargaDeDatos(){
		//CARGA DE DOMICILIOS
		//Domicilios de los clientes
		Domicilio domicilio1  = new Domicilio(1,  "Calle A", 11,  "Calzada"  , "Buenos Aires"    );
		Domicilio domicilio2  = new Domicilio(2,  "Calle B", 22,  "Quilmes"  , "Buenos Aires"    );
		Domicilio domicilio3  = new Domicilio(3,  "Calle C", 33,  "Solano"   , "Buenos Aires"    );
		Domicilio domicilio4  = new Domicilio(4,  "Calle E", 44,  "Charcas"  , "Entre Rios"      );
		Domicilio domicilio5  = new Domicilio(5,  "Calle F", 55,  "Bariloche", "Rio Negro"       );
		Domicilio domicilio6  = new Domicilio(6,  "Calle G", 66,  "Ushuaia"  , "Tierra del Fuego");
		Domicilio domicilio7  = new Domicilio(7,  "Calle H", 77,  "Florencia", "Jujuy"           );
		Domicilio domicilio8  = new Domicilio(8,  "Calle I", 88,  "Lumen"    , "Catamarca"       );
		Domicilio domicilio9  = new Domicilio(9,  "Calle J", 99,  "Santio"   , "Mendoza"         );
		Domicilio domicilio10 = new Domicilio(10, "Calle K", 110, "Nandi"    , "Neuquen"         );

		//Domicilio de los empleados
		Domicilio domicilio11 = new Domicilio(11, "Calle B", 111, "Lomas"   , "Buenos Aires");
		Domicilio domicilio12 = new Domicilio(12, "Calle H", 122, "Naur"    , "Jujuy"       );
		Domicilio domicilio13 = new Domicilio(13, "Calle L", 133, "Biltro"  , "Santa Fe"    );
		Domicilio domicilio14 = new Domicilio(14, "Calle M", 144, "Zerrasca", "San Luis"    );
		Domicilio domicilio15 = new Domicilio(15, "Calle E", 155, "Quinoto" , "Entre Rios"  );
		Domicilio domicilio16 = new Domicilio(16, "Calle N", 166, "Trifa"   , "Tucuman"     );
		Domicilio domicilio17 = new Domicilio(17, "Calle I", 177, "Gento"   , "Catamarca"   );
		Domicilio domicilio18 = new Domicilio(18, "Calle O", 188, "Cañar"   , "La Rioja"    );
		Domicilio domicilio19 = new Domicilio(19, "Calle B", 199, "Zucre"   , "Buenos Aires");

		//Domicilio de las sucursales
		Domicilio domicilio20 = new Domicilio(20, "Calle P", 200, "Hurti"  , "La Pampa" );
		Domicilio domicilio21 = new Domicilio(21, "Calle K", 211, "Aqua"   , "Neuquen"  );
		Domicilio domicilio22 = new Domicilio(22, "Calle I", 222, "Vatican", "Catamarca");


		//CARGA DE OBRAS SOCIALES
		ObraSocial obraSocial1 = new ObraSocial(4189575, "PAMI");
		ObraSocial obraSocial2 = new ObraSocial(9562967, "IOMA");
		ObraSocial obraSocial3 = new ObraSocial(1274680, "AZUR");


		//CARGA DE CLIENTES
		Cliente cliente1  = new Cliente(1,  11111111,  "Pepe"   , "Argento" , "1111-1111", domicilio1,  52625, obraSocial1, 1734 );
		Cliente cliente2  = new Cliente(2,  22222222,  "Julio"  , "Profe"   , "2222-2222", domicilio2,  74819, obraSocial2, 484  );
		Cliente cliente3  = new Cliente(3,  33333333,  "Celeste", "Diaz"    , "3333-3333", domicilio3,  95823, null		  , 203  );
		Cliente cliente4  = new Cliente(4,  44444444,  "Maria"  , "Vazquez" , "4444-4444", domicilio4,  35829, obraSocial1, 73   );
		Cliente cliente5  = new Cliente(5,  55555555,  "Carles" , "Puyol"   , "5555-5555", domicilio5,  78493, obraSocial3, 4825 );
		Cliente cliente6  = new Cliente(6,  66666666,  "Nino"   , "Nior"    , "6666-6666", domicilio6,  98423, obraSocial3, 196  );
		Cliente cliente7  = new Cliente(7,  77777777,  "Victor" , "Luis"    , "7777-7777", domicilio7,  65382, null		  , 7923 );
		Cliente cliente8  = new Cliente(8,  88888888,  "Flor"   , "Quilo"   , "8888-8888", domicilio8,  83550, obraSocial3, 10683);
		Cliente cliente9  = new Cliente(9,  99999999,  "Alicia" , "Merendez", "9999-9999", domicilio9,  17593, obraSocial1, 588  );
		Cliente cliente10 = new Cliente(10, 10101010,  "Juan"   , "Perez"   , "1010-1010", domicilio10, 27530, obraSocial2, 32   );


		//CARGA DE EMPLEADOS
		Empleado empleado1 = new Empleado(11, 42853932, "Sandro"   , "Merendez"    , "5824-7261", domicilio11, 92652, obraSocial2, "53-152-52", 1, false);     
		Empleado empleado2 = new Empleado(12, 51737274, "Pascal"   , "Sillarp"     , "4523-8601", domicilio12, 85725, obraSocial1, "62-637-98", 1, false );
		Empleado empleado3 = new Empleado(13, 16378352, "Gomez"    , "Gauna"       , "1958-6800", domicilio13, 18572, obraSocial3, "26-387-03", 1, true);
		Empleado empleado4 = new Empleado(14, 95372524, "Agustina" , "Keyra"       , "2676-9386", domicilio14, 97807, obraSocial2, "71-948-39", 2, false);
		Empleado empleado5 = new Empleado(15, 35928502, "Fernandez", "Trevor"      , "8545-7383", domicilio15, 65672, obraSocial3, "62-783-40", 2, false );
		Empleado empleado6 = new Empleado(16, 48253542, "Carlos"   , "Tevez"       , "5097-2361", domicilio16, 20341, obraSocial2, "62-905-97", 2, true);
		Empleado empleado7 = new Empleado(17, 35436863, "Bosque"   , "Santamiranda", "8210-3802", domicilio17, 47697, obraSocial1, "84-174-87", 3, false);
		Empleado empleado8 = new Empleado(18, 64729620, "William"  , "Fevot"       , "6082-8000", domicilio18, 90260, obraSocial3, "96-274-13", 3, false);  
		Empleado empleado9 = new Empleado(19, 97026693, "Luis"     , "Cardozo"     , "8675-8794", domicilio19, 76595, obraSocial2, "75-826-03", 3, true );  


		//CARGA DE PRODUCTOS
		Producto producto1  = new Producto(126, "Ibuprofeno"   , 550 , "Para calmar el dolor y reducir la inflamacion"          , true );
		Producto producto2  = new Producto(263, "Bayaspirina"  , 300 , "Para dolor de cabeza"                                   , true );
		Producto producto3  = new Producto(146, "Ibupirac"     , 350 , "Para la gripe"                                          , true );
		Producto producto4  = new Producto(573, "Aromatizante" , 200 , "Para deshacerse de lo indeseado"                        , false);
		Producto producto5  = new Producto(773, "Omeprazol"    , 470 , "Para la acidez estomacal"                               , true );
		Producto producto6  = new Producto(357, "Levotiroxina" , 1300, "Para problemas en la glandula tiroidea"                 , true );
		Producto producto7  = new Producto(723, "Paracetamol"  , 660 , "Para la gripe y dolor de cabeza"                        , true );
		Producto producto8  = new Producto(635, "Atorvastatina", 1400, "Para bajar el colesterol"                               , true );
		Producto producto9  = new Producto(363, "Maquillaje"   , 800 , "Para quedar como un payaso"                             , false);
		Producto producto10 = new Producto(240, "Perfume"      , 500 , "Para la cartera de la dama y el bolsillo del caballero" , false);


		//CARGA DE ITEMS
		List <Item> listaItem1 = new ArrayList<Item>();
		listaItem1.add(new Item(producto1,  1) );
		listaItem1.add(new Item(producto2,  3) );

		List <Item> listaItem2 = new ArrayList<Item>();
		listaItem2.add(new Item(producto4,  2) );

		List <Item> listaItem3 = new ArrayList<Item>();
		listaItem3.add(new Item(producto6,  1) );

		List <Item> listaItem4 = new ArrayList<Item>();
		listaItem4.add(new Item(producto8,  2) );
		listaItem4.add(new Item(producto9,  4) );

		List <Item> listaItem5 = new ArrayList<Item>();
		listaItem5.add(new Item(producto10, 5) );

		List <Item> listaItem6 = new ArrayList<Item>();
		listaItem6.add(new Item(producto3,  2));

		List <Item> listaItem7 = new ArrayList<Item>();
		listaItem7.add(new Item(producto5,  2) );
		listaItem7.add(new Item(producto7,  1) );
		listaItem7.add(new Item(producto7,  1) );

		List <Item> listaItem8 = new ArrayList<Item>();
		listaItem8.add(new Item(producto4,  1) );

		List <Item> listaItem9 = new ArrayList<Item>();
		listaItem9.add(new Item(producto5,  1) );

		List <Item> listaItem10 = new ArrayList<Item>();
		listaItem10.add(new Item(producto3,  3) );

		List <Item> listaItem11 = new ArrayList<Item>();
		listaItem11.add(new Item(producto2,  2) );

		List <Item> listaItem12 = new ArrayList<Item>();
		listaItem12.add(new Item(producto1,  3) );
		listaItem12.add(new Item(producto4,  5) );

		List <Item> listaItem13 = new ArrayList<Item>();
		listaItem13.add(new Item(producto8,  3) );
		listaItem13.add(new Item(producto6,  4) );

		List <Item> listaItem14 = new ArrayList<Item>();
		listaItem14.add(new Item(producto8,  2) );

		List <Item> listaItem15 = new ArrayList<Item>();
		listaItem15.add(new Item(producto10, 3) );

		List <Item> listaItem16 = new ArrayList<Item>();
		listaItem16.add(new Item(producto2,  3) );
		listaItem16.add(new Item(producto4,  4) );
		listaItem16.add(new Item(producto3,  3) );

		List <Item> listaItem17 = new ArrayList<Item>();
		listaItem17.add(new Item(producto6,  4) );

		List <Item> listaItem18 = new ArrayList<Item>();
		listaItem18.add(new Item(producto9,  1) );

		List <Item> listaItem19 = new ArrayList<Item>();
		listaItem19.add(new Item(producto2,  3) );

		List <Item> listaItem20 = new ArrayList<Item>();
		listaItem20.add(new Item(producto7,  3) );

		List <Item> listaItem21 = new ArrayList<Item>();
		listaItem21.add(new Item(producto4,  3) );
		listaItem21.add(new Item(producto2,  2) );

		List <Item> listaItem22 = new ArrayList<Item>();
		listaItem22.add(new Item(producto10, 3) );

		List <Item> listaItem23 = new ArrayList<Item>();
		listaItem23.add(new Item(producto10, 2) );

		List <Item> listaItem24 = new ArrayList<Item>();
		listaItem24.add(new Item(producto10, 2) );

		List <Item> listaItem25 = new ArrayList<Item>();
		listaItem25.add(new Item(producto5, 1) );

		List <Item> listaItem26 = new ArrayList<Item>();
		listaItem26.add(new Item(producto3, 2) );

		List <Item> listaItem27 = new ArrayList<Item>();
		listaItem27.add(new Item(producto6, 3) );
		listaItem27.add(new Item(producto4, 3) );

		List <Item> listaItem28 = new ArrayList<Item>();
		listaItem28.add(new Item(producto1, 2) );
		listaItem28.add(new Item(producto7, 4) );
		listaItem28.add(new Item(producto8, 1) );

		List <Item> listaItem29 = new ArrayList<Item>();
		listaItem29.add(new Item(producto8, 3) );

		List <Item> listaItem30 = new ArrayList<Item>();
		listaItem30.add(new Item(producto9, 2) );
		listaItem30.add(new Item(producto4, 2) );
		listaItem30.add(new Item(producto2, 1) );

		List <Item> listaItem31 = new ArrayList<Item>();
		listaItem31.add(new Item(producto5, 4) );

		List <Item> listaItem32 = new ArrayList<Item>();
		listaItem32.add(new Item(producto3, 2) );

		List <Item> listaItem33 = new ArrayList<Item>();
		listaItem33.add(new Item(producto1, 3) );

		List <Item> listaItem34 = new ArrayList<Item>();
		listaItem34.add(new Item(producto4, 4) );

		List <Item> listaItem35 = new ArrayList<Item>();
		listaItem35.add(new Item(producto6, 2) );

		List <Item> listaItem36 = new ArrayList<Item>();
		listaItem36.add(new Item(producto8, 2) );
		listaItem36.add(new Item(producto10, 1) );

		List <Item> listaItem37 = new ArrayList<Item>();
		listaItem37.add(new Item(producto9, 2) );

		List <Item> listaItem38 = new ArrayList<Item>();
		listaItem38.add(new Item(producto1, 2) );

		List <Item> listaItem39 = new ArrayList<Item>();
		listaItem39.add(new Item(producto10, 2) );
		listaItem39.add(new Item(producto4, 1)  );

		List <Item> listaItem40 = new ArrayList<Item>();
		listaItem40.add(new Item(producto5, 1) );

		List <Item> listaItem41 = new ArrayList<Item>();
		listaItem41.add(new Item(producto6, 2) );

		List <Item> listaItem42 = new ArrayList<Item>();
		listaItem42.add(new Item(producto7, 3) );

		List<Item> listaItem43 = new ArrayList<Item>();
		listaItem43.add(new Item(producto5, 1) );

		List<Item> listaItem44 = new ArrayList<Item>();
		listaItem44.add(new Item(producto4, 3) );
		listaItem44.add(new Item(producto2, 2) );

		List<Item> listaItem45 = new ArrayList<Item>();
		listaItem45.add(new Item(producto10, 2) );
		listaItem45.add(new Item(producto4,  1) );
		listaItem45.add(new Item(producto7,  3) );

		List <Item> listaItem46 = new ArrayList<Item>();
		listaItem46.add(new Item(producto10, 3) );

		List <Item> listaItem47 = new ArrayList<Item>();
		listaItem47.add(new Item(producto2,  3) );
		listaItem47.add(new Item(producto4,  4) );
		listaItem47.add(new Item(producto3,  3) );

		List <Item> listaItem48 = new ArrayList<Item>();
		listaItem48.add(new Item(producto6,  4) );

		List <Item> listaItem49 = new ArrayList<Item>();
		listaItem49.add(new Item(producto9,  1) );

		List <Item> listaItem50 = new ArrayList<Item>();
		listaItem50.add(new Item(producto2,  3) );

		List <Item> listaItem51 = new ArrayList<Item>();
		listaItem51.add(new Item(producto7,  3) );

		List <Item> listaItem52 = new ArrayList<Item>();
		listaItem52.add(new Item(producto10, 3) );

		List <Item> listaItem53 = new ArrayList<Item>();
		listaItem53.add(new Item(producto10, 2) );

		List <Item> listaItem54 = new ArrayList<Item>();
		listaItem54.add(new Item(producto10, 2) );

		List <Item> listaItem55 = new ArrayList<Item>();
		listaItem55.add(new Item(producto5, 1) );

		List <Item> listaItem56 = new ArrayList<Item>();
		listaItem56.add(new Item(producto3, 2) );

		List <Item> listaItem57 = new ArrayList<Item>();
		listaItem57.add(new Item(producto6, 3) );
		listaItem57.add(new Item(producto4, 3) );

		List <Item> listaItem58 = new ArrayList<Item>();
		listaItem58.add(new Item(producto1, 2) );
		listaItem58.add(new Item(producto7, 4) );
		listaItem58.add(new Item(producto8, 1) );

		List <Item> listaItem59 = new ArrayList<Item>();
		listaItem59.add(new Item(producto8, 3) );

		List <Item> listaItem60 = new ArrayList<Item>();
		listaItem60.add(new Item(producto9, 2) );
		listaItem60.add(new Item(producto4, 2) );
		listaItem60.add(new Item(producto2, 1) );

		List <Item> listaItem61 = new ArrayList<Item>();
		listaItem61.add(new Item(producto5, 4) );

		List <Item> listaItem62 = new ArrayList<Item>();
		listaItem62.add(new Item(producto3, 2) );

		List <Item> listaItem63 = new ArrayList<Item>();
		listaItem63.add(new Item(producto1, 3) );

		List <Item> listaItem64 = new ArrayList<Item>();
		listaItem64.add(new Item(producto4, 4) );

		List <Item> listaItem65 = new ArrayList<Item>();
		listaItem65.add(new Item(producto6, 2) );

		List <Item> listaItem66 = new ArrayList<Item>();
		listaItem66.add(new Item(producto8, 2) );
		listaItem66.add(new Item(producto10, 1) );

		List <Item> listaItem67 = new ArrayList<Item>();
		listaItem67.add(new Item(producto9, 2) );

		List <Item> listaItem68 = new ArrayList<Item>();
		listaItem68.add(new Item(producto1, 2) );

		List <Item> listaItem69 = new ArrayList<Item>();
		listaItem69.add(new Item(producto10, 2) );
		listaItem69.add(new Item(producto4, 1)  );

		List <Item> listaItem70 = new ArrayList<Item>();
		listaItem70.add(new Item(producto5, 1) );

		List <Item> listaItem71 = new ArrayList<Item>();
		listaItem71.add(new Item(producto6, 2) );

		List <Item> listaItem72 = new ArrayList<Item>();
		listaItem72.add(new Item(producto7, 3) );

		List<Item> listaItem73 = new ArrayList<Item>();
		listaItem73.add(new Item(producto5, 1) );

		List<Item> listaItem74 = new ArrayList<Item>();
		listaItem74.add(new Item(producto4, 3) );
		listaItem74.add(new Item(producto2, 2) );

		List<Item> listaItem75 = new ArrayList<Item>();
		listaItem75.add(new Item(producto10, 2) );
		listaItem75.add(new Item(producto4,  1) );
		listaItem75.add(new Item(producto7,  3) );

		List <Item> listaItem76 = new ArrayList<Item>();
		listaItem76.add(new Item(producto1,  1) );
		listaItem76.add(new Item(producto2,  3) );

		List <Item> listaItem77 = new ArrayList<Item>();
		listaItem77.add(new Item(producto4,  2) );

		List <Item> listaItem78 = new ArrayList<Item>();
		listaItem78.add(new Item(producto6,  1) );

		List <Item> listaItem79 = new ArrayList<Item>();
		listaItem79.add(new Item(producto8,  2) );
		listaItem79.add(new Item(producto9,  4) );

		List <Item> listaItem80 = new ArrayList<Item>();
		listaItem80.add(new Item(producto10, 5) );

		List <Item> listaItem81 = new ArrayList<Item>();
		listaItem81.add(new Item(producto3,  2));

		List <Item> listaItem82 = new ArrayList<Item>();
		listaItem81.add(new Item(producto5,  2) );
		listaItem81.add(new Item(producto7,  1) );
		listaItem81.add(new Item(producto7,  1) );

		List <Item> listaItem83 = new ArrayList<Item>();
		listaItem83.add(new Item(producto4,  1) );

		List <Item> listaItem84 = new ArrayList<Item>();
		listaItem84.add(new Item(producto3,  3) );

		List <Item> listaItem85 = new ArrayList<Item>();
		listaItem85.add(new Item(producto2,  2) );

		List <Item> listaItem86 = new ArrayList<Item>();
		listaItem86.add(new Item(producto1,  3) );
		listaItem86.add(new Item(producto4,  5) );

		List <Item> listaItem87 = new ArrayList<Item>();
		listaItem87.add(new Item(producto8,  3) );
		listaItem87.add(new Item(producto6,  4) );

		List <Item> listaItem88 = new ArrayList<Item>();
		listaItem88.add(new Item(producto8,  2) );

		List <Item> listaItem89 = new ArrayList<Item>();
		listaItem89.add(new Item(producto10, 3) );

		List <Item> listaItem90 = new ArrayList<Item>();
		listaItem90.add(new Item(producto10, 4) );
		listaItem90.add(new Item(producto1,  2) );
		listaItem90.add(new Item(producto5,  1) );


		//CARGA DE VENTAS
		Util util = new Util();
		List<Venta> ventas = new ArrayList<Venta>();

		//Ventas Sucursal 1
		ventas.add(new Venta("001-0462", LocalDate.of(2018, 1 , 15), util.calcularTotal(listaItem1) , "Efectivo", empleado1, empleado2, cliente1 , listaItem1 ) );
		ventas.add(new Venta("001-0322", LocalDate.of(2018, 2 , 28), util.calcularTotal(listaItem2) , "Efectivo", empleado1, empleado2, cliente3 , listaItem2 ) );
		ventas.add(new Venta("001-0542", LocalDate.of(2018, 3 , 30), util.calcularTotal(listaItem3) , "Efectivo", empleado2, empleado1, cliente2 , listaItem3 ) );
		ventas.add(new Venta("001-0762", LocalDate.of(2018, 4 , 1 ), util.calcularTotal(listaItem4) , "Credito" , empleado1, empleado2, cliente4 , listaItem4 ) );
		ventas.add(new Venta("001-0232", LocalDate.of(2018, 5 , 5 ), util.calcularTotal(listaItem5) , "Debito"  , empleado2, empleado1, cliente5 , listaItem5 ) );
		ventas.add(new Venta("001-1462", LocalDate.of(2018, 6 , 2 ), util.calcularTotal(listaItem6) , "Efectivo", empleado1, empleado2, cliente7 , listaItem6 ) );
		ventas.add(new Venta("001-5662", LocalDate.of(2018, 7 , 13), util.calcularTotal(listaItem7) , "Credito" , empleado1, empleado2, cliente2 , listaItem7 ) );
		ventas.add(new Venta("001-3562", LocalDate.of(2018, 8 , 16), util.calcularTotal(listaItem8) , "Credito" , empleado1, empleado2, cliente8 , listaItem8 ) );
		ventas.add(new Venta("001-6402", LocalDate.of(2018, 9 , 18), util.calcularTotal(listaItem9) , "Debito"  , empleado1, empleado2, cliente1 , listaItem9 ) );
		ventas.add(new Venta("001-7943", LocalDate.of(2018, 10, 25), util.calcularTotal(listaItem10), "Credito" , empleado1, empleado2, cliente10, listaItem10) );
		ventas.add(new Venta("001-0235", LocalDate.of(2018, 11, 9 ), util.calcularTotal(listaItem11), "Efectivo", empleado2, empleado1, cliente3 , listaItem11) );
		ventas.add(new Venta("001-0412", LocalDate.of(2018, 12, 10), util.calcularTotal(listaItem12), "Efectivo", empleado2, empleado1, cliente7 , listaItem12) );
		ventas.add(new Venta("001-0055", LocalDate.of(2019, 1 , 7 ), util.calcularTotal(listaItem13), "Efectivo", empleado1, empleado2, cliente4 , listaItem13) );
		ventas.add(new Venta("001-0002", LocalDate.of(2019, 2 , 9 ), util.calcularTotal(listaItem14), "Debito"  , empleado2, empleado1, cliente9 , listaItem14) );
		ventas.add(new Venta("001-2834", LocalDate.of(2019, 3 , 30), util.calcularTotal(listaItem15), "Debito"  , empleado1, empleado2, cliente8 , listaItem15) );
		ventas.add(new Venta("001-5937", LocalDate.of(2019, 4 , 3 ), util.calcularTotal(listaItem16), "Credito" , empleado1, empleado2, cliente4 , listaItem16) );
		ventas.add(new Venta("001-7539", LocalDate.of(2019, 5 , 7 ), util.calcularTotal(listaItem17), "Debito"  , empleado1, empleado2, cliente3 , listaItem17) );
		ventas.add(new Venta("001-6925", LocalDate.of(2019, 6 , 14), util.calcularTotal(listaItem18), "Efectivo", empleado1, empleado2, cliente10, listaItem18) );
		ventas.add(new Venta("001-6328", LocalDate.of(2019, 7 , 19), util.calcularTotal(listaItem19), "Efectivo", empleado2, empleado1, cliente1 , listaItem19) );
		ventas.add(new Venta("001-9204", LocalDate.of(2019, 8 , 21), util.calcularTotal(listaItem20), "Debito"  , empleado1, empleado2, cliente4 , listaItem20) );
		ventas.add(new Venta("001-4252", LocalDate.of(2019, 9 , 11), util.calcularTotal(listaItem21), "Efectivo", empleado1, empleado2, cliente2 , listaItem21) );
		ventas.add(new Venta("001-5373", LocalDate.of(2019, 10, 29), util.calcularTotal(listaItem22), "Efectivo", empleado2, empleado1, cliente3 , listaItem22) );
		ventas.add(new Venta("001-0252", LocalDate.of(2019, 11, 5 ), util.calcularTotal(listaItem23), "Efectivo", empleado1, empleado2, cliente5 , listaItem23) );
		ventas.add(new Venta("001-0650", LocalDate.of(2019, 12, 8 ), util.calcularTotal(listaItem24), "Efectivo", empleado2, empleado1, cliente6 , listaItem24) );
		ventas.add(new Venta("001-0492", LocalDate.of(2020, 1 , 2 ), util.calcularTotal(listaItem25), "Credito" , empleado2, empleado1, cliente9 , listaItem25) );
		ventas.add(new Venta("001-0847", LocalDate.of(2020, 3 , 1 ), util.calcularTotal(listaItem26), "Credito" , empleado1, empleado2, cliente8 , listaItem26) );
		ventas.add(new Venta("001-6437", LocalDate.of(2020, 7 , 14), util.calcularTotal(listaItem27), "Credito" , empleado2, empleado1, cliente1 , listaItem27) );
		ventas.add(new Venta("001-1252", LocalDate.of(2020, 10, 20), util.calcularTotal(listaItem29), "Debito"  , empleado1, empleado2, cliente5 , listaItem29) );
		ventas.add(new Venta("001-4062", LocalDate.of(2020, 12, 31), util.calcularTotal(listaItem30), "Efectivo", empleado1, empleado2, cliente10, listaItem30) );

		//Ventas Sucursal 2
		ventas.add(new Venta("002-6326", LocalDate.of(2018, 1 , 5 ), util.calcularTotal(listaItem31), "Efectivo", empleado4, empleado5, cliente5 , listaItem31) );
		ventas.add(new Venta("002-8431", LocalDate.of(2018, 2 , 28), util.calcularTotal(listaItem32), "Efectivo", empleado5, empleado4, cliente10, listaItem32) );
		ventas.add(new Venta("002-0351", LocalDate.of(2018, 3 , 22), util.calcularTotal(listaItem33), "Credito" , empleado5, empleado4, cliente4 , listaItem33) );
		ventas.add(new Venta("002-0835", LocalDate.of(2018, 4 , 6 ), util.calcularTotal(listaItem34), "Debito"  , empleado4, empleado5, cliente3 , listaItem34) );
		ventas.add(new Venta("002-2860", LocalDate.of(2018, 5 , 19), util.calcularTotal(listaItem35), "Efectivo", empleado5, empleado4, cliente6 , listaItem35) );
		ventas.add(new Venta("002-2960", LocalDate.of(2018, 6 , 15), util.calcularTotal(listaItem36), "Debito"  , empleado5, empleado4, cliente2 , listaItem36) );
		ventas.add(new Venta("002-2715", LocalDate.of(2018, 7 , 27), util.calcularTotal(listaItem37), "Debito"  , empleado5, empleado4, cliente3 , listaItem37) );
		ventas.add(new Venta("002-4864", LocalDate.of(2018, 8 , 4 ), util.calcularTotal(listaItem38), "Credito" , empleado4, empleado5, cliente9 , listaItem38) );
		ventas.add(new Venta("002-4068", LocalDate.of(2018, 9 , 7 ), util.calcularTotal(listaItem39), "Efectivo", empleado4, empleado5, cliente1 , listaItem39) );
		ventas.add(new Venta("002-3462", LocalDate.of(2018, 10, 1 ), util.calcularTotal(listaItem40), "Efectivo", empleado5, empleado4, cliente7 , listaItem40) );
		ventas.add(new Venta("002-6472", LocalDate.of(2018, 11, 25), util.calcularTotal(listaItem41), "Credito" , empleado4, empleado5, cliente5 , listaItem41) );
		ventas.add(new Venta("002-3738", LocalDate.of(2018, 12, 10), util.calcularTotal(listaItem42), "Efectivo", empleado5, empleado4, cliente6 , listaItem42) );
		ventas.add(new Venta("002-0740", LocalDate.of(2019, 1 , 13), util.calcularTotal(listaItem43), "Debito"  , empleado4, empleado5, cliente3 , listaItem43) );
		ventas.add(new Venta("002-0005", LocalDate.of(2019, 2 , 17), util.calcularTotal(listaItem44), "Efectivo", empleado5, empleado4, cliente8 , listaItem44) );
		ventas.add(new Venta("002-0692", LocalDate.of(2019, 3 , 26), util.calcularTotal(listaItem45), "Efectivo", empleado4, empleado5, cliente9 , listaItem45) );
		ventas.add(new Venta("002-5930", LocalDate.of(2019, 4 , 28), util.calcularTotal(listaItem46), "Efectivo", empleado5, empleado4, cliente10, listaItem46) );
		ventas.add(new Venta("002-0548", LocalDate.of(2019, 5 , 3 ), util.calcularTotal(listaItem47), "Efectivo", empleado5, empleado4, cliente7 , listaItem47) );
		ventas.add(new Venta("002-3067", LocalDate.of(2019, 6 , 14), util.calcularTotal(listaItem48), "Credito" , empleado5, empleado4, cliente8 , listaItem48) );
		ventas.add(new Venta("002-7754", LocalDate.of(2019, 7 , 15), util.calcularTotal(listaItem49), "Credito" , empleado4, empleado5, cliente3 , listaItem49) );
		ventas.add(new Venta("002-8842", LocalDate.of(2019, 8 , 8 ), util.calcularTotal(listaItem50), "Efectivo", empleado5, empleado4, cliente10, listaItem50) );
		ventas.add(new Venta("002-7829", LocalDate.of(2019, 9 , 25), util.calcularTotal(listaItem51), "Efectivo", empleado5, empleado4, cliente5 , listaItem51) );
		ventas.add(new Venta("002-8672", LocalDate.of(2019, 10, 17), util.calcularTotal(listaItem52), "Debito"  , empleado5, empleado4, cliente8 , listaItem52) );
		ventas.add(new Venta("002-0502", LocalDate.of(2019, 11, 20), util.calcularTotal(listaItem53), "Debito"  , empleado5, empleado4, cliente9 , listaItem53) );
		ventas.add(new Venta("002-0035", LocalDate.of(2019, 12, 10), util.calcularTotal(listaItem54), "Credito" , empleado4, empleado5, cliente5 , listaItem54) );
		ventas.add(new Venta("002-0869", LocalDate.of(2020, 3 , 4 ), util.calcularTotal(listaItem55), "Efectivo", empleado5, empleado4, cliente3 , listaItem55) );
		ventas.add(new Venta("002-4078", LocalDate.of(2020, 5 , 7 ), util.calcularTotal(listaItem56), "Credito" , empleado4, empleado5, cliente4 , listaItem56) );
		ventas.add(new Venta("002-3975", LocalDate.of(2020, 7 , 3 ), util.calcularTotal(listaItem57), "Credito" , empleado4, empleado5, cliente2 , listaItem57) );
		ventas.add(new Venta("002-2765", LocalDate.of(2020, 8 , 7 ), util.calcularTotal(listaItem58), "Efectivo", empleado5, empleado4, cliente10, listaItem58) );
		ventas.add(new Venta("002-3780", LocalDate.of(2020, 11, 17), util.calcularTotal(listaItem59), "Efectivo", empleado4, empleado5, cliente7 , listaItem59) );
		ventas.add(new Venta("002-5579", LocalDate.of(2020, 11, 20), util.calcularTotal(listaItem60), "Efectivo", empleado5, empleado4, cliente6 , listaItem60) );

		//Ventas Sucursal 3
		ventas.add(new Venta("003-6953", LocalDate.of(2018, 1 , 11), util.calcularTotal(listaItem61), "Debito"  , empleado7, empleado8, cliente2 , listaItem61) );
		ventas.add(new Venta("003-5726", LocalDate.of(2018, 2 , 13), util.calcularTotal(listaItem62), "Credito" , empleado7, empleado8, cliente1 , listaItem62) );
		ventas.add(new Venta("003-6325", LocalDate.of(2018, 3 , 6 ), util.calcularTotal(listaItem63), "Credito" , empleado8, empleado7, cliente3 , listaItem63) );
		ventas.add(new Venta("003-1313", LocalDate.of(2018, 4 , 25), util.calcularTotal(listaItem64), "Efectivo", empleado7, empleado7, cliente6 , listaItem64) );
		ventas.add(new Venta("003-2124", LocalDate.of(2018, 5 , 17), util.calcularTotal(listaItem65), "Efectivo", empleado8, empleado7, cliente10, listaItem65) );
		ventas.add(new Venta("003-7543", LocalDate.of(2018, 6 , 2 ), util.calcularTotal(listaItem66), "Credito" , empleado8, empleado7, cliente4 , listaItem66) );
		ventas.add(new Venta("003-0030", LocalDate.of(2018, 7 , 19), util.calcularTotal(listaItem67), "Debito"  , empleado8, empleado7, cliente5 , listaItem67) );
		ventas.add(new Venta("003-4064", LocalDate.of(2018, 8 , 20), util.calcularTotal(listaItem68), "Credito" , empleado8, empleado7, cliente6 , listaItem68) );
		ventas.add(new Venta("003-5460", LocalDate.of(2018, 9 , 12), util.calcularTotal(listaItem69), "Debito"  , empleado7, empleado8, cliente7 , listaItem69) );
		ventas.add(new Venta("003-3640", LocalDate.of(2018, 10, 30), util.calcularTotal(listaItem70), "Efectivo", empleado8, empleado7, cliente8 , listaItem70) );
		ventas.add(new Venta("003-0003", LocalDate.of(2018, 11, 12), util.calcularTotal(listaItem71), "Debito"  , empleado7, empleado8, cliente5 , listaItem71) );
		ventas.add(new Venta("003-8472", LocalDate.of(2018, 12, 18), util.calcularTotal(listaItem72), "Efectivo", empleado7, empleado8, cliente9 , listaItem72) );
		ventas.add(new Venta("003-0860", LocalDate.of(2019, 1 , 5 ), util.calcularTotal(listaItem73), "Efectivo", empleado8, empleado7, cliente1 , listaItem73) );
		ventas.add(new Venta("003-6285", LocalDate.of(2019, 2 , 13), util.calcularTotal(listaItem74), "Credito" , empleado7, empleado8, cliente2 , listaItem74) );
		ventas.add(new Venta("003-1232", LocalDate.of(2019, 3 , 7 ), util.calcularTotal(listaItem75), "Debito"  , empleado7, empleado8, cliente4 , listaItem75) );
		ventas.add(new Venta("003-4685", LocalDate.of(2019, 4 , 27), util.calcularTotal(listaItem76), "Debito"  , empleado8, empleado7, cliente6 , listaItem76) );
		ventas.add(new Venta("003-1235", LocalDate.of(2019, 5 , 30), util.calcularTotal(listaItem77), "Debito"  , empleado8, empleado7, cliente3 , listaItem77) );
		ventas.add(new Venta("003-4896", LocalDate.of(2019, 6 , 30), util.calcularTotal(listaItem78), "Credito" , empleado7, empleado8, cliente1 , listaItem78) );
		ventas.add(new Venta("003-1596", LocalDate.of(2019, 7 , 12), util.calcularTotal(listaItem79), "Credito" , empleado7, empleado8, cliente10, listaItem79) );
		ventas.add(new Venta("003-1753", LocalDate.of(2019, 8 , 22), util.calcularTotal(listaItem80), "Efectivo", empleado7, empleado8, cliente7 , listaItem80) );
		ventas.add(new Venta("003-6849", LocalDate.of(2019, 9 , 10), util.calcularTotal(listaItem81), "Debito"  , empleado8, empleado7, cliente9 , listaItem81) );
		ventas.add(new Venta("003-7895", LocalDate.of(2019, 10, 1 ), util.calcularTotal(listaItem82), "Efectivo", empleado8, empleado7, cliente3 , listaItem82) );
		ventas.add(new Venta("003-8401", LocalDate.of(2019, 11, 5 ), util.calcularTotal(listaItem83), "Debito"  , empleado7, empleado8, cliente2 , listaItem83) );
		ventas.add(new Venta("003-7294", LocalDate.of(2019, 12, 7 ), util.calcularTotal(listaItem84), "Debito"  , empleado7, empleado8, cliente1 , listaItem84) );
		ventas.add(new Venta("003-1284", LocalDate.of(2020, 4 , 20), util.calcularTotal(listaItem85), "Credito" , empleado7, empleado8, cliente9 , listaItem85) );
		ventas.add(new Venta("003-0580", LocalDate.of(2020, 4 , 6 ), util.calcularTotal(listaItem86), "Efectivo", empleado7, empleado8, cliente8 , listaItem86) );
		ventas.add(new Venta("003-0305", LocalDate.of(2020, 7 , 17), util.calcularTotal(listaItem87), "Debito"  , empleado8, empleado7, cliente10, listaItem87) );
		ventas.add(new Venta("003-0046", LocalDate.of(2020, 8 , 15), util.calcularTotal(listaItem88), "Debito"  , empleado7, empleado8, cliente5 , listaItem88) );
		ventas.add(new Venta("003-0017", LocalDate.of(2020, 10, 2 ), util.calcularTotal(listaItem89), "Credito" , empleado7, empleado8, cliente8 , listaItem89) );
		ventas.add(new Venta("003-0367", LocalDate.of(2020, 12, 25), util.calcularTotal(listaItem90), "Debito"  , empleado7, empleado8, cliente1 , listaItem90) );

		return ventas;
	}

}
