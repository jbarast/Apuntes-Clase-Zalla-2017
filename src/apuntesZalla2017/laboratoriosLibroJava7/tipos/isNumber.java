package apuntesZalla2017.laboratoriosLibroJava7.tipos;

/**
 * Clase para saber si un dato dado es un numero.
 * 
 * @author jbarast
 * @version 18/04/2017
 *
 */
public class isNumber {

	/**
	 * 
	 * Para saber si es o no un numero.
	 * 
	 * @param string
	 *            String para saber si es un numero.
	 * @return boolean True si es un numero/False si no es un numero.
	 */
	public static boolean isNumber(String string) {
		try {
			Long.parseLong(string);

		} catch (Exception exception) {
			return false;

		}
		return true;

	}

	/**
	 * 
	 * Para saber si es o no un numero.
	 * 
	 * @param numero
	 *            numero para saber si es un numero.
	 * @return boolean True si es un numero/False si no es un numero.
	 */
	public static boolean isNumber(int numero) {

		// Pasamos a String el int.
		String numeroString;
		numeroString = String.valueOf(numero);
		try {
			Long.parseLong(numeroString);

		} catch (Exception exception) {
			return false;

		}
		return true;

	}
}
