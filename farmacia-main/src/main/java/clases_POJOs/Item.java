package clases_POJOs;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonProperty;

@BsonDiscriminator
public class Item {
	
	//Atributos
	@BsonProperty(useDiscriminator = true)
	private Producto producto;
	
	@BsonProperty("cantidad")
	private int      cantidad;
	
	
	//Constructores
	public Item() {}
	
	public Item(Producto producto, int cantidad) {
		
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	
	//Getters y Setters
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	@Override
	public String toString() {
		return "Item [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
}
