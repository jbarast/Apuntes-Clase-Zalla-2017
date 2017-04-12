//Triangulo.java
//Autor: @jbarast
//Fecha: 12/04/2017
//Notas: Ejercicio del libro pag.112
package apuntesZalla2017.laboratoriosLibroJava7.programas;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		// Objeto necesario para leer el teclado.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); // Objeto que lee lo que escribes.

		// Los tres lados del triangulo.
		int lado1, lado2, lado3 = 0;
		System.out.println("Meter tres numeros reales para hacer un triangulo:");

		// Pedimos y metemos los lados.
		System.out.println("Mete el primer lado: ");
		lado1 = sc.nextInt();

		System.out.println("Mete el segundo lado: ");
		lado2 = sc.nextInt();

		System.out.println("Mete el tercer lado: ");
		lado3 = sc.nextInt();

		// Tres lados forman un triangulo si dos de sus lados son mayores que el
		// tercer lado restante.
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			System.out.println("Forman un triangulo");
		} else {
			System.out.println("No forman un triangulo");
		}

	}

}
