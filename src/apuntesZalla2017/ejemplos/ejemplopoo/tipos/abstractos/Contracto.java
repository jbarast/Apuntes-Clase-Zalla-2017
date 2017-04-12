//Contracto.java
//Autor: @jbarast
//Fecha: 12/04/2017
//Notas: Ejemplo de una interface.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos;

/**
 * Este es un Interface de demostracion de como funciona los interfaces
 * 
 * @author jbarast
 *
 */

public interface Contracto {

	/**
	 * Este metodo no necesita ningun valor
	 * 
	 */
	void clausula1();

	/**
	 * Este metodo trabaja con un argumento y devuelve un valor.
	 * 
	 * @param s
	 *            texto que se intruduce
	 * @return devuelve un entero
	 */
	int clausula2(String s);
}
