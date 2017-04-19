package apuntesZalla2017.laboratoriosLibroJava7.programas;

import apuntesZalla2017.laboratoriosLibroJava7.enums.GenerosCine;
import apuntesZalla2017.laboratoriosLibroJava7.tipos.DVDCine;

public class DVDCinePrueba {

	public static void main(String[] args) {

		// Generamos un objeto DVDCine.
		DVDCine dvdCine;
		dvdCine = new DVDCine("La Roca", "Spilberg", GenerosCine.COMEDIA, 155);
		System.out.println(dvdCine);

		// Metemos actores.

		dvdCine.anadirActor("Bruce El calvo");
		dvdCine.anadirActor("Jeniffer La diva");
		dvdCine.anadirActor("El viejillo");

		// Mostramos, para comprobar que se han metido bien los datos.

		System.out.println(dvdCine);

		// Miramos si la pelicula es del genero thriller.
		if (dvdCine.esThriller() == true) {
			System.out.println(String.format("La pelicula %s es thriller", dvdCine.getTituloPelicula()));
		} else {
			System.out.println(String.format("La pelicula %s no es thriller", dvdCine.getTituloPelicula()));
		}

		// Miramos si la ficha de la pelicula tiene resumen.
		if (dvdCine.tieneResumen() == true) {
			System.out.println(String.format("La pelicula %s tiene resumen", dvdCine.getTituloPelicula()));
		} else {
			System.out.println(String.format("La pelicula %s no tiene resumen", dvdCine.getTituloPelicula()));
		}

		// Mostramos en formato ficha.
		System.out.println("\n\n\n\n");
		dvdCine.mostrarFicha();
	}
}
