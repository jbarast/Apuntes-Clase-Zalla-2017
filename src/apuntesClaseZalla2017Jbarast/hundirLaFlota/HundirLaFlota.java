// HundirLaFlota.java
// Author: J.Barnes
// 24-03-2017

package apuntesClaseZalla2017Jbarast.hundirLaFlota;

import java.util.Scanner;

public class HundirLaFlota {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		// Para saber las dimenssiones del tablero.
		int x, y;

		System.out.println("Hundir la flota");
		System.out.println("Anchura x: ");
		x = teclado.nextInt();
		System.out.println("Anchura y: ");
		y = teclado.nextInt();

		// Para saber cuantos barco.
		// Nunca mas que las posibilidades del tablero.

		int numeroBarcos;

		do {
			System.out.format("Numero de barcos: (Maximo=%d).\n", (x * y));
			numeroBarcos = teclado.nextInt();

		} while (numeroBarcos >= ((x * y)));

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

		// // Cordenadas para un barco
		// int xBarco = (int) (Math.random() * xMax);
		// int yBarco = (int) (Math.random() * yMax);

		// Creamos el Array de los barcos.

		Barco[] arrayBarcos = new Barco[numeroBarcos];

		// Rellemas en array con los barcos.

		int xBarco = 0;
		int yBarco = 0;
		int repetido = 0;

		int longitudArrayBarcos = 0;

		Barco barco = new Barco(0, 0);

		for (int i = 0; i <= (numeroBarcos - 1); i++) {

			repetido = 0;
			do {
				xBarco = (int) (Math.random() * xMax);
				// System.out.print(xBarco);
				yBarco = (int) (Math.random() * yMax);
				// System.out.println(yBarco);

				// Miramos si coincide con alguno del array de barcos.

				if (i == 0) {
					longitudArrayBarcos = 0;
					arrayBarcos[0] = new Barco(0, 0);

				} else if (i == 1) {
					longitudArrayBarcos = 0;

				} else {

					longitudArrayBarcos += 1;

				}

				// Impresiones de visualizacion.

				// System.out.println(arrayBarcos[0].getxCoordenadaBarco());
				// System.out.println(arrayBarcos[0].getyCoordenadaBarco());

				// System.out.println(xBarco);
				// System.out.println(yBarco);

				for (int k = 0; k <= longitudArrayBarcos; k++) {

					if (arrayBarcos[k].getxCoordenadaBarco() == xBarco
							&& arrayBarcos[k].getyCoordenadaBarco() == yBarco) {
						repetido = 1;
					}
				}

			} while (repetido == 1);

			// Metemos en el array.

			arrayBarcos[i] = new Barco(xBarco, yBarco);

		}

		// Comprobamos donde a creado el barco.

		// System.out.format("Las cordenadas del barco = [x: %d; y %d ]\n",
		// xBarco, yBarco);

		for (int i = 0; i <= (numeroBarcos - 1); i++) {
			System.out.format("Las cordenadas del barco %d = [x: %d; y %d ]\n", (i + 1),
					arrayBarcos[i].getxCoordenadaBarco(), arrayBarcos[i].getyCoordenadaBarco());

		}

		int xCordenadaUsuario = 0;
		int yCordenadaUsuario = 0;
		int hundido = 0;
		String stringPosibleBarco;
		int intentos = 0;

		int barcosQueFaltan = numeroBarcos;
		// System.out.println("PundoControl01");
		Barco posibleBarco = new Barco();

		// System.out.println(posibleBarco);

		// TODO Arreglar lo de comprobar los barcos.

		do {

			hundido = 0;
			// Mostramos cuantos barcos quedan.

			System.out.format("Todavia quedan %d barcos.\n", barcosQueFaltan);

			// Pedimos al usuario la posicion del barco.
			do {
				System.out.format("Teclee una coordenada x, entre 0 y %d : \n", xMax);
				xCordenadaUsuario = teclado.nextInt();
			} while (xCordenadaUsuario > xMax || xCordenadaUsuario < xMin);

			do {
				System.out.format("Teclee una coordenada y, entre 0 y %d : \n", yMax);
				yCordenadaUsuario = teclado.nextInt();
			} while (yCordenadaUsuario > yMax || yCordenadaUsuario < yMin);

			posibleBarco.setxCoordenadaBarco(xCordenadaUsuario);
			posibleBarco.setyCoordenadaBarco(yCordenadaUsuario);

			// Codigo de control. Para saber si se crea el posible barco.
			// stringPosibleBarco = posibleBarco.toString();
			// System.out.println(stringPosibleBarco);

			// Miramos si coincide con algun barco del arrayBarcos.
			//

			for (int i = 0; i < arrayBarcos.length; i++) {

				if (arrayBarcos[i].getxCoordenadaBarco() == posibleBarco.getxCoordenadaBarco()
						&& arrayBarcos[i].getyCoordenadaBarco() == posibleBarco.getyCoordenadaBarco()) {
					System.out.println("Hundido barco");
					hundido = 1;
					barcosQueFaltan -= 1;
				} else {
					// System.out.println("Barco no coincide con" + i);
				}
			}

			// Pintamos la h o la x, en el tablero aparte de gestionar los
			// intentos.

			if (hundido == 1) {
				tablero[xCordenadaUsuario][yCordenadaUsuario] = 'H';

			} else {
				System.out.println("Uupps!!!");
				System.out.println("La proxima vez sera??");

				intentos += 1;

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

			// Visualizacion de intentos.

			System.out.format("LLevas %d de intentos y todavia te quedan %d barcos de hundir.\n", intentos,
					barcosQueFaltan);

		} while (barcosQueFaltan > 0);

		System.out.println("Enorabuna acabas de terminar");
		System.out.format("En un total de %d intentos.\n", intentos);

		// ///
	}
}
