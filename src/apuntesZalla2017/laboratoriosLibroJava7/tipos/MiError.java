package apuntesZalla2017.laboratoriosLibroJava7.tipos;

/**
 * 
 * <h1>MiError</h1>
 * 
 * <p>
 * Fichero <code>MiError.java</code>. Muestra como crear una clase de excepcion
 * personalizada.
 * </p>
 * 
 * @author LibroJava7
 *
 */
public class MiError extends RuntimeException {

	/**
	 * Constructor vacion de MiError
	 */
	public MiError() {
		super("!Ya me a fallado!");
	}

	/**
	 * 
	 * Muestra el mensaje personalizado.
	 * 
	 * @param mensaje
	 *            Mensaje de error personalizada.
	 */
	public MiError(String mensaje) {
		super(mensaje);
	}

}
