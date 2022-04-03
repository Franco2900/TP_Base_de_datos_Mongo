package clases_POJOs;

import org.bson.codecs.pojo.annotations.*;

@BsonDiscriminator
public class Empleado extends Persona{	
	
	//Atributos
	@BsonProperty("cuil")
	private String  cuil;
	
	@BsonProperty("sucursal")
	private int     sucursal;
	
	@BsonProperty("encargado")
	private boolean encargado;
	
	
	//Constructores
	public Empleado() {}
	
	public Empleado(int idPersona, int dni, String nombre, String apellido, String telefono, Domicilio domicilio,
			        int nroAfiliado, ObraSocial obraSocial, String cuil, int sucursal, boolean encargado) {
		
		super(idPersona, dni, nombre, apellido, telefono, domicilio, nroAfiliado, obraSocial);
		this.cuil = cuil;
		this.sucursal = sucursal;
		this.encargado = encargado;
	}
	
	
	//Getters y Setters
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	
	public int getSucursal() {
		return sucursal;
	}
	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}
	
	public boolean isEncargado() {
		return encargado;
	}
	public void setEncargado(boolean encargado) {
		this.encargado = encargado;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Empleado [cuil=" + cuil + ", sucursal=" + sucursal + ", encargado=" + encargado + "]";
	}

}
