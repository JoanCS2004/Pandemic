package pandemic;

import java.util.Scanner;

public class pandemic {

			public static void main(String[] args) {

				String adreça = " ";
				char [ ] direccion; 
				char [ ] pais = new char [100]; 
				int [ ] num1 = new int [100];
				int  [ ] num2 = new int [100]; 
				char [ ] ciutats = new char [100];
				int cont = 0;	
				int contador = 0;			

				
				Scanner prac = new Scanner(System.in);
				
				System.out.println("Introduiex la entrada de text (nombre_ciudad;numero;codigopostal;ciudades;)");
				adreça= prac.nextLine();
				
				for (int i = 0; i < adreça.length(); i++) { 
					if( adreça.charAt(i) == ';') {
						cont++;
					}
				}
				
				while( cont != 4) { 
					cont = 0;
					System.out.println("Dirreció incorrecta");
					System.out.println("Introduiex la teva dirreció (nombre_ciudad;numero;codigopostal;ciudades;) ");
					adreça= prac.nextLine();
					
					for (int i = 0; i < adreça.length(); i++) { 
						if( adreça.charAt(i) == ';') {
							cont++;
						}
					}
				}
				
				direccion = new char [adreça.length()]; 
				
				for (int i = 1; i <= adreça.length(); i++) { 
					contador++;
				}
				
				for (int i = 0; i < contador; i++) { 
					direccion[i] = adreça.charAt(i);
				}
				
				Descompon (direccion, pais, num1, num2, ciutats, contador); 
				
				
				for (int i = 0; i < 100; i++) { 
				}
				
				System.out.print("Silico actúa en ");
				for (int i = 0; i < 100; i++) { 
					if(pais[i] != ' ') {
						System.out.print(pais[i]);
					}
				}
				
				System.out.print("con los numeros ");
				for (int i = 0; i < 100; i++) { 
					if(num1[i] != ' ') {
						System.out.print(num1[i] + " ");
					}
				}
				
				System.out.print("con los numeros ");

				for (int i = 0; i < 100; i++) { 
					if(num2[i] != ' ') {
						System.out.print(num2[i]);
					}
				}
				
				
					
				
				
			} 
			
			//************************************************************************************
			//** Nombre de la función: Descompon
			//** Explicación del que hace la función: descopon la array dirrecion en tres diferents, en cada una se inclou per separat el carrer, numero i el codipostal
			//** Parámetros de entrada: char [ ] direccio, char [ ] carrer, char [ ] numero, char [ ] codipostal, int contador
			//** Parámetros de salida: void
			//************************************************************************************	
			public static void Descompon (char [ ] direccio, char [] pais, int [ ] num1, int [ ] num2, char [ ] ciudades, int contador) {
				
				int cont = 0;
				int num = 0;
				int codi = 0;
				
				
				for (int i = 0; i < contador; i++) { // repetir per numero de caracters
					
					if( direccio[i] == ';') { // si apareix un # sumar 1 al contador
						cont++;
					}
					
					if (cont == 0) { // si encara no ha aparegut cap # guardar les lletres en l'array de carrer
						pais[i] = direccio[i];
					}
					
					if (cont == 1) { // si ja ha aparegut un # i el carracter actual és diferent que # guardar en l'array de numero
						if( direccio[i] != ';') {
							num1[num] = direccio[i];
							num++; // sumar 1 per posició
						}
			
					}
					
					if (cont == 2) { // si ja ha aparegut 2 # i el carracter actual és diferent que # guardar en l'array de codipostal
						if( direccio[i] != ';') {
							num2[codi] = direccio[i];
							codi++; // sumar 1 per posició
						}
						
					}	
					if (cont == 3) { // si ja ha aparegut 2 # i el carracter actual és diferent que # guardar en l'array de codipostal
						if( direccio[i] != ';') {
							ciudades[codi] = direccio[i];
							codi++; // sumar 1 per posició
						}
						
					}
				}
				
			}
			
			
			

			
			
			
}