//ContratoPrueba.java
//Autor: @jbarast
//Fecha: 14/02/2017
//Notas: Programa ejemplos interfaces.

package apuntesZalla2017.ejemplos.ejemplopoo.programa;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.ContratoCurioso;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.Contracto;

public class ContratoPrueba {

	public static void main(String[] args) {

		Contracto c;

		// Podemos elegir entres dos clases con la misma interface.
		// c = new ContratoEspecial();
		c = new ContratoCurioso();

		c.clausula1();
		System.out.println(c.clausula2("Prueba"));

	}

}
