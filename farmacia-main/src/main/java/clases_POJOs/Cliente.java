package clases_POJOs;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonProperty;

@BsonDiscriminator
public class Cliente extends Persona {
	
	//Atributos
	@BsonProperty("nroCliente")
	private int nroCliente;
	
	
	//Constructores
	public Cliente() {}
	
	public Cliente(int idPersona, int dni, String nombre, String apellido, String telefono, Domicilio domicilio,
			       int nroAfiliado, ObraSocial obraSocial,  int nroCliente) {
		
		super(idPersona, dni, nombre, apellido, telefono, domicilio, nroAfiliado, obraSocial);
		this.nroCliente = nroCliente;
	}
	
	
	//Getters y Setters
	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Cliente [nroCliente=" + nroCliente + "]";
	}
	
}
