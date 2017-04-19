package apuntesZalla2017.laboratoriosLibroJava7.programas.entradaSalidasFicheros;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * <h1>LeeFicheros</h1>
 * 
 * <p>
 * Muestra como leer un fichero con la clase Scanner.Codigo en la pagina 203.
 * </p>
 * 
 * 
 * @author libroJava7
 * @author jbarast
 *
 */
public class LeeFicheros {

	public static void main(String[] args) {

		try {
			Scanner scanner;
			scanner = new Scanner(new File("LeeFicheros.java"));

			while (scanner.hasNextLine()) {
				String texto = scanner.nextLine();
				System.out.println(texto);
			}

		} catch (Exception exception) {
		}
	}
}
