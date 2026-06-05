package data;
import java.io.Serializable;

public class coche implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	protected int id;
	protected String marca;
	protected String modelo;
	protected int anio;
	protected String transmision;
	protected String color;
	protected float precioBase;
	protected int cantidad;
	
	// constructor
	public coche(int id, String marca, String modelo, int anio, String color, float precioBase, int cantidad) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.color = color;
		this.precioBase = precioBase;
		this.cantidad = cantidad;
		this.transmision = "Manual"; // Default se puede omitir si no está en la vista
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getTransmision() {
		return transmision;
	}
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}
	
	public String mostrarInfo() {
		return "ID: "+ id + " | " + marca + " | " + modelo + " | " + " | (" + anio + ") | Color: " + color + " | Precio: $" + precioBase + " | Cantidad: " + cantidad + " | Transmisión: " + transmision;
	}
	public Object getCantidad() {
		return cantidad;
	}

}
