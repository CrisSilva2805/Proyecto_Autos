package GestionArchivos;

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

}
