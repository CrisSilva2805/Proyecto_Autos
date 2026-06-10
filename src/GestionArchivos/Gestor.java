package GestionArchivos;

import data.coche;
import data.CocheTuneado;
import data.Venta;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gestor {
	
	public Gestor(){
		
	}
	
	public boolean accesoUsuarios(String usuarioUser, String usuarioPassword, String usuarioEmail) {
		String rutaArchivo= "src/GestionArchivos/usuarios.txt";
		String linea;
		boolean accesoConfirm=false;
		
		try(BufferedReader br=new BufferedReader(new FileReader(rutaArchivo))){
			while((linea= br.readLine())!=null) {
				if (linea.trim().isEmpty()) continue;
				
					String[] datos = linea.split(",");
				
								
					if(datos.length == 3) {
						String userTxt = datos[0].trim();
						String passTxt = datos[1].trim();
						String emailTxt = datos[2].trim();
						if(userTxt.equals(usuarioUser) && passTxt.equals(usuarioPassword) && emailTxt.equals(usuarioEmail)) {
						accesoConfirm=true;
						break;
						}
				
					}
			}
			
			}catch(IOException ex) {
				JOptionPane.showMessageDialog(null, "Error al abrir el archivo de usuarios: " + ex.getMessage());
			}
			return accesoConfirm;
		
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<coche> leerStock() {
		ArrayList<coche> lista = new ArrayList<>();
		File f = new File("src/stock_" + data.Sesion.usuarioLogeado +".dat");
		if (!f.exists()) return lista;
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			lista = (ArrayList<coche>) ois.readObject();
		} catch (Exception ex) {
			System.out.println("Error al leer el stock: " + ex.getMessage());
		}
		
		return lista;
	}
	
	public boolean actualizarStock(ArrayList<coche> listaActualizada) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/stock_" + data.Sesion.usuarioLogeado + ".dat"))) {
			oos.writeObject(listaActualizada);
			return true;
		} catch (Exception ex) {
			System.out.println("Error al actualizar stock: " + ex.getMessage());
			return false;
		}
	}
	
	public boolean registrarVenta(Venta nuevaVenta) {
		try (FileWriter fw = new FileWriter("src/GestionArchivos/ventas_" + data.Sesion.usuarioLogeado + ".txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			
			out.println(nuevaVenta.generarRegistroTxt());
			return true;
		} catch (IOException e) {
			System.out.println("Error al registrar venta: " + e.getMessage());
			return false;
		}
	}
	
	public void leerVentas() {
		String rutaArch = "src/GestionArchivos/ventas_" + data.Sesion.usuarioLogeado + ".txt";
		String rutaReporte = "src/GestionArchivos/ReporteVentas_" + data.Sesion.usuarioLogeado + ".txt";
		String linea;
		
		java.io.File f = new java.io.File(rutaArch);
		if(!f.exists()) {
			JOptionPane.showMessageDialog(null, "No hay ventas registradas para el usuario: " + data.Sesion.usuarioLogeado);
			return;
		}

		try (BufferedReader br = new BufferedReader(new FileReader(rutaArch));
			 FileWriter fw = new FileWriter(rutaReporte, false);
			 BufferedWriter bw = new BufferedWriter(fw);
			 PrintWriter out = new PrintWriter(bw)) {
			
			out.println("================ REPORTE DE VENTAS - " + data.Sesion.usuarioLogeado.toUpperCase() + " ================");

			while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty()) continue;

				String[] datos = linea.split(",");

				String ID = datos.length > 0 ? datos[0] : "";
				String fecha = datos.length > 1 ? datos[1] : "";
				String nombre = datos.length > 2 ? datos[2] : "";
				String correo = datos.length > 3 ? datos[3] : "";
				String numero = datos.length > 4 ? datos[4] : "";
				String idAuto = datos.length > 5 ? datos[5] : "";
				String marcaAuto = datos.length > 6 ? datos[6] : "";
				String modeloAuto = datos.length > 7 ? datos[7] : "";
				String anioAuto = datos.length > 8 ? datos[8] : "";
				String transmision = datos.length > 9 ? datos[9] : "";
				String totalCobrado = datos.length > 10 ? datos[10] : "";

				String detalles = "";
				if (datos.length > 11) {
					detalles = "Tuning: ";
					for (int i = 11; i < datos.length; i++) {
						detalles += datos[i] + " | ";
					}
				}

				out.println("-----------------------------------------------------------------------");
				out.print("Ticket: " + ID); out.print("\t"); out.println("Fecha: " + fecha);
				out.print("Cliente: " + nombre); out.print("\t"); out.println("Correo: " + correo);
				out.println("Tel: " + numero);
				out.print("Auto ID: " + idAuto); out.print("\t"); out.println(marcaAuto + " " + modeloAuto + " (" + anioAuto + ")");
				out.println("Transmision: " + transmision + "\t\tTotal Pagado: $" + totalCobrado);
				
				if (!detalles.isEmpty()) {
					out.println(detalles);
				}
			}
			
			try {
				java.awt.Desktop.getDesktop().open(new java.io.File(rutaReporte));
			} catch (Exception e) {
				System.out.println("No se pudo abrir el archivo automáticamente.");
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al generar reporte: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<data.CocheTuneado> leerCochesTuneados() {
		ArrayList<data.CocheTuneado> lista = new ArrayList<>();
		
		File f = new File("src/coches_tuneados_" + data.Sesion.usuarioLogeado + ".dat");
		if (!f.exists()) return lista;
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			lista = (ArrayList<data.CocheTuneado>) ois.readObject();
		} catch (Exception e) { }
		return lista;
	}
	
	public boolean registrarCocheTuneado(data.CocheTuneado cocheTuneado) {
		ArrayList<data.CocheTuneado> listaActual = leerCochesTuneados();
		listaActual.add(cocheTuneado);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/coches_tuneados_" + data.Sesion.usuarioLogeado + ".dat"))) {
			oos.writeObject(listaActual);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void makeReporteStock() {
		ArrayList<CocheTuneado> listaTuneado = new ArrayList<>();
		ArrayList<coche> listaNormal = new ArrayList<>();
		listaTuneado = leerCochesTuneados();
		listaNormal = leerStock();
		
		String rutaReporte = "src/GestionArchivos/ReporteStock_" + data.Sesion.usuarioLogeado + ".txt";

		try (FileWriter fw = new FileWriter(rutaReporte, false);
			 BufferedWriter bw = new BufferedWriter(fw);
			 PrintWriter out = new PrintWriter(bw)) {

			out.println("================ REPORTE DE STOCK - " + data.Sesion.usuarioLogeado.toUpperCase() + " ================");
			
			out.println("\n--- Autos Normales ---");
			for (coche auxCoche : listaNormal) {
				out.println(auxCoche.enviarReporte());
			}
			
			out.println("\n--- Coches Tuneados ---");
			for (CocheTuneado auxTuneado : listaTuneado) {
				out.println(auxTuneado.enviarTReporte());
			}
			
			try {
				java.awt.Desktop.getDesktop().open(new java.io.File(rutaReporte));
			} catch (Exception e) {
				System.out.println("No se pudo abrir el archivo automáticamente.");
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al abrir el archivo: " + e.getMessage());
			e.printStackTrace();
		}
	}
			
	public boolean actualizarStockTuneados(ArrayList<data.CocheTuneado> listaActualizada) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/coches_tuneados_" + data.Sesion.usuarioLogeado + ".dat"))) {
			oos.writeObject(listaActualizada);
			return true;
		} catch (Exception ex) {
			System.out.println("Error al actualizar stock tuneado: " + ex.getMessage());
			return false;
		}
	}

}
