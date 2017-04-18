package apuntesZalla2017.laboratoriosLibroJava7.programas.entradaSalidasFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

//imports.
/**
 * 
 * <h1>AtributosFichero</h1>
 * <p>
 * El programa AtributosFichero muestra los atributos de un directorio
 * especificado por el usuario. El programa solicita el nombre de un fichero.
 * Con este nombre crea un objeto de la clase File. Sobre este objeto se
 * ejecutan los metodos getName y getPath para investigar el nombre y el
 * direcotorio en el que esta el fichero. Los metodos canRead y canWrite
 * investigan si puede leer y modificar. El metodo length investigan el tamaño
 * de ficheros bytes
 * </p>
 * 
 * @author libro7
 * @author jbarast
 * @version 18/04/2017
 *
 */
public class AtributosFichero {

	public static void main(String[] args) {

		// variables
		String nombreFichero;

		InputStreamReader flujo;
		flujo = new InputStreamReader(System.in);

		BufferedReader teclado;
		teclado = new BufferedReader(flujo);

		// ///
		try {
			// Recogemos la ruta del fichero.
			System.out.println("Introduce el nombre del fichero: ");
			nombreFichero = teclado.readLine();
			File fichero;
			fichero = new File(nombreFichero);

			// Imprimimos los datos del fichero.
			System.out.println(String.format("Nombre: %s", fichero.getName()));
			System.out.println(String.format("Camino: %s", fichero.getPath()));

			//
			if (fichero.exists()) {
				System.out.println("El fichero existe.");

				if (fichero.canRead()) {
					System.out.println("El fichero se puede leer.");

					if (fichero.canWrite()) {
						System.out.println("Se puede modificar el archivo.");
						System.out.println(String.format("La longitud del fichero es: %d bytes", fichero.length()));

					}
				}
			} else
				System.out.println("El fichero no existe.");

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

	}
}
