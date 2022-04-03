package clases_POJOs;

import org.bson.codecs.pojo.annotations.*;

@BsonDiscriminator
public class ObraSocial {
	
	//Atributos
	@BsonId
	private int    idObraSocial;
	
	@BsonProperty("nombre")
	private String nombre;
	
	
	//Constructores
	public ObraSocial() {}

	public ObraSocial(int idObraSocial, String nombre) {
		
		this.idObraSocial = idObraSocial;
		this.nombre = nombre;
	}

	
	//Getters y Setters
	public int getIdObraSocial() {
		return idObraSocial;
	}
	public void setIdObraSocial(int idObraSocial) {
		this.idObraSocial = idObraSocial;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//toString
	@Override
	public String toString() {
		return "ObraSocial : " + nombre +" ";
	}
	
}
