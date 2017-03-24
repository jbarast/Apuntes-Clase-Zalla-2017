// HundirLaFlota.java
// Author: J.Barnes
// 24-03-2017

package apuntesClaseZalla2017Jbarast.hundirLaFlota;

import java.util.Scanner;

public class HundirLaFlota {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x, y;

		System.out.println("Coordenada x: ");
		x = teclado.nextInt();
		System.out.println("Coordenada x: ");
		y = teclado.nextInt();

		// TODO Hacer el tablero.

		// Creacion del tablero

		char[][] tablero;

		tablero = new char[x][y];

		// Rellenamos primero el tablero con puntos.
		for (int xArray = 0; xArray < tablero.length; xArray++) {
			for (int yArray = 0; yArray < tablero[xArray].length; yArray++) {
				tablero[xArray][yArray] = '.';
			}
		}

		// Visualizamos el tablero.

		for (int xArray = 0; xArray < tablero.length; xArray++) {
			for (int yArray = 0; yArray < tablero[xArray].length; yArray++) {

				System.out.print(tablero[xArray][yArray]);
			}
			System.out.println();
		}

		// ///
	}

}
