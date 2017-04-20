package apuntesZalla2017.laboratoriosLibroJava7.programas;

import java.util.Scanner;

import apuntesZalla2017.laboratoriosLibroJava7.tipos.Alimento.enumMineralesContenidoCodigo;
import apuntesZalla2017.laboratoriosLibroJava7.tipos.Alimento.enumVitaminasContenidoCodigo;

public class AlimentosPrueba {

	public static void main(String[] args) {

		// Creacion de scanner.
		Scanner scanner;
		scanner = new Scanner(System.in);

		// Pedimos al usuario que nos introduzca los datos del alimentos.
		// /variables necesarias para la creacion.

		String nombreAlimentoUsuario;
		double lipidosContenidoPorCientoUsuario;
		double hidratosCarbonoContenidoPorCientoUsuario;
		double proteinasContenidoPorCientoUsuario;
		boolean origenAnimalUsuario;

		enumVitaminasContenidoCodigo vitaminasContenidoCodigo;
		enumMineralesContenidoCodigo mineralesContenidoCodigo;

		// /Pedimos que dan valor a las variables.
		System.out.println("Mete un Alimento:");

		System.out.println("Nombre del Alimento: ");
		nombreAlimentoUsuario = scanner.nextLine();

		System.out.println("Porecentaje de lipidos contenido: ");
		lipidosContenidoPorCientoUsuario = scanner.nextDouble();

		System.out.println("Porcentaje de Carbanos contenido: ");
		hidratosCarbonoContenidoPorCientoUsuario = scanner.nextDouble();

		System.out.println("Porcentaje de proteinas contenido: ");
		proteinasContenidoPorCientoUsuario = scanner.nextDouble();

		System.out.println("Es de origen animal??");
		origenAnimalUsuario = scanner.nextBoolean();

		System.out.println("Vitaminas Contenidas?");

		System.out.println("Minerales Contenidas??");
		
		String nombres[] ={"Juan", "Maria", "Antonio","Victoria"};
		System.out.println( "La longuitud del array es= " + nombres. );

	}
}
