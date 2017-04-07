//PruebaPuntoNombre.java
//Autor: @jbarast Github: @jbarast
//Fecha: 05/04/2017
//Notas: Clase para probar el funcionamiento de la clase PuntoPrueba.java que es hija de Punto.java
//Programa hecho para estudiar la herencias de clase en java.

package apuntesZalla2017.ejemplos.ejemplopoo.programa;

//Imports.
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Punto;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.PuntoNombre;

//Para colorear.

public class PruebaPuntoNombre {

	public static void main(String[] args) {

		// Pintar que programa estamos ejecutando.

		System.out.println("-------------------------------------------------");
		System.out.println("---Probando la clase hija PuntoNombre de Punto---");
		System.out.println("-------------------------------------------------");

		// Creamos el objeto ptn tipo PuntoNombre.
		PuntoNombre ptn;
		ptn = new PuntoNombre();

		// Metemos valores al ptn.

		ptn.setX(5);
		ptn.setY(7);
		ptn.setNombre("Ipartek");

		// Sacamos por pantalla el objeto ptn.
		System.out.println("Punto ptn:");
		System.out.println(ptn);

		// Creacion del Punto p, igualandolo a ptn.
		Punto p;
		p = ptn;
		System.out.println("Punto p:");
		System.out.println(p);

		// Creacion del PuntoNombre ptn2.
		if (p instanceof PuntoNombre) {
			PuntoNombre ptn2;
			ptn2 = (PuntoNombre) p; // Tienes que decir q lo que sale de aqui es
									// un
									// PuntoNombre y no un Punto. Java te
									// obliga.

			System.out.println("Atributo nombre del PuntoNombre ptn2:");
			System.out.println(ptn2.getNombre());

		}

		// Que pasa si un Punto se hace pasar por PuntoNombre??

		Punto pt = new Punto();
		PuntoNombre ptn3;
		// ptn3 = (PuntoNombre) pt; // TODO arregrarlo.
		// System.out.println(ptn3.getNombre());
		System.out.println("¿Es p una instancia de PuntoNombre?");
		System.out.println(p instanceof PuntoNombre);
		System.out.println("¿Es pt una instancia de PuntoNombre?");
		System.out.println(pt instanceof PuntoNombre);

		// Seguiendo probando cosas.

		// Si cambiamos la X del objto p, el valor X de ptn es lo mismo. Ya que
		// ptn y p, apuntan a la misma memoria.
		p.setX(2000);
		System.out.println("Valor de x de ptn, cambiando el valor de x con p.setX(2000):");
		System.out.println(ptn.getX());

		// Añadido el 07/04/2017
		Object o = ptn;
		System.out.println("¿Es ptn heredero de la Clase Object");
		System.out.println(ptn instanceof Object); // SIEMPRE ES TRUE.

		System.out.println(o.getClass());

	}
}
