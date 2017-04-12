//FigurasPrueba.java
//Autor: @jbarast
//Fecha: 12/04/2017
//Notas: Programa para probar la clase Figuras.java
package apuntesZalla2017.laboratoriosLibroJava7.programas;

import apuntesZalla2017.laboratoriosLibroJava7.tipos.Figuras;

public class FigurasPrueba {

	public static void main(String[] args) throws Exception {

		// Creamos un objeto.
		Figuras figuras;
		figuras = new Figuras(5);

		// Añadiendo la longitud de los lados.

		figuras.getLongitud().add(1.0);
		figuras.getLongitud().add(3.4);
		figuras.getLongitud().add(1.0);
		figuras.getLongitud().add(1.0);
		figuras.getLongitud().add(1.0);

		System.out.println("Figura: ");
		System.out.println(figuras);

		System.out.println("\nEl perimetro es: ");
		System.out.println(figuras.Perimetro());
	}
}
