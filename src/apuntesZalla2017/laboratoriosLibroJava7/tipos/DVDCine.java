package apuntesZalla2017.laboratoriosLibroJava7.tipos;

import java.util.ArrayList;

import apuntesZalla2017.laboratoriosLibroJava7.enums.GenerosCine;

/**
 * 
 * <h1>DVDCine</h1>
 * 
 * <p>
 * Clase DVDCine. Ejercicio en la pagina 147.
 * </p>
 * 
 * @author jbarast
 * @version 19/04/2017
 * 
 *
 */
public class DVDCine {

	// atributos.
	private String tituloPelicula;
	private String directorPelicula;
	private ArrayList<String> actoresPeliculas = new ArrayList<String>();
	private GenerosCine generoPelicula;
	private int duracionPelicula;
	private String resumenPelicula;

	// Constructor
	public DVDCine(String tituloPelicula, String directorPelicula, ArrayList<String> actoresPeliculas,
			GenerosCine generoPelicula, int duracionPelicula, String resumenPelicula) {
		super();
		this.tituloPelicula = tituloPelicula;
		this.directorPelicula = directorPelicula;
		this.actoresPeliculas = actoresPeliculas;
		this.generoPelicula = generoPelicula;
		this.duracionPelicula = duracionPelicula;
		this.resumenPelicula = resumenPelicula;
	}

	public DVDCine(String tituloPelicula, String directorPelicula, ArrayList<String> actoresPeliculas,
			GenerosCine generoPelicula, int duracionPelicula) {

		this(tituloPelicula, directorPelicula, actoresPeliculas, generoPelicula, duracionPelicula, "");

	}

	public DVDCine(String tituloPelicula, String directorPelicula, GenerosCine generoPelicula, int duracionPelicula) {

		// this(tituloPelicula, directorPelicula, null, generoPelicula,
		// duracionPelicula, null);
		this.tituloPelicula = tituloPelicula;
		this.directorPelicula = directorPelicula;
		this.generoPelicula = generoPelicula;
		this.duracionPelicula = duracionPelicula;
		this.resumenPelicula = "";

	}

	// getters y setters.

	public String getTituloPelicula() {
		return tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	public String getDirectorPelicula() {
		return directorPelicula;
	}

	public void setDirectorPelicula(String directorPelicula) {
		this.directorPelicula = directorPelicula;
	}

	public ArrayList<String> getActoresPeliculas() {
		return actoresPeliculas;
	}

	public void setActoresPeliculas(ArrayList<String> actoresPeliculas) {
		this.actoresPeliculas = actoresPeliculas;
	}

	public GenerosCine getGeneroPelicula() {
		return generoPelicula;
	}

	public void GenerosCine(GenerosCine generoPelicula) {
		this.generoPelicula = generoPelicula;
	}

	public int getDuracionPelicula() {
		return duracionPelicula;
	}

	public void setDuracionPelicula(int duracionPelicula) {
		this.duracionPelicula = duracionPelicula;
	}

	public String getResumenPelicula() {
		return resumenPelicula;
	}

	public void setResumenPelicula(String resumenPelicula) {
		this.resumenPelicula = resumenPelicula;
	}

	// otraas funciones.

	@Override
	public String toString() {
		return "DVDCine [tituloPelicula=" + tituloPelicula + ", directorPelicula=" + directorPelicula
				+ ", actoresPeliculas=" + actoresPeliculas + ", generoPelicula=" + generoPelicula
				+ ", duracionPelicula=" + duracionPelicula + ", resumenPelicula=" + resumenPelicula + "]";
	}

	/**
	 * 
	 * <h1>esThriller()</h1>
	 * <p>
	 * Funcion que devuelve un true si la pelicula es del tipo thriller si no un
	 * false.
	 * </p>
	 * 
	 * @return esThriller Devuelve true si es un film tipo thriller.
	 */
	public boolean esThriller() {

		boolean esThriller = false;
		if (this.getGeneroPelicula() == GenerosCine.THRILLER) {
			esThriller = true;
		}

		return esThriller;
	}

	/**
	 * 
	 * <h1>tieneResumen()</h1>
	 * <p>
	 * Metodo que nos devuelve un true o un false, dependiendo de si tiene
	 * resumen o no la ficha del dvd.
	 * </p>
	 * 
	 * 
	 * @return tieneResumen Devuelve true si tiene resumen.
	 */
	public boolean tieneResumen() {
		boolean tieneResumen = false;
		if (!this.getResumenPelicula().isEmpty()) {
			tieneResumen = true;
		}
		return tieneResumen;
	}

	/**
	 * 
	 * <h1>muestraDuraccion()</h1>
	 * <p>
	 * Muestra la duracion de la pelicula en minutos.
	 * </p>
	 * 
	 */
	public void muestraDuracion() {
		System.out.println(String.format("%d min.", this.getDuracionPelicula()));
	}

	/**
	 * Para meter actores al ArrayList al elecenco de actores.
	 * 
	 * @param nombreActor
	 *            Nombre del actor para añadir a la pelicula.
	 */
	public void anadirActor(String nombreActor) {

		this.actoresPeliculas.add(nombreActor);
	}

	public void mostrarFicha() {

		System.out.println("Titulo de la pelicula");
		System.out.println(this.getTituloPelicula());
		System.out.println(String.format("Actores principales: %s", this.getActoresPeliculas()));
		System.out.println(String.format("Director: %s", this.getDirectorPelicula()));
		System.out.println(String.format("Genero: %s", this.getGeneroPelicula()));
		System.out.println(String.format("Duracion: %d", this.getDuracionPelicula()));
		System.out.println(String.format("Resumen: %s", this.getResumenPelicula()));
	}
}
