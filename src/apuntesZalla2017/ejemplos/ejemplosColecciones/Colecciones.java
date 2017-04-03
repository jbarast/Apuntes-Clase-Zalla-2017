//Colecciones.java
//Autor: jbarast
//Fecha: 03/04/2017
//Notas: Ejemplo de Colecciones.

//Paquete.
package apuntesZalla2017.ejemplos.ejemplosColecciones;

//imports.
import java.util.ArrayList;

public class Colecciones {

	public static void main(String[] args) {

		// Declaracion de ArrayList.
		ArrayList<String> al;
		al = new ArrayList<String>();

		// Añadimos elementos al ArrayList.
		al.add("Uno");
		al.add("Dos");
		al.add("Tres");

		// Visualizamos el ArrayList.
		System.out.println(al);

	}
}
