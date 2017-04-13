package apuntesZalla2017.laboratoriosLibroJava7.tipos;

import java.util.ArrayList;

/**
 * <h1>Definicion:</h1>
 * <p>
 * La clase <code>Alumno.java</code> define el objeto Alumno.
 * </p>
 * 
 * @author jbarast
 * @version 13/04/2017
 * @see https://github.com/jbarast/Apuntes-Clase-Zalla-2017
 * 
 */
public class Alumno {

	// Atributos.
	private int numMatricula;
	private String nombre;

	// ArrrayLists para guardar las notas.
	ArrayList<Double> notas1 = new ArrayList<Double>();

	// Constructor.
	/**
	 * Constructor con todos los elementos.
	 * 
	 * @param numMatricula
	 * @param nombre
	 */
	public Alumno(int numMatricula, String nombre) {
		super();
		this.numMatricula = numMatricula;
		this.nombre = nombre;
	}

	/**
	 * Constructor vacio. Crea el alumno "Anonimo" con el codigo 0.
	 */
	public Alumno() {
		this(0, "Anonimo");
	}

	// getters y setters.
	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Otros metodos.
	@Override
	public String toString() {
		return "Alumno [numMatricula=" + numMatricula + ", nombre=" + nombre
				+ "]";
	}

	// Almacenar dos notas en dos ArrayList(double)
	// in: double nota1 y double nota2
	// out: --
	// Notas:--

	/**
	 * Mete en dos ArrayList<double> las notas1 y notas2
	 * 
	 * @param nota1
	 * @param nota2
	 *            Notas: --
	 */

	public void ponNota(double nota1, double nota2) {
		// TODO Meter las notas en las ArrayList
	}

}
