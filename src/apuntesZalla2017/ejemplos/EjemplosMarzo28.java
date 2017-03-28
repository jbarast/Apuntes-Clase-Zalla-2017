//EjemplosMarzo28.java

/**
 * 
 */
package apuntesZalla2017.ejemplos;

import java.util.Vector;

/**
 * @author jbarast
 *
 */
public class EjemplosMarzo28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		colecciones();

	}

	private static void colecciones() {

		Vector v = new Vector();

		v.add("Hola");
		v.add(1);
		v.add(5.3);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

	// ////////
}
