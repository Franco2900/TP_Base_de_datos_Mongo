package clases_POJOs;

import org.bson.codecs.pojo.annotations.*;

@BsonDiscriminator
public final class Producto {
	
	//Atributos
	@BsonId
	private int    codigo;
	
	@BsonProperty("nombre")
	private String nombre;

	@BsonProperty("precio")
	private double precio;
	
	@BsonProperty("descripcion")
	private String descripcion;
	
	@BsonProperty("medicamento")
	private boolean medicamento;// medicamento = true, perfumería = false
	
	
	//Constructores
	public Producto() {}

	public Producto(int codigo, String nombre, double precio, String descripcion, boolean medicamento) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.medicamento = medicamento;
	}


	//Getters y Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public boolean isMedicamento() {
		return medicamento;
	}
	public void setMedicamento(boolean medicamento) {
		this.medicamento = medicamento;
	}

	
	//toString
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", descripcion="
				+ descripcion + ", medicamento=" + medicamento + "]";
	}

}
