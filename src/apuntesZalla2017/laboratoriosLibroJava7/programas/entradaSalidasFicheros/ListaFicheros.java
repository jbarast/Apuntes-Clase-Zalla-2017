package apuntesZalla2017.laboratoriosLibroJava7.programas.entradaSalidasFicheros;

import java.io.File;
import java.util.Scanner;

//imports

/**
 * 
 * <h1>ListaFicheros</h1>
 * 
 * <p>
 * Muestra la lista de ficheros de un direcctorio.
 * </p>
 * <p>
 * Codigo basado en el codigo de la pagina 189 del libro de Java7.
 * </p>
 * 
 * @author libroJava7
 * @author jbarast
 * @version 18/04/2017
 *
 */
public class ListaFicheros {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Variables.
		String directorioUsuarioString;

		// Creamos la clase scanner:
		Scanner scanner;
		scanner = new Scanner(System.in);

		// Pedimos el direcctorio.
		System.out.println("Mete un directorio: ");
		directorioUsuarioString = scanner.nextLine();

		File direcctorioUsuario;
		direcctorioUsuario = new File(directorioUsuarioString);

		File[] lista = direcctorioUsuario.listFiles();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

	}

}
