//PuntoPrueba.java
//Autor: jbarast  
// https://github.com/jbarast
//Fecha: 29/03/2017
//Nota: Programa de ejemplo para ver como funciona la llamada a objetos.

package apuntesZalla2017.ejemplos.ejemplopoo.programa;

import java.util.Date;

//Importamos el objeto punto.
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Punto;

public class PuntoPrueba {

	public static void main(String[] args) {

		// Declarion de variables.

		Punto pt1; // Si estan los dos en el mismo paquete, no hace falta
					// importor el objeto.
		Punto pt2;
		pt1 = new Punto(); // new es una llamada al constructor.

		pt2 = new Punto(43.2345, -4.2345);

		// meter los datos.
		pt1.setX(5);
		pt1.setY(7);

		// Meter los datos formato nuevo.

		// pt2.setXDouble(5.1);
		// pt2.setYDouble(107.8);

		// Miramos como aparecen en consola:

		System.out.println(String.format("Punto pt1(%d,%d)", pt1.getX(), pt1.getY()));
		// Siendo lo mismo que:
		// System.out.format("P(%d,%d)\n",pt1.x,pt1.y);

		System.out.println(String.format("Punto pt1(%.2f : %.2f)", pt1.getXDouble(), pt1.getYDouble()));

		System.out.println(String.format("Punto pt2(%d,%d)", pt2.getX(), pt2.getY()));
		// Siendo lo mismo que:
		// System.out.format("P(%d,%d)\n",pt1.x,pt1.y);

		System.out.println(String.format("Punto pt2(%.2f : %.2f)", pt2.getXDouble(), pt2.getYDouble()));

		// Para poner fechas.

		fechas();
		// /
	}

	// Metodo para poner las fechas.
	private static void fechas() {
		Date d = new Date();
		System.out.println(d);
	}

}
