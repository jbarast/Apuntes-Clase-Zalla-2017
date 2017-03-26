// HundirLaFlota.java
// Author: J.Barnes
// 24-03-2017

package apuntesClaseZalla2017Jbarast.hundirLaFlota;

import java.util.Scanner;
import apuntesClaseZalla2017Jbarast.hundirLaFlota.Barco;

public class HundirLaFlota {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		// Para saber las dimenssiones del tablero.
		int x, y;

		System.out.println("Coordenada x: ");
		x = teclado.nextInt();
		System.out.println("Coordenada y: ");
		y = teclado.nextInt();

		// Para saber cuantos barco.

		int numeroBarcos;
		System.out.println("Numero de barcos: ");
		// TODO poner que el numero de barcos no pueda ser mayor que la
		// dimension del tableros.
		numeroBarcos = teclado.nextInt();

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
		int xMax = x - 1;
		int xMin = 0;

		int yMax = y - 1;
		int yMin = 0;

		// // Cordenadas para un barco
		// int xBarco = (int) (Math.random() * xMax);
		// int yBarco = (int) (Math.random() * yMax);

		// Creamos el Array de los barcos.

		Barco[] arrayBarcos = new Barco[numeroBarcos];

		// Rellemas en array con los barcos.

		int xBarco = 0;
		int yBarco = 0;

		Barco barco = new Barco(0, 0);

		// TODO Hacer que dos barcos no puedan estar en el mismo sitio.
		for (int i = 0; i <= (numeroBarcos - 1); i++) {

			xBarco = (int) (Math.random() * xMax);
			System.out.print(xBarco);
			yBarco = (int) (Math.random() * yMax);
			System.out.println(yBarco);

			// barco.setxCoordenadaBarco(xBarco);
			// barco.setyCoordenadaBarco(yBarco);

			// Metemos en el array.

			arrayBarcos[i] = new Barco(xBarco, yBarco);

		}

		// Comprobamos donde a creado el barco.

		// System.out.format("Las cordenadas del barco = [x: %d; y %d ]\n",
		// xBarco, yBarco);

		for (int i = 0; i <= (numeroBarcos - 1); i++) {
			System.out.format("Las cordenadas del barco %d = [x: %d; y %d ]\n",
					i, arrayBarcos[i].getxCoordenadaBarco(),
					arrayBarcos[i].getyCoordenadaBarco());

		}

		int xCordenadaUsuario = 0;
		int yCordenadaUsuario = 0;
		int hundido = 0;

		int barcosQueFaltan = numeroBarcos;
		System.out.println("PundoControl01");
		Barco posibleBarco = new Barco((int)1,(int)1);
		System.out.print("PuntoContril02");

		do {

			hundido = 0;
			// Mostramos cuantos barcos quedan.

			System.out.format("Todavia quedan % barcos.\n", barcosQueFaltan);

			// Pedimos al usuario la posicion del barco.
			do {
				System.out.format("Teclee una coordenada x, entre 0 y %d : \n",
						xMax);
				xCordenadaUsuario = teclado.nextInt();
			} while (xCordenadaUsuario > xMax || xCordenadaUsuario < xMin);

			do {
				System.out.format("Teclee una coordenada y, entre 0 y %d : \n",
						yMax);
				yCordenadaUsuario = teclado.nextInt();
			} while (yCordenadaUsuario > yMax || yCordenadaUsuario < yMin);

			posibleBarco.setxCoordenadaBarco(xCordenadaUsuario);
			posibleBarco.setyCoordenadaBarco(yCordenadaUsuario);

			// Miramos si coincide con algun barco del arrayBarcos.

			for (int i = 0; i <= arrayBarcos.length; i++) {

				if (arrayBarcos[i] == posibleBarco) {
					hundido = 1;
					barcosQueFaltan -= 1;
					System.out.println("Un barco hundido");
					tablero[xCordenadaUsuario][yCordenadaUsuario] = 'H';
				}
			}

			if (hundido == 0) {
				System.out.println("Uupps!!!");
				System.out.println("La proxima vez sera??");
				// Pintamos las x.
				tablero[xCordenadaUsuario][yCordenadaUsuario] = 'X';

			}

			// if (xBarco == xCordenadaUsuario && yBarco == yCordenadaUsuario) {
			// System.out.println("Barco hundido");
			// hundido = 1;
			// // Pintamos las x.
			// tablero[xCordenadaUsuario][yCordenadaUsuario] = 'H';
			//
			// } else {
			// System.out.println("Uupps!!!");
			// System.out.println("La proxima vez sera??");
			//
			// // Pintamos las x.
			// tablero[xCordenadaUsuario][yCordenadaUsuario] = 'X';
			// }

			// Visualizamos el tablero.

			for (int xArray = 0; xArray < tablero.length; xArray++) {
				for (int yArray = 0; yArray < tablero[xArray].length; yArray++) {

					System.out.print(tablero[xArray][yArray]);
				}
				System.out.println();
			}

		} while (barcosQueFaltan > 0);

		// ///
	}

}
