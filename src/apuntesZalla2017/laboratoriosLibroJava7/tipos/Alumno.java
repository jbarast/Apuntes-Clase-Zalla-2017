/**
 * <code>Alumno</code>
 */

package apuntesZalla2017.laboratoriosLibroJava7.tipos;

import java.util.ArrayList;

public class Alumno {

	// Atributos.
	private int numMatricula;
	private String nombre;

	// ArrrayLists para guardar las notas.
	ArrayList<Double> notas1 = new ArrayList<Double>();

	// Constructor.
	public Alumno(int numMatricula, String nombre) {
		super();
		this.numMatricula = numMatricula;
		this.nombre = nombre;
	}

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
		return "Alumno [numMatricula=" + numMatricula + ", nombre=" + nombre + "]";
	}

	// Almacenar dos notas en dos ArrayList(double)
	// in: double nota1 y double nota2
	// out: --
	// Notas:--

	public void ponNota(double nota1, double nota2) {
		// TODO Meter las notas en las ArrayList
	}

}
