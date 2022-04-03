package clases_POJOs;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonProperty;

import org.bson.codecs.pojo.annotations.*;

@BsonDiscriminator
public class Domicilio {
	
	//Atributos
	@BsonId
	private int    idDomicilio;
	
	@BsonProperty("calle")
	private String calle;
	
	@BsonProperty("numero")
	private int    numero;
	
	@BsonProperty("localidad")
	private String localidad;
	
	@BsonProperty("provincia")
	private String provincia;
	
	
	//Constructores
	public Domicilio() {}

	public Domicilio(int idDomicilio, String calle, int numero, String localidad, String provincia) {
		
		this.idDomicilio = idDomicilio;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	
	//Getters y Setters
	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
	//toString
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + ", provincia="
				+ provincia + "]";
	}
		
}
