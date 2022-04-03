package conexion;

import com.mongodb.MongoClient;

public class ConexionMongoDB {	
	
	private static MongoClient mongoClient;

	public static MongoClient getMongoClient() {
		
		//Conexión al Server de MongoDB pasandole el host y el puerto 
		if (mongoClient == null) mongoClient = new MongoClient("localhost", 27017); 
		return mongoClient;
	}
	
}
