package apuntesZalla2017.laboratoriosLibroJava7.programas.entradaSalidasFicheros;

//imports.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * <h1>GenerarFicheroTexto</h1>
 * <p>
 * Esta clase muestra como crear un fichero de texto. La cual crea una agenda, con nombres y sus respectivos telefonos.
 * </p>
 * <p>
 * Codigo mostrado en la pagina 193 del libro java7.
 * </p>
 * 
 * 
 * @author LibroJava7
 * @author jbarast
 * @version 18/04/2017
 * 
 *
 */
public class GeneraFicheroTexto {

	public static void main(String[] args) {

		// variables.
		String nombreContacto; //Nombre a meter en la agenda

		// Creamos el scanner.
		Scanner scanner;
		scanner = new Scanner(System.in);

		// //
		try {
			// Creamos algo?
			FileWriter ficheroAEscribir; // Mirar que es la s.
			ficheroAEscribir = new FileWriter("Agenda.txt");

			BufferedWriter flujoDeEscritura; // Cambiar el nombre.
			flujoDeEscritura = new BufferedWriter(ficheroAEscribir);

			do {
				System.out.print("Introduce un nombre (Intro para terminar): ");
				nombreContacto = scanner.nextLine();

				if (nombreContacto.length() > 0) {
					System.out.print("Telefono: ");
					String telefonoDelContacto = scanner.nextLine();
					flujoDeEscritura.write(nombreContacto + "," + telefonoDelContacto);
					flujoDeEscritura.newLine();
				}

			} while (nombreContacto.length() > 0);
			flujoDeEscritura.close();

		} catch (IOException iOException) {
			System.out.println("Error en el fichero");
		}

	}

}
