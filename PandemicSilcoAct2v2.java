package pandemic;

import java.io.*;
import java.util.*;

public class PandemicSilcoAct2v2 {

    public static void main(String[] args) {
        String[] ciudad = new String[50]; //Array de strings que almacena las ciudades
        String[] coordenadas = new String[50]; //Array de strings que almacena las coordenadas
        String[] ciudadesColindantes = new String[50]; //Array de strings que almacena las ciudades colindantes
        String[] subCiudades = new String[50]; //Array de strings que almacena las ciudades
        String[] texto = new String[50]; //Array de strings que almacena el texto base separado por ";"
        int i = 0;
        //int coordenada1; // Variable int que almacena la coordenada antes de ","
        //int coordenada2; // Variable int que almacena la coordenada despues de ","

        FileReader fr = null;
        BufferedReader br;

        try {
            fr = new FileReader("C:\\Users\\JoanCS\\OneDrive\\Escritorio\\Recursos CIP\\ciudades.txt");
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                int coordenada1 = 0;
                int coordenada2 = 0;

                texto = linea.split(";");
                ciudad[i] = texto[0];
                coordenadas[i] = texto[2];
                System.out.print(texto[2]);
                ciudadesColindantes[i] = texto[3];
                subCiudades = ciudadesColindantes[i].split(",");

                String[] coordenadasSplit = coordenadas[i].split(",");
                
                coordenada1 = Integer.parseInt(coordenadasSplit[0]);
                coordenada2 = Integer.parseInt(coordenadasSplit[1]);
                //int x1 = coordenadasSplit[0];
                /*System.out.println("CORDENADA X " + coordenada1);
                System.out.println("CORDENADA Y " + coordenada2);*/
                
                
                FileWriter datos = new FileWriter("pandemic\\pandemic\\ciudadesRedactadas.txt",true);//Crear el fichero ciudadesRedactadas.txt
                System.out.print("La ciudad " + ciudad[i] + " está en las coordenadas " + coordenadas[i] + " sus ciudades colindantes son: \n");
                datos.write("La ciudad " + ciudad[i] + " está en las coordenadas " + coordenadas[i] + " sus ciudades colindantes son:");// Escribir una linea en el fichero
                
                	// Bucle que escribe por pantalla la ciudad colindate junto con la distancia
	                for (int j = 0; j < subCiudades.length; j++) {
	                    int distancia = calcularDistancia(coordenada1, coordenada2, j, i);
	                    System.out.println(subCiudades[j] + ", que está a una distancia de " + distancia);
	                    
	                    //datos.write(subCiudades[j] + ", que está a una distancia de " + distancia + "\n"); // Escribir los datos en el fichero
	                	//System.out.println(subCiudades[j]);
	                } 
                datos.close();//Cerrar el fichero
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    // Funcion que calcula la distancia entre ciudades
    public static int calcularDistancia(int x1, int y1, int x2, int y2) {
    	
    	//System.out.println(x2);
    	//System.out.println(x1);
        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}