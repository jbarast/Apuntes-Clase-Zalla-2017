//EjemploInterface.java
//Autor: @jbarast (github)
//Fecha: 10/04/2017
//Notas: Programa de ejemplo de interfaces.
package apuntesZalla2017.ejemplos.ejemplopoo.programa;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.Naranja;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.Rodable;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.Balon;

public class EjemploInterface {

	public static void main(String[] args) {

		Rodable[] rodables = new Rodable[2];

		rodables[0] = new Naranja();
		rodables[1] = new Balon();

		for (Rodable rodable : rodables)
			rodable.rodar();

	}

}
