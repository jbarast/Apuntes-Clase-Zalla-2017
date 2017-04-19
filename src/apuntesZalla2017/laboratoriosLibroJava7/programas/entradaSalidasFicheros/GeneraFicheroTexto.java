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
 * Esta clase muestra como crear un fichero de texto.
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
		String nombre;

		// Creamos el scanner.
		Scanner scanner;
		scanner = new Scanner(System.in);

		// //
		try {
			// Creamos algo?
			FileWriter fileWriterS; // Mirar que es la s.
			fileWriterS = new FileWriter("Agenda.txt", true);

			BufferedWriter fs; // Cambiar el nombre.
			fs = new BufferedWriter(fileWriterS);

			do {
				System.out.print("Introduce un nombre (Intro para terminar): ");
				nombre = scanner.nextLine();

				if (nombre.length() > 0) {
					System.out.print("Telefono: ");
					String telefono = scanner.nextLine();
					fs.write(nombre + "," + telefono);
					fs.newLine();
				}

			} while (nombre.length() > 0);
			fs.close();

		} catch (IOException iOException) {
			System.out.println("Error en el fichero");
		}

	}

}
