//PuestoPrueba.java
//Autor: @jbarast
//Fecha: 07/04/2017
//Notas: Clase para probar la clase Puesto y los enums.
package apuntesZalla2017.ejemplos.ejemplopoo.programa;

import apuntesZalla2017.ejemplos.ejemplopoo.enums.EnumPuestos;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Puesto;

//imports.

public class PuestoPrueba {

	public static void main(String[] args) {
		// Primero pruebo los enums.
		EnumPuestos enumPuesto = EnumPuestos.DIRECTOR;
		System.out.println(enumPuesto);

		// Miramos simplemente la clase Puesto.
		Puesto puesto = new Puesto(EnumPuestos.EMPLEADO);
		System.out.println(puesto.getPuesto());
		System.out.println(puesto);
		System.out.println(puesto.getSalario());

	}

}
