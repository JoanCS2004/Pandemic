package pandemic;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PandemicACT2B {
	public static void main(String[] args) {
		String nombreFichero = "CCP.bin";//Nombre del fichero binario a leer
		
		try {
			//Creamos este objeto para poder abrir un fichero de tipo binario
			FileInputStream fileInputStream = new FileInputStream(nombreFichero);
			//Creamos este objeto para poder traducir el código binario a Java
			DataInputStream dataInputStream = new DataInputStream(fileInputStream);
			
			//Lo utilizamos para crear el fichero a partir del nombre
			FileOutputStream fileOutputStream = new FileOutputStream("ciudades-enfermedad.bin");
			//Este objeto traduce todos los datos de Java a binario
			DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
			
			//Leemos un dato de tipo String
			String instrucciones = dataInputStream.readUTF();
			System.out.println(instrucciones);
			
			int[]a1 = new int[4];		
			
			// Leer el fichero ciudades.txt para obtener los datos
			String[] ciudad = new String[50]; //Array de strings que almacena las ciudades
	        String[] coordenadas = new String[50]; //Array de strings que almacena las coordenadas
	        String[] ciudadesColindantes = new String[50]; //Array de strings que almacena las ciudades colindantes
	        String[] subCiudades = new String[50]; //Array de strings que almacena las ciudades
	        String[] texto = new String[50]; //Array de strings que almacena el texto base separado por ";"
	        String[] enfermedad = new String[4];
	        String[] a2 = new String[4];
	                
	        int i = 0;
			FileReader fr;
            BufferedReader br;
            fr = new FileReader("ciudades.txt");
            br = new BufferedReader(fr);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                int coordenada1 = 0;
                int coordenada2 = 0;
                int nEnfermedad = 0;
                String[]enfermedad2 = new String[4];
                String enfermedadA = enfermedad2[0];
                String enfermedadB = enfermedad2[1];
                String enfermedadC = enfermedad2[2];
                String enfermedadD = enfermedad2[3];

                texto = linea.split(";"); //Dividir la linea al encontrar un ;
                ciudad[i] = texto[0];
                enfermedad[i] = texto[1];
                nEnfermedad = Integer.parseInt(enfermedad[i]); // Transformar la cadena enfermedad en un entero

                dataOutputStream.writeUTF("La ciudad " + ciudad[i] + " tiene la enfermedad"); //Escribir una cadena en el fichero binario
                System.out.print("La ciudad " + ciudad[i] + " tiene la enfermedad"); //Mostrar por pantalla cada ciudad con su enfermedad
                
                // Dependiendo del numero de enfermedad, se escribira por pantalla una enfermedad u otra
                if(nEnfermedad == 0) {
                	System.out.print(" Alfa\n"); 
                	dataOutputStream.writeUTF(" Alfa\n");
                }
                
                else if(nEnfermedad == 1) {
                	System.out.print(" Beta\n");
                	dataOutputStream.writeUTF(" Beta\n");
                }
                
                else if(nEnfermedad == 2) {
                	System.out.print(" Gama\n");
                	dataOutputStream.writeUTF(" Gama\n");
                }
                
                else if(nEnfermedad == 3) {
                	System.out.print(" Delta\n");
                	dataOutputStream.writeUTF(" Delta\n");
                }
                
            }
            dataOutputStream.close();
		}catch (IOException e1) {
			System.out.println("Fichero leido correctamente");
		}
	}	
}
