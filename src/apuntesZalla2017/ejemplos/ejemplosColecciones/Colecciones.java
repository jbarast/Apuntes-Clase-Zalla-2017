//Colecciones.java
//Autor: jbarast
//Fecha: 03/04/2017
//Notas: Ejemplo de Colecciones.

//Paquete.
package apuntesZalla2017.ejemplos.ejemplosColecciones;

//imports.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Colecciones {

	public static void main(String[] args) {

		// Funciones, las que no queremos ejecutar las comentamos.
		// ejemplosArrayList();
		// ejemplosHashSet();
		ejemplosHashMap();

	}

	private static void ejemplosHashMap() {
		// Creamos el HashMap.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		System.out.println("---HashMap---");
		System.out.println("Coleccion con Keys(Diccionario en Python)");
		// Metemos datos.
		hm.put("UNO", 1); // Apartir de java 5 detecta autoboxing si no //
							// hm.put("UNO",new Integer(1));
		hm.put("CINCO", new Integer(5)); // Asi seria en versiones antiguos.

		// Sacamos con consola.
		System.out.println("\nPrintl simple");
		System.out.println(hm);

		// Hacemos otro mas orientativo.

		HashMap<String, String> diccionario = new HashMap<String, String>();

		// Le metemos datos.
		diccionario.put("Casa", "Home");
		diccionario.put("Perro", "Dog");
		diccionario.put("Gato", "Cat");
		diccionario.put("Agua", "Water");
		diccionario.put("Fuego", "Fire");
		diccionario.put("Tierra", "Ground");

		// Visualizamos la coleccion.
		System.out.println("\nHastMap Diccionario:");
		System.out.println(diccionario);

		// Algunos elementos.

		System.out.println("\nSacamos el valor de la Key Casa");
		System.out.println(diccionario.get("Casa"));

		// Uno complicado.

		System.out.println("\n HashMap con un array de Strings.");
		HashMap<String, String[]> diccionario2 = new HashMap<String, String[]>();

		final int INGLES = 0, EUSKERA = 1;
		// Metemos elementos.
		diccionario2.put("Casa", new String[] { "Home", "Etxe" });
		diccionario2.put("Perro", new String[] { "Dog", "Txakur" });

		System.out.println("Impresion simple");
		System.out.println(diccionario2);

		System.out.println("Sacando los elementos con Keys y eligiando uno de los idiomas con ENUM");
		System.out.println(diccionario2.get("Perro")[EUSKERA]);
		System.out.println(diccionario2.get("Casa")[INGLES]);

		// TODAVIA uno mas dificil.

		HashMap<String, HashMap<Integer, String>> diccionario3 = new HashMap<String, HashMap<Integer, String>>();
		HashMap<Integer, String> traducciones = new HashMap<Integer, String>();
		HashMap<Integer, String> traducciones1 = new HashMap<Integer, String>();

		traducciones.put(INGLES, "Dog");
		traducciones.put(EUSKERA, "Txakur");

		diccionario3.put("Perro", traducciones);

		traducciones1.put(INGLES, "Home");
		traducciones1.put(EUSKERA, "Etxe");

		diccionario3.put("Casa", traducciones1);

		// Sacamos el dato.
		System.out.println("Version complicada le decimos que palabra queremos imprimir en que idioma");
		System.out.println(diccionario3.get("Casa").get(INGLES));
		System.out.println(diccionario3.get("Casa").get(EUSKERA));
		System.out.println(diccionario3.get("Perro").get(EUSKERA));

	}

	@SuppressWarnings("unused")
	private static void ejemplosHashSet() {

		// Creamos el HashSet
		HashSet<String> hs = new HashSet<>();

		System.out.println("---Probando el HashSet---");

		// Metemos tres elementos iguales.
		System.out.println("\n\nMetemos tres elementos iguales:");
		hs.add("Uno");
		hs.add("Uno");
		hs.add("Uno");

		System.out.println(hs);

		// Metemos tres elementos iguales.
		System.out.println("\nMetemos un elementos ya metido y dos nuevos iguales diferente al anterior:");
		hs.add("Dos");
		hs.add("Uno");
		hs.add("Dos");
		System.out.println(hs);

	}

	// Metodo de ejemplosArrayList();
	@SuppressWarnings("unused")
	private static void ejemplosArrayList() {
		// Declaracion de ArrayList.
		ArrayList<String> al; // String[] arr
		al = new ArrayList<String>(); // arr = new String[Tamaño]

		// Añadimos elementos al ArrayList.
		al.add("Uno"); // arr[0]= "Uno"
		al.add("Dos");// arr[1]= "Dos"
		// al.add("Tres");

		// Visualizamos el ArrayList.
		System.out.println("Con la funcion println:");
		System.out.println(al);

		// Queremos coger cada dato del ArrayList.

		System.out.println("\nColeccion inicial");

		System.out.println("\nSacamos todos los datos del ArrayList");
		for (String dato : al) { // for(String daot: arr)
			System.out.println(dato); // System.out.println(dato);
		}

		// Sacando un dato en concreto.
		System.out.println("\nSacando el dato del indice 1");
		System.out.println(al.get(1)); // System.out.println(arr[1]);

		// Cambiando un dato de una posicion.
		System.out.println("\nCambiando el element 0 del ArrayList");
		al.set(0, "Cambiado"); // arr[0]= "Cambiado";
		System.out.println(al);

		// Insertamos un elemento y le borramos.
		System.out.println("\nMeter algo en medio:");
		al.add(1, "Intruso");
		System.out.println(al);

		System.out.println("\n Borrando el intruso");
		al.remove(1);
		System.out.println(al);

		System.out.println("\n Iteraciones");
		Iterator<String> i = al.iterator();
		System.out.println(i.next());// Muestro el elemento i y paso al
										// siguiente.
		System.out.println(i.hasNext()); // Mira haber si hay otro elemento.
		System.out.println(i.next());
		System.out.println(i.hasNext());

		// Lo hacemos con un bucle while.
		System.out.println("\nHacerlo en un bucle while:");

		Iterator<String> j = al.iterator();
		while (j.hasNext()) {
			System.out.println(j.next()); // Muestro el elemento j y paso al
											// siguiente.
		}

		// Convertiendolo en un Array.
		System.out.println("\n Convertiendolo en un Array.");
		String[] c = al.toArray(new String[0]);
		System.out.println(c);

		System.out.println("Ya no podemos sacarlo con println," + " si no que hay que hacerlo con for-each y println");
		for (String datos : c)
			System.out.println(datos);

	}

}
