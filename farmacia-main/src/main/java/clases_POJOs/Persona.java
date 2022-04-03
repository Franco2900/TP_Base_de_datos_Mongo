package clases_POJOs;

import org.bson.codecs.pojo.annotations.*;

@BsonDiscriminator
public class Persona {
	
	//Atributos
	@BsonId
	private int        idPersona;
	
	@BsonProperty("dni")
	private int        dni;
	
	@BsonProperty("nombre")
	private String     nombre;
	
	@BsonProperty("apellido")
	private String     apellido;
	
	@BsonProperty("telefono")
	private String     telefono;
	
	@BsonProperty(useDiscriminator = true)
	private Domicilio  domicilio;
	
	@BsonProperty("nroAfiliado")
	private int        nroAfiliado;
	
	@BsonProperty(useDiscriminator = true)
	private ObraSocial obraSocial;
	
	
	//Constructores
	public Persona() {}

	public Persona(int idPersona, int dni, String nombre, String apellido, String telefono, Domicilio domicilio,
			       int nroAfiliado, ObraSocial obraSocial) {
		
		this.idPersona = idPersona;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.nroAfiliado = nroAfiliado;
		this.obraSocial = obraSocial;
	}

	
	//Getters y Setters
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public int getNroAfiliado() {
		return nroAfiliado;
	}
	public void setNroAfiliado(int nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}

	public ObraSocial getObraSocial() {
		return obraSocial;
	}
	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	
	//toString
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", domicilio=" + domicilio + ", nroAfiliado=" + nroAfiliado
				+ ", obraSocial=" + obraSocial + "]";
	}
	
}
