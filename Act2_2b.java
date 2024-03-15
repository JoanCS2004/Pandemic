package PrimeresAct;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

	//************************************************************************************
	//** Nombre de la función: main
	//** Explicación del que hace la función: Punto de entrada del programa.
	//** Parámetros de entrada: args - Argumentos de la línea de comandos.
	//** Parámetros de salida: Ninguno.
	//************************************************************************************

public class Act2 {
	public static void main(String[] args) {
		String archivoEntrada = "ciudades.txt";
		String archivoSalida = "ciudadesRedactadas.txt";

		ArrayList<String[]> ciudades = leerCiudades(archivoEntrada);
		escribirCiudadesRedactadas(ciudades, archivoSalida);
		mostrarCiudadesRedactadas(ciudades);

	}

	// ************************************************************************************
	// ** Nombre de la función: leerCiudades
	// ** Explicación del que hace la función: Lee las ciudades desde un archivo.
	// ** Parámetros de entrada: archivoEntrada - Nombre del archivo de entrada.
	// ** Parámetros de salida: ArrayList<String[]> - Lista de ciudades.
	// ************************************************************************************

	public static ArrayList<String[]> leerCiudades(String archivoEntrada) {
		ArrayList<String[]> ciudades = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				ciudades.add(linea.split(";"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ciudades;
	}

	public static void escribirCiudadesRedactadas(ArrayList<String[]> ciudades, String archivoSalida) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {
			for (String[] ciudad : ciudades) {
				String nombreCiudad = ciudad[0];
				double x = Double.parseDouble(ciudad[2].split(",")[0]);
				double y = Double.parseDouble(ciudad[2].split(",")[1]);
				String[] ciudadesColindantes = ciudad[3].split(",");

				String mensaje = "La ciudad " + nombreCiudad + " está en las coordenadas (" + x + ", " + y
						+ ") sus ciudades colindantes son:";
				bw.write(mensaje);
				bw.newLine();
				System.out.println(mensaje);

				for (String otraCiudad : ciudadesColindantes) {
					if (!otraCiudad.isEmpty()) {
						double distancia = calcularDistancia(ciudades, nombreCiudad, otraCiudad);
						mensaje = otraCiudad + ", que está a una distancia de " + distancia;
						bw.write(mensaje);
						bw.newLine();
						System.out.println(mensaje);
					}
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
        }
    }

    public static void mostrarCiudadesRedactadas(ArrayList<String[]> ciudades) {
        for (String[] ciudad : ciudades) {
            String nombreCiudad = ciudad[0];
            double x = Double.parseDouble(ciudad[2].split(",")[0]);
            double y = Double.parseDouble(ciudad[2].split(",")[1]);
            String[] ciudadesColindantes = ciudad[3].split(",");

            String mensaje = "La ciudad " + nombreCiudad + " está en las coordenadas (" + x + ", " + y
                    + ") sus ciudades colindantes son:";
            System.out.println(mensaje);

            for (String otraCiudad : ciudadesColindantes) {
                if (!otraCiudad.isEmpty()) {
                    double distancia = calcularDistancia(ciudades, nombreCiudad, otraCiudad);
                    mensaje = otraCiudad + ", que está a una distancia de " + distancia;
                    System.out.println(mensaje);
                }
            }
            System.out.println();
        }
    }

    public static double calcularDistancia(ArrayList<String[]> ciudades, String ciudad1, String ciudad2) {
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;

        for (String[] ciudad : ciudades) {
            if (ciudad[0].equals(ciudad1)) {
                x1 = Double.parseDouble(ciudad[2].split(",")[0]);
                y1 = Double.parseDouble(ciudad[2].split(",")[1]);
            } else if (ciudad[0].equals(ciudad2)) {
                x2 = Double.parseDouble(ciudad[2].split(",")[0]);
                y2 = Double.parseDouble(ciudad[2].split(",")[1]);
            }
        }

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
