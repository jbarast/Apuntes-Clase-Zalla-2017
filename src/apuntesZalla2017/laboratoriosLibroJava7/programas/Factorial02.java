package apuntesZalla2017.laboratoriosLibroJava7.programas;

//imports.
import java.util.Scanner;

import apuntesZalla2017.laboratoriosLibroJava7.tipos.MiError;
import apuntesZalla2017.laboratoriosLibroJava7.tipos.Validar;

/**
 * 
 * <h1>Factorial02</h1>
 * <p>
 * Realizar un programa que solicite al usuario un numero entero positivo y
 * menor o igual a 15, calculo su factorial y muestre el resultado al usuario.
 * </p>
 * 
 * <p>
 * Laboratorio de Java; factorial de un numero. Ejercicio que se encuentra en la
 * pagina 114 del libro.
 * </p>
 * 
 * @author jbarast
 * @version 18/04/2017
 *
 *
 */
public class Factorial02 {

	/**
	 * 
	 * Main.
	 * 
	 * @param Ninguno
	 */
	public static void main(String[] args) {

		// Variables.
		boolean error = false;
		int numeroDadoUsuario = 0;
		int resultadoFactorial = 0;
		// Mi error;

		// Creamos la clase scanner para pedir datos a usuarios.
		Scanner sc;
		sc = new Scanner(System.in);

		// Pedimos el numero al usuario.

		do {
			error = false;
			try {
				System.out.println("Mete un numero entre 0 y 15:");
				numeroDadoUsuario = sc.nextInt();
				Validar.esValido(numeroDadoUsuario <= 15 && numeroDadoUsuario >= 0);
			} catch (MiError miError) {

				miError = new MiError("Numero incorrecto, vuelve a intentarlo");
				System.out.println(miError.getMessage());
				error = true;

			} catch (Exception miError) {
				miError = new MiError("Numero incorrecto, vuelve a intentarlo");
				System.out.println(miError.getMessage());
				error = true;
			}

		} while (error);

		// Calculamos el factorial.
		resultadoFactorial = factorizar(numeroDadoUsuario);
		System.out.println(String.format("%d! = %d", numeroDadoUsuario, resultadoFactorial));

	}

	/**
	 * 
	 * <h1>factorizar</h1>
	 * <p>
	 * Esta funcion hace la factorizacion del numero que metemos.
	 * </p>
	 * 
	 * @param numeroAFactorizar
	 * @return numeroFactorizado al final devuelve el numero factorizado.
	 */
	public static int factorizar(int numeroAFactorizar) {

		if (numeroAFactorizar > 1) {
			return numeroAFactorizar * factorizar(numeroAFactorizar - 1);
		} else {
			return 1;
		}
	}
}
