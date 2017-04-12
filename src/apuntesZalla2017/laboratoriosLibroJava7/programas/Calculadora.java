//Calculadora.java
//Autor: @jbarast
//Fecha: 12/04/2017
//Notas: Ejercicio del libro de la pagina 13.
///////: Crear una calculadora. Dos numero y meter la operacion.

package apuntesZalla2017.laboratoriosLibroJava7.programas;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Atributos.
		double numero1, numero2 = 0.0;
		double resultado = 0.0;
		char operador;
		String stringOperador;

		// Creamos la clase Scanner.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// Cabecera del programa
		System.out.println("-----------------");
		System.out.println("---CALCULADORA---");
		System.out.println("-----------------");

		System.out.println("Mete el primer numero: ");
		numero1 = sc.nextInt();

		System.out.println("Operacion: ");
		stringOperador = sc.next();
		// operador = stringOperador.charAt(1);

		System.out.println("Mete el segundo numero: ");
		numero2 = sc.nextInt();

		operador = stringOperador.charAt(0);
		// Operaciones posibles.

		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			// System.out.println("suma");
			// System.out.println(numero1 + numero2);
			break;
		case '-':
			resultado = numero1 + numero2;
			// System.out.println("resta");

			break;
		case '*':
			resultado = numero1 * numero2;
			// System.out.println("multiplicacion");

			break;
		case '/':
			resultado = numero1 / numero2;
			// System.out.println("division");
			break;
		}

		// Mostramos el resultado.

		System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
		// System.out.println(resultado);
		// System.out.println(operador);

	}
}
