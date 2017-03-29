//PuntoPrueba.java
//Autor: jbarast  
// https://github.com/jbarast
//Fecha: 29/09/2017
//Nota: Programa de ejemplo para ver como funciona la llamada a objetos.

package apuntesZalla2017.ejemplos.ejemplopoo.programa;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Punto;

public class PuntoPrueba {

	public static void main(String[] args) {

		// Declarion de variables.

		Punto pt1; // Si estan los dos en el mismo paquete, no hace falta
					// importor el objeto.
		pt1 = new Punto(); // new es una llamada al constructor.

		// meter los datos.
		pt1.x = 5;
		pt1.y = 7;

		System.out.println(String.format("Punto pt1(%d,%d)", pt1.x, pt1.y));
		// Siendo lo mismo que:
		// System.out.format("P(%d,%d)\n",pt1.x,pt1.y);

	}

}
