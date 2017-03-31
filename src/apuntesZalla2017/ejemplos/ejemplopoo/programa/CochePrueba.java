package apuntesZalla2017.ejemplos.ejemplopoo.programa;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Coche;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Rueda;

public class CochePrueba {

	public static void main(String[] args) {
		Coche coche = new Coche();

		Rueda[] ruedas = new Rueda[4];

		for (int i = 0; i < ruedas.length; i++)
			ruedas[i] = new Rueda(15.0, 12.0);

		coche.setRuedas(ruedas);

		System.out.println(coche);
	}

}
