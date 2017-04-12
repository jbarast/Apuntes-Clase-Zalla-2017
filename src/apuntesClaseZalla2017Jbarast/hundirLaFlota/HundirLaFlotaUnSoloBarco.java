// HundirLaFlota.java
// Author: J.Barnes
// 24-03-2017

package apuntesClaseZalla2017Jbarast.hundirLaFlota;

import java.util.Scanner;

public class HundirLaFlotaUnSoloBarco {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x, y;

		System.out.println("Hundir la flota");
		System.out.println("Anchura x: ");
		x = teclado.nextInt();
		System.out.println("Anchura y: ");
		y = teclado.nextInt();

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

		// Creamos los limites del tablero.
		int xMax = x - 1;
		int xMin = 0;

		int yMax = y - 1;
		int yMin = 0;

		// Cordenadas del barco.
		int xBarco = (int) (Math.random() * xMax);
		int yBarco = (int) (Math.random() * yMax);

		// Comprobamos donde a creado el barco.

		System.out.format("Las cordenadas del barco = [x: %d; y %d ]\n", xBarco, yBarco);

		int xCordenadaUsuario = 0;
		int yCordenadaUsuario = 0;
		int hundido = 0;

		do {

			// Pedimos al usuario la posicion del barco.
			do {
				System.out.format("Teclee una coordenada x, entre 0 y %d : \n", xMax);
				xCordenadaUsuario = teclado.nextInt();
			} while (xCordenadaUsuario > xMax || xCordenadaUsuario < xMin);

			do {
				System.out.format("Teclee una coordenada x, entre 0 y %d : \n", yMax);
				yCordenadaUsuario = teclado.nextInt();
			} while (yCordenadaUsuario > yMax || yCordenadaUsuario < yMin);

			if (xBarco == xCordenadaUsuario && yBarco == yCordenadaUsuario) {
				System.out.println("Barco hundido");
				hundido = 1;
				// Pintamos las x.
				tablero[xCordenadaUsuario][yCordenadaUsuario] = 'H';

			} else {
				System.out.println("Uupps!!!");
				System.out.println("La proxima vez sera??");

				// Pintamos las x.
				tablero[xCordenadaUsuario][yCordenadaUsuario] = 'X';
			}

			// Visualizamos el tablero.

			for (int xArray = 0; xArray < tablero.length; xArray++) {
				for (int yArray = 0; yArray < tablero[xArray].length; yArray++) {

					System.out.print(tablero[xArray][yArray]);
				}
				System.out.println();
			}

		} while (hundido == 0);

		// ///
	}

}
