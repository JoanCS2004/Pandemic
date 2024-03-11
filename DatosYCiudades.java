package pandemic;

import java.io.*;
import java.util.*;

public class DatosYCiudades {

	public static void main(String[] args) {
		String []ciudad = new String[50];
		String []coordenadas = new String[50];
		String[] ciudadesCoolindantes = new String[50];
		String[] subCiudades = new String[50];
		String[] distancia = new String[50];
		int [] distanciaNueva = new int[50];
		String texto[] = new String[50];
		int i =0;
		int []coordenada1 = new int [50];
		int []coordenada2 = new int [50];
		
		FileReader fr = null;
		BufferedReader br;
		
		try {
			fr = new FileReader("C:\\Users\\JoanCS\\OneDrive\\Escritorio\\Recursos CIP\\ciudades.txt");
			br = new BufferedReader(fr);
			
			// Lectura del fichero
			String linea;
			while((linea = br.readLine())!= null) {
				texto = linea.split(";");
				ciudad[i] = texto[0];
				coordenadas[i] = texto[2];
				ciudadesCoolindantes[i] = texto[3];
				subCiudades = ciudadesCoolindantes[i].split(",");
				
				//Calcular la distancia
				distancia = coordenadas[i].split(",");
				coordenada1[i] = Integer.parseInt(distancia[i]); // Convertir de string a int
				coordenada2[i] = Integer.parseInt(distancia[i]); // Convertir de string a int
				System.out.println("La ciudad " + ciudad[i] + " está en las coordenadas " +  coordenadas[i] + " sus ciudades colindantes son: ");
				
				for(i=0; i<distancia.length; i++) {
					System.out.println(subCiudades[i] + ", que está a una distancia de " + distanciaNueva[i]);
				}
			}
			 
		}catch (IOException e) {
	        System.out.println("error");;
	    }	
	}

}
