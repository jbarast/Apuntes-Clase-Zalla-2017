//ContratoEspecial.java
//Autor: @jbarast
//Fecha: 12/04/2017
//Notas: Clase de ejemplo que contiene una interface.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.Contracto;

public class ContratoEspecial implements Contracto {

	// Otros metodos.
	// ..Metodos de la interface.
	// ..Tengo que darles cuerpo a los metodos de las interfaces.
	@Override
	public void clausula1() {

		// throw new RuntimeException("PENDIENTE"); // Con este comando
		// conseguimos
		// que compile el programa
		// pendiente ademas de que
		// si devuelve algo sea el
		// Mensaje "PENDIENTE".

		System.out.println("Clásula 1 de contrato especial");
	}

	@Override
	public int clausula2(String s) {

		// throw new RuntimeException("PENDIENTE");
		System.out.println("Clasula2 " + s);
		return s.length();
	}

}
