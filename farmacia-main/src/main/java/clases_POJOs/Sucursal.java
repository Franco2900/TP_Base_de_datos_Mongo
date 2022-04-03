package clases_POJOs;

import java.util.List;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

@BsonDiscriminator
public class Sucursal {
	
	//Atributos
	@BsonId
	private int         idSucursal;
	
	@BsonProperty(useDiscriminator = true)
	private Domicilio   domicilio;
	
	@BsonProperty(useDiscriminator = true)
	private List<Venta> ventas;
	
	
	//Constructores
	public Sucursal() {}
	
	public Sucursal(int idSucursal, Domicilio domicilio, List<Venta> ventas) {
		
		this.idSucursal = idSucursal;
		this.domicilio = domicilio;
		this.ventas = ventas;
	}
		
	
	//Getters y Setters
	public int getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	public List<Venta> getVentas() {
		return ventas;
	}
	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", domicilio=" + domicilio + ", ventas=" + ventas + "]";
	}
	
}
