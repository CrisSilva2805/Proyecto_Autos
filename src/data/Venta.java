package data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venta {
	
	private String idVenta;
	private String fechaHora;
	private Cliente comprador;
	private coche autoVendido;
	private float total;
	
	public Venta(String idVenta, Cliente comprador, coche autoVendido) {
		this.idVenta = idVenta;
		this.comprador = comprador;
		this.autoVendido = autoVendido;
		this.total = autoVendido.getPrecioBase();
		
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		this.fechaHora = ahora.format(formato);
	}
	
	public String generarRegistroTxt() {
		return idVenta + "," +
			fechaHora + "," +
			comprador.getNombreCompleto() + "," +
			comprador.getCorreo() + "," +
			comprador.getTelefono() + "," +
			autoVendido.getId() + "," +
			autoVendido.getMarca() + "," +
			autoVendido.getModelo() + "," +
			autoVendido.getAnio() + "," +
			autoVendido.getTransmision() + "," +
			total;
	}
}
