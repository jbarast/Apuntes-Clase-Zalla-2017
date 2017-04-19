package apuntesZalla2017.laboratoriosLibroJava7.programas;

//imports.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * <h1>LeerArchivoTexto</h1>
 * 
 * <p>
 * Esta clase lo que hara, es ver si existe un archivo con el nombre
 * baseDatosLibros.txt. Si no existe lo crea y si existe lo lee.
 * </p>
 * 
 * <p>
 * La informacion leeida la convierte en un Array de libros.java
 * </p>
 * 
 * @author jbarast
 * @version 19/04/2017
 * 
 */
public class LeerArchivoTexto {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// muestraContenido("Agenda.txt");
		System.out.println(muestraContenido("Agenda.txt"));

		escribirContenidoAgandeTXT("Agenda.txt");

		System.out.println(muestraContenido("Agenda.txt"));
	}

	/**
	 * 
	 * <h1>muestraContenido</h1>
	 * 
	 * <p>
	 * Metodo que lee un archivo de texto.
	 * </p>
	 * 
	 * 
	 * @param archivo
	 *            Archivo que queremos leer.
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static ArrayList<String> muestraContenido(String archivo) throws FileNotFoundException, IOException {
		String cadena; // "Datos" del archivo de texto.
		FileReader archiALeer = new FileReader(archivo);
		BufferedReader bufferDatosArchivo = new BufferedReader(archiALeer);

		// Variables que necesitare, para hacer el array.

		ArrayList<String> librosArrayList = new ArrayList<String>();

		// Leemos linea a linea hasta que detecte una vacia.
		while ((cadena = bufferDatosArchivo.readLine()) != null) {
			// System.out.println(cadena);
			librosArrayList.add(cadena);
		}
		bufferDatosArchivo.close();

		return librosArrayList;
	}

	/**
	 * 
	 * <h1>escribirContenidoAgendaTxt</h1>
	 * <p>
	 * Con esta funcion metemos los datos en la variable
	 * </p>
	 * 
	 * @param archivo
	 *            nombre del archivo agenda.
	 */
	public static void escribirContenidoAgandeTXT(String archivo) {
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
