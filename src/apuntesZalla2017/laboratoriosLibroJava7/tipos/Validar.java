package apuntesZalla2017.laboratoriosLibroJava7.tipos;

/**
 * 
 * <h1>Validar</h1>
 * <p>
 * Fichero <code>Valdiar.java</code>. Muestra como crear una excepcion
 * personalizada para la validacion de datos.
 * </p>
 * 
 * @author LibroJava7
 *
 */
public class Validar {

	public static void esValido(boolean valido) throws MiError {
		if (!valido)
			throw new MiError();
	}

	public static void esValido(boolean valido, String mensaje) throws MiError {
		if (!valido)
			throw new MiError(mensaje);
	}

}
