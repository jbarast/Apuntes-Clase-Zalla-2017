package apuntesZalla2017.laboratoriosLibroJava7.programas;

import java.util.Objects;
import java.util.Scanner;

import apuntesZalla2017.laboratoriosLibroJava7.tipos.MiError;
import apuntesZalla2017.laboratoriosLibroJava7.tipos.Validar;

/**
 * <h1>Clase Repaso</h1>
 * <p>
 * Realiza un programa que realice las siguientes tareas:
 * </p>
 * <ul>
 * <li>Solicita al usuario un numero entero mayor de 10 y menor de 30; repita la
 * operacion hasta que el numero escrito cumpla estas condiciones.</li>
 * <li>Investiga y muestra al usuario si el numero es divisible por 5.</li>
 * <li>Solicita al usuario su nombre e informa posteriormente de:
 * </ul>
 * <ul>
 * <li>El numero de caracteres del nombre.</li>
 * <li>El caracter inicial y el final</li>
 * <li>Muestre el nombre con todos los caracteres en mayusculas.</li>
 * <li>Muestra el nombre con todos los caracteres en minusculas.</li>
 * <li>Indica al usuario si el nombre tiene la letra ñ</li>
 * </ul>
 * 
 * 
 * @author jbarast
 * @version 18/04/2017
 */
public class Repaso {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// variables necesarias.
		Scanner scanner;
		scanner = new Scanner(System.in);

		int numeroDadoUsuario = 0;

		Boolean error = false;

		// Pedimos al usuario un numero entre 10 y 30.
		do {
			error = false;

			try {
				System.out.println("Escribe un numero entre 10 y 30:");
				numeroDadoUsuario = scanner.nextInt();
				Validar.esValido(
						numeroDadoUsuario >= 10 && numeroDadoUsuario <= 30
								&& Objects.isNull(numeroDadoUsuario) == false,
						"Numero Incorrecto, inserta otro numero.");

			} catch (MiError miError) {

				System.out.println(miError.getMessage());
				error = true;
			} catch (Exception miException) {

				System.out.println(miException.getMessage());
				error = true;
			}
		} while (error);

		// Sistema de seguridad para saber si hace bien los errores.
		// System.out.println("Numero correcto: " + numeroDadoUsuario);

		// Numero divisible por 5.

		if (numeroDadoUsuario % 5 == 0) {
			System.out.println(numeroDadoUsuario + " es divisible por 5.");
		}

		// Pedi un nombre al usuario.

		System.out.println("Dame un nombre: ");
		Scanner scanner02;
		scanner02 = new Scanner(System.in);

		// String nombre;
		String nombre;
		nombre = scanner02.nextLine();
		System.out.println(nombre);

		// para saber cuantos elementos tiene.
		int caracteresNombre;
		caracteresNombre = nombre.length();
		System.out.println(String.format("El nombre tiene %d letras.", caracteresNombre));

		// Mostrar el primer caracter y el ultimo.
		char primerCaracterNombreDado;
		char ultimoCaracterNombreDado;

		primerCaracterNombreDado = nombre.charAt(0);
		ultimoCaracterNombreDado = nombre.charAt(nombre.length() - 1);

		System.out.println(String.format("La primera letra del nombre es %c", primerCaracterNombreDado));
		System.out.println(String.format("La ultima letra del nombre es %c", ultimoCaracterNombreDado));

		// Mostramos el nombre con todos los caracteres en Mayuscula.
		System.out.println(String.format("%s en Mayusculas es %s", nombre, nombre.toUpperCase()));

		// Mostramos el nombre con todos los caracteres en minusculas.
		System.out.println(String.format("%s en minusculas es %s", nombre, nombre.toLowerCase()));

		// Miramos si el nombre tiene la letra ñ.

		boolean nombreTieneÑ = false;
		String nombreMinuscula = nombre.toLowerCase();

		for (int i = 0; i <= nombreMinuscula.length() - 1; i++) {
			if (nombreMinuscula.charAt(i) == 'ñ') {
				nombreTieneÑ = true;
			}

		}

		if (nombreTieneÑ == true) {
			System.out.println(String.format("%s contiene la letra ñ", nombre));
		}

	}
}
