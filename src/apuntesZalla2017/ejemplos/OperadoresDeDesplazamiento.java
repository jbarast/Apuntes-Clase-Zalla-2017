//OperadoresDeDesplazamiento.java
//Autor: jonBarnes
//Fecha: 03/04/2017
//Notas: Ejemplo de opreadores de Desplazamiento.

package apuntesZalla2017.ejemplos;

public class OperadoresDeDesplazamiento {

	public static void main(String[] args) {

		// Mirando como funcionan los operadores.

		int resultado1 = 6 >> 1;
		int resultado2 = 159 >> 1;
		int resultado3 = 14 >> 1;
		int resultado4 = 10 >> 1;

		int divi1 = 6 / 2;
		int divi2 = 159 / 2;
		int divi3 = 14 / 2;
		int divi4 = 10 / 2;

		// Imprimimos los resultados.
		System.out.println("Divisiones:");

		System.out.println("Resultados operadores de desplazamiento");
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);

		System.out.println("Resultados de divisiones");
		System.out.println(divi1);
		System.out.println(divi2);
		System.out.println(divi3);
		System.out.println(divi4);

		System.out.println("----------------");

		// Otro tipo de operadores:

		int resultado11 = 6 << 1;
		int resultado12 = 159 << 1;
		int resultado13 = 14 << 1;
		int resultado14 = 10 << 1;

		int multi1 = 6 * 2;
		int multi2 = 159 * 2;
		int multi3 = 14 * 2;
		int multi4 = 10 * 2;

		// Imprimimos los resultados.
		System.out.println("Multiplicaciones:");

		System.out.println("Resultados operadores de desplazamiento");
		System.out.println(resultado11);
		System.out.println(resultado12);
		System.out.println(resultado13);
		System.out.println(resultado14);

		System.out.println("Resultados de multiplicaciones");
		System.out.println(multi1);
		System.out.println(multi2);
		System.out.println(multi3);
		System.out.println(multi4);

		System.out.println("----------------");

		// Ultima parte.

		System.out.println(Integer.toBinaryString(-6));
		System.out.println(String.format("%32s", Integer.toBinaryString(6 >> 2)));
		System.out.println(String.format("%32s", Integer.toBinaryString(-6 >>> 2)));

	}

}
