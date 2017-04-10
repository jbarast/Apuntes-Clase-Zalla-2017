//EjemploAbstract.java
//Autor: @jbarast
//Fecha: 10/04/2017
//Notas: Clase ejemplos Clase Abstracts.
package apuntesZalla2017.ejemplos;

public class EjemploAbstract {

	public static void main(String[] args) {

		Number[] numeros = new Number[2]; // Declaramos dos huecos de Number.

		numeros[0] = new Double(5.3);
		numeros[1] = new Integer(3);

		for (Number numero : numeros)
			System.out.println(numero.doubleValue()); // Tambien se puede poner
														// numero.integerValue().

	}

}
