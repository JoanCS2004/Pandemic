import java.io.*;
import java.util.Scanner;

public class ParametrosXML {
	public static void main(String arg[]) {

		Scanner teclado = new Scanner(System.in);

		// Declaramos las variables y las inicializamos
		int opcionMenu = 0;
		String NomFit = "parametros.xml";

		// Mostramos el menú
		while (opcionMenu != 3) {
			System.out.println("\n MENU");
			System.out.println("\n 1. Mostrar datos por pantalla.");
			System.out.println("\n 2. Sobreescribir los datos existentes.");
			System.out.println("\n 3. Salir del programa");
			// Permitimos la entrada de valor
			opcionMenu = teclado.nextInt();

			// En caso de que no se cumpla el rango
			if (opcionMenu < 1 || opcionMenu > 3) {
				System.out.println("Opcion Incorrecta");
			}

			// En caso de que se seleccione la opcion 1
			if (opcionMenu == 1) {
				teclado.nextLine();
				System.out.println("Se ha seleccionado mostrar datos por pantalla");
				System.out.println("\n");
				MostrarDatosXML();

			}
			// En caso de que se seleccione la opcion 2
			else if (opcionMenu == 2) {
				System.out.println("Se ha seleccionado Mostrar datos por pantalla");
				System.out.println("\n");
				IntroducirOtrosDatos(teclado);
			}
			// En caso de que se seleccione la opcion 3
			else if (opcionMenu == 3) {
				SalirPrograma();
			}
		}
	}

	// ************************************************************************************
	// ** Nombre de la función: MostrarDatos
	// ** Explicación del que hace la función: Muestra los datos personales
	// almacenados previamente
	// ** Parámetros de entrada: -----
	// ** Parámetros de salida: -----
	// ************************************************************************************
	public static void MostrarDatosXML() {
		String NomFit = "parametros.xml";
		// Creamos un String que va a contener todo el texto del archivo
		String s;
		try {
			// Abrir el fichero indicado en la variable nombreFichero
			FileReader fr = new FileReader(NomFit);
			BufferedReader br = new BufferedReader(fr);
			// En caso de que contenga un valor, se mostrara por pantalla
			do {
				s = br.readLine();
				if (s != null) {
					System.out.println(s);
				}
			} while (s != null);

			// Cerrar el fichero
			fr.close();
			br.close();
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}
	}

	// ************************************************************************************
	// ** Nombre de la función: IntroducirOtrosDatos
	// ** Explicación del que hace la función: Introduce y almacena datos personales
	// en un fichero existente
	// ** Parámetros de entrada: Scanner teclado
	// ** Parámetros de salida: -----
	// ************************************************************************************
	public static void IntroducirOtrosDatos(Scanner teclado) {
		String NomFit = "parametros.xml";
		// Creamos un String que va a contener todo el texto del archivo
		String texto = "";
		try {
			
			FileWriter fw = new FileWriter(NomFit, false);
			// Crear un objeto BufferedWriter
			BufferedWriter bw = new BufferedWriter(fw);
			// Escribimos el texto para el xml
			bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + "\r\n" + "<parametros>\r\n"
					+ "<numCiudadesInfectadasInicio>");
			// Pedimos por pantalla el nuevo numero, y lo añadimos al archivo
			System.out.print("Introduce el numero de las ciudades infectadas al inicio: ");
			texto = teclado.next();
			// Escrbir en el fichero el texto
			bw.write(texto);
			bw.write("</numCiudadesInfectadasInicio>");
			// Escribir en el fichero un salto de linea
			bw.newLine();

			bw.write("<numCiudadesInfectadasRonda>");
			// Pedimos por pantalla el nuevo numero, y lo añadimos al archivo
			System.out.print("Introduce el numero de las ciudades infectadas en la ronda: ");
			texto = teclado.next();
			// Escrbir en el fichero el texto
			bw.write(texto);
			bw.write("</numCiudadesInfectadasRonda>");
			// Escribir en el fichero un salto de linea
			bw.newLine();

			bw.write("<numEnfermedadesActivasDerrota>");
			// Pedimos por pantalla el nuevo numero, y lo añadimos al archivo
			System.out.print("Introduce el numero de las enfermedades activas para la derrota: ");
			texto = teclado.next();
			// Escrbir en el fichero el texto
			bw.write(texto);
			bw.write("</numEnfermedadesActivasDerrota>");
			// Escribir en el fichero un salto de linea
			bw.newLine();

			bw.write("<numBrotesDerrota>");
			// Pedimos por pantalla el nuevo numero, y lo añadimos al archivo
			System.out.print("Introduce el numero de brotes para la derrota: ");
			texto = teclado.next();
			// Escrbir en el fichero el texto
			bw.write(texto);
			bw.write("</numBrotesDerrota>");
			// Escribir en el fichero un salto de linea
			bw.newLine();

			bw.write("</parametros>");

			// Cerrar el buffer
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("ERROR! No se han podido introducir los datos: " + e);
		}
	}

	// ************************************************************************************
	// ** Nombre de la función: SalirPrograma
	// ** Explicación del que hace la función: Muestra un mensaje de salida al
	// usuario
	// ** Parámetros de entrada: -----
	// ** Parámetros de salida: -----
	// ************************************************************************************
	public static void SalirPrograma() {
		System.out.println("Saliendo del programa...");
	}

}