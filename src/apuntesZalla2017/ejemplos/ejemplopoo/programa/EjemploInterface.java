package apuntesZalla2017.ejemplos.ejemplopoo.programa;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.Naranja;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.Rodable;

public class EjemploInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rodable[] rodables = new Rodable[2];

		rodables[0] = new Naranja();
		rodables[1] = new Balon();

		for (Rodable rodable : rodables)
			rodable.rodar();

	}

}
