//Enumeraciones.java
//Autor: @jbarast
//Fecha: 10/04/2017
//Notas: Ejemplos de enumeraciones.

package apuntesZalla2017.ejemplos;

//Clase que solo puede tomar tres valores que son ROJO, VERDE y AZUL.
enum Color {
	ROJO, VERDE, AZUL
}; // Tipo de datos enum.

// Otra forma de hacerlo.
class CColor {
	public static final int ROJO = 0, VERDE = 1, AZUL = 2;
}

public class Enumeraciones {

	public static void main(String[] args) {

		Color c;

		c = Color.AZUL;

		System.out.println(c.ordinal());

		// System.out.println(CColor.AZUL);
	}
}
