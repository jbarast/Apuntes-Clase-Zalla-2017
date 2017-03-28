//EjemplosMarzo28.java

/**
 * 
 */
package apuntesZalla2017.ejemplos;

import java.util.ArrayList;
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

		// Para hacer array dinamicos.
		colecciones();

		coleccionesJava5();

		// El metodo factorial con bucle en vez de recursividad.
		// System.out.println(factorial(1));

	}

	// Metodo coleeciones que fue creada en Java5
	private static void coleccionesJava5() {

		ArrayList<String> al = new ArrayList<String>(); // Hay que indicarle que
														// tipo de datos tiene
														// en su interior.

		al.add("Uno");
		al.add("Dos");
		al.add("Tres");

		// Imprimimos de uno en uno.
		for (String dato : al)
			System.out.println(dato);

		// Imprimimos, el arrayList entero.

		System.out.println(al);

		// Sacamos un elemento y lo imprimimos.

		String s = al.get(1);
		System.out.println(s);

	}

	// Funcion para la creacion de arrays variables, con metodo antiguo.
	// Para lo que utilizamos el objeto vector.

	@SuppressWarnings("unchecked")
	private static void colecciones() {

		@SuppressWarnings("rawtypes")
		// Para quital los warnings.
		Vector v = new Vector();

		// Para añadir elementos al final del ultimo elemento.
		v.add("Hola");
		v.add(7);
		v.add(5.3);

		// Para quitar elementos.
		v.remove(1); // Es con indice.

		// Para insertar elementos en una posicion concrenta.

		v.insertElementAt("Insertado por Indice", 1);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}

		double d = (double) v.get(2); // Cogemos el elemento como es. Esto es,
										// Vector no saba que tipo de dato tiene
										// guardado en su interior. Por lo que
										// tenemos que cogerlo diciendo que tipo
										// de dato es.

		System.out.println(d);

		// Mirar bien esta parte.

		Object[] o = v.toArray(); // Todas clases heredan de object.
		System.out.println(o[1]);

		// meter un vector dentro de otro vector.

		v.add(new Vector());
		((Vector) v.get(3)).add("Metiendo algo de texto en el vector añadido");

	}

	// El metodo factorial con bucle en vez de recursividad.

	private static int factorial(int numero) {

		int numeroAcumulado = numero;
		int multiplicador = numero;

		do {
			if (numero > 1) {
				multiplicador -= 1;
			}
			numeroAcumulado *= multiplicador;

		} while (multiplicador > 1);

		return numeroAcumulado;
	}
	// ////////
}
