package apuntesZalla2017.ejemplos.ejemplopoo.programa;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Coche;

public class CocheTestTxapucero {

	public static void main(String[] args) {

		// Probando los constructores.

		// Constructor sin parametros
		Coche c = new Coche();
		System.out.println(c.toString());

		// Constructor con parametros..
		Coche ferrari = new Coche("ferrari", 600);
		System.out.println(ferrari.toString());

		// Cambiar potencia 900 y que no sea nuevo.
		ferrari.setPotencia(900);
		ferrari.setNuevo(false);
		System.out.println(ferrari.toString());

	}

}
