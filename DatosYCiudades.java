package pandemic;

import java.io.*;
import java.util.*;

public class DatosYCiudades {

	public static void main(String[] args) {
		String []ciudad = new String[10];
		String []coordenadas = new String[10];
		String[] ciudadesCoolindantes = new String[10];
		String[] subCiudades = new String[20];
		String[] distancia = new String[10];
		int [] distanciaNueva = new int[10];
		String texto[] = new String[20];
		int i =0;
		int coordenada1;
		int coordenada2;
		
		FileReader fr = null;
		BufferedReader br;
		
		try {
			fr = new FileReader("C:\\Users\\JoanCS\\OneDrive\\Escritorio\\Recursos CIP\\ciudades.txt");
			br = new BufferedReader(fr);
			
			// Lectura del fichero
			String linea;
			while((linea = br.readLine())!= null) {
				coordenada1 = 0;
				coordenada2 = 0;
				
				texto = linea.split(";");
				ciudad[i] = texto[0];
				coordenadas[i] = texto[2];
				ciudadesCoolindantes[i] = texto[3];
				subCiudades = ciudadesCoolindantes[i].split(",");
				
				//Calcular la distancia
				distancia = coordenadas[i].split(",",2);
				coordenada1 = Integer.parseInt(distancia[i]); // Convertir se string a int
				coordenada2 = Integer.parseInt(distancia[i]); // Convertir se string a int
				distanciaNueva[i] = coordenada1 + coordenada2;
				
				System.out.println("La ciudad " + ciudad[i] + " está en las coordenadas " +  coordenadas[i] + " sus ciudades colindantes son: ");
				
				for(i=0; i<distanciaNueva.length; i++) {
					System.out.println(subCiudades[i] + ", que está a una distancia de " + distanciaNueva[i]);
				}
			}
			 
		}catch (IOException e) {
	        e.printStackTrace(System.out);
	    }	
	}

}
