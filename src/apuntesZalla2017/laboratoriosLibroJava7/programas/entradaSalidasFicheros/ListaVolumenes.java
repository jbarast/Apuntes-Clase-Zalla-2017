package apuntesZalla2017.laboratoriosLibroJava7.programas.entradaSalidasFicheros;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * <h1>ListaVolumenes</h1>
 * <p>
 * Fichero ListaVolumenes.java. Muestra la lista de directorios raiz del
 * ordenador. Nos muestra que discos duros tenemos.
 * </p>
 * 
 * <p>
 * Codigo basado en el codigo de la pagina 189 del libro java 7.
 * </p>
 * 
 * <p>
 * Añadimos que muestre el nombre del equipo, sistema operativo y nombre del
 * usuario.
 * </p>
 * 
 * @author libroJava7
 * @author jbarast
 * @version 18/04/2017
 *
 */
public class ListaVolumenes {

	public static void main(String[] args) throws UnknownHostException {

		// Obtener nombre y direccion IP del equipo local juntos
		InetAddress direccion;

		direccion = InetAddress.getLocalHost();
		System.out.println("Equipo = " + direccion);

		System.out.println("Sistema operativo: " + System.getProperty("os.version"));

		System.out.println("Usuario: " + System.getProperty("user.name"));

		File[] listaDirectoriosRaiz = File.listRoots();
		System.out.println("Lista de directorios raiz del equipo:");
		for (int i = 0; i < listaDirectoriosRaiz.length; i++) {
			System.out.println(listaDirectoriosRaiz[i] + " ");
		}

	}
}
