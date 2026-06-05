package data;
import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellidos;
	private String telefono;
	private String correo;
	
	// Constructor
	public Cliente(String nombre, String apellidos, String telefono, String correo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public String getNombreCompleto() {
		return nombre + " " + apellidos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
