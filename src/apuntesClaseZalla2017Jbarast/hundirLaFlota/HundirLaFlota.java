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

		// TODO crear barco fantasma.

		// Creamos los limites del tablero.
		int xMax = x;
		int xMin = 0;

		int yMax = y;
		int ymin = 0;

		// Cordenadas del barco.
		int xBarco = (int) (Math.random() * xMax + 1);
		int yBarco = (int) (Math.random() * yMax + 1);

		// Comprobamos donde a creado el barco.

		System.out.format("Las cordenadas del barco = [x: %d; y %d ]", xBarco, yBarco);

		int xCordenadaUsuario = 0;
		int yCordenadaUsuario = 0;
		int hundido = 0;

		do {

			// Pedimos al usuario la posicion del barco.
			System.out.println("Coordenada x: ");
			xCordenadaUsuario = teclado.nextInt();
			System.out.println("Coordenada x: ");
			yCordenadaUsuario = teclado.nextInt();

			if (xBarco == xCordenadaUsuario && yBarco == yCordenadaUsuario) {
				System.out.println("Barco hundido");
				hundido = 1;

			} else {
				System.out.println("Uupps!!!");
				System.out.println("La proxima vez sera??");
			}

		} while (hundido == 0);

		// ///
	}

}
