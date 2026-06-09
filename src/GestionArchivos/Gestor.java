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
	
	public void leerVentas() {
		String rutaArch = "src/GestionArchivos/ventas.txt";
		String linea;
		try(BufferedReader br = new BufferedReader(new FileReader(rutaArch))){
			while((linea=br.readLine()) !=null) {
				if(linea.trim().isEmpty())continue;
				
				String[] datos = linea.split(",");
				
				String ID= datos[0];
				String fecha= datos[1];
				String nombre = datos[2];
				String correo = datos [3];
				String numero = datos[4];
				String cantidad = datos [5];
				String marcaAuto = datos[6];
				String detalles =" ";
				
				int i=7;
				while((datos[i].isEmpty())||(datos[i].equals(" "))) {
					detalles = datos[i];
					i++;
				}
				
				
				
				try (FileWriter fw = new FileWriter("src/GestionArchivos/ReporteVentas.txt",true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter out =new PrintWriter(bw)) {
							out.println ("-----------------------------------------------------------------------");
							out.print(ID); out.print("\t"); out.println(fecha);
							out.print(nombre); out.print("\t");out.println(correo);
							out.println(numero);
							out.print(cantidad); out.print("\t"); out.println(marcaAuto);
							out.print(detalles);
							
						}
				catch (IOException e) {
					JOptionPane.showMessageDialog(null,"Error al generar reporte:" + e.getMessage());
				}
			}
			
		
		} 
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al abrir el archivo:" + e.getMessage());
			e.printStackTrace();
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
	
	public void makeReporteStock() {
		ArrayList<CocheTuneado> listaTuneado = new ArrayList<>();
		ArrayList<coche> listaNormal = new ArrayList<>();
		listaTuneado = leerCochesTuneados();
		listaNormal = leerStock();
		
		try(FileWriter fw = new FileWriter("src/GestionArchivos/ReporteStock.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)){
			out.println ("Autos Normales ");
			for(coche auxCoche : listaNormal){
				out.println(auxCoche.enviarReporte());
			}
			out.println(" \n Coches Tuneados:");
			for(CocheTuneado auxTuneado : listaTuneado) {
				out.println(auxTuneado.enviarTReporte());
			}
			
		}
		catch(IOException e){
			JOptionPane.showMessageDialog(null, "Error al abrir el archivo:" + e.getMessage());
			e.printStackTrace();
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
