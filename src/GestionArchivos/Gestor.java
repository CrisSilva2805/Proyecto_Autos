package GestionArchivos;

import data.coche;
import data.CocheTuneado;
import data.Venta;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
		File f = new File("src/stock.dat");
		if (!f.exists()) return lista;
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			lista = (ArrayList<coche>) ois.readObject();
		} catch (Exception ex) {
			System.out.println("Error al leer el stock: " + ex.getMessage());
		}
		
		return lista;
	}
	
	public boolean actualizarStock(ArrayList<coche> listaActualizada) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/stock.dat"))) {
			oos.writeObject(listaActualizada);
			return true;
		} catch (Exception ex) {
			System.out.println("Error al actualizar stock: " + ex.getMessage());
			return false;
		}
	}
	
	public boolean registrarVenta(Venta nuevaVenta) {
		try (FileWriter fw = new FileWriter("src/GestionArchivos/ventas.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			
			out.println(nuevaVenta.generarRegistroTxt());
			return true;
		} catch (IOException e) {
			System.out.println("Error al registrar venta: " + e.getMessage());
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<data.CocheTuneado> leerCochesTuneados() {
		ArrayList<data.CocheTuneado> lista = new ArrayList<>();
		
		File f = new File("src/coches_tuneados.dat");
		if (!f.exists()) return lista;
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			lista = (ArrayList<data.CocheTuneado>) ois.readObject();
		} catch (Exception e) { }
		return lista;
	}
	
	public boolean registrarCocheTuneado(data.CocheTuneado cocheTuneado) {
		ArrayList<data.CocheTuneado> listaActual = leerCochesTuneados();
		listaActual.add(cocheTuneado);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/coches_tuneados.dat"))) {
			oos.writeObject(listaActual);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean actualizarStockTuneados(ArrayList<data.CocheTuneado> listaActualizada) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/coches_tuneados.dat"))) {
			oos.writeObject(listaActualizada);
			return true;
		} catch (Exception ex) {
			System.out.println("Error al actualizar stock tuneado: " + ex.getMessage());
			return false;
		}
	}

}
