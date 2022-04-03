package clases_POJOs;

import java.time.LocalDate;
import java.util.List;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

@BsonDiscriminator
public class Venta {
	
	//Atributos
	@BsonId
	private String     idTicket;
	
	@BsonProperty("fecha")
	private LocalDate  fecha;
	
	@BsonProperty("total")
	private double     total;
	
	@BsonProperty("pago")
	private String     pago; //efectivo, tarjeta o débito
	
	@BsonProperty(useDiscriminator = true)
	private Empleado   vendedor;
	
	@BsonProperty(useDiscriminator = true)
	private Empleado   cajero;
	
	@BsonProperty(useDiscriminator = true)
	private Cliente    cliente;
	
	@BsonProperty(useDiscriminator = true)
	private List<Item> items;
	
	
	//Constructores
	public Venta() {}

	public Venta(String idTicket, LocalDate fecha, double total, String pago, Empleado vendedor, Empleado cajero,
       		     Cliente cliente, List<Item> items) {

		this.idTicket = idTicket;
		this.fecha = fecha;
		this.total = total;
		this.pago = pago;
		this.vendedor = vendedor;
		this.cajero = cajero;
		this.cliente = cliente;
		this.items = items;
	}

	
	//Getters y Setters
	public String getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public String getPago() {
		return pago;
	}
	public void setPago(String pago) {
		this.pago = pago;
	}

	public Empleado getVendedor() {
		return vendedor;
	}
	public void setVendedor(Empleado vendedor) {
		this.vendedor = vendedor;
	}

	public Empleado getCajero() {
		return cajero;
	}
	public void setCajero(Empleado cajero) {
		this.cajero = cajero;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItem() {
		return items;
	}
	public void setItem(List<Item> items) {
		this.items = items;
	}

	
	//toString
	@Override
	public String toString() {
		return "Venta [idTicket=" + idTicket + ", fecha=" + fecha + ", total=" + total + ", pago=" + pago
				+ ", vendedor=" + vendedor + ", cajero=" + cajero + ", cliente=" + cliente + ", item=" + items + "]";
	}
	
}
