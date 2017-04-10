//EmpleadoIndefinido.java
//Autor: @jbarast
//Fecha: 10/04/2017
//Notas: Ejemplo de una clase que hereda de una clase abstracta.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos;

public class EmpleadoIndefinido extends Empleado {

	// Atributos.

	private int nPagas;
	private double sueldoAnual;

	// Constructores.

	public EmpleadoIndefinido(String nombre, int nPagas, double sueldoAnual) {
		super(nombre);
		this.nPagas = nPagas;
		this.sueldoAnual = sueldoAnual;
	}

	// getter y setters.

	public int getnPagas() {
		return nPagas;
	}

	public void setnPagas(int nPagas) {
		this.nPagas = nPagas;
	}

	public double getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(double sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	// Otros metodos.

	@Override
	public String toString() {
		return super.toString() + "EmpleadoIndefinido [nPagas=" + nPagas + ", sueldoAnual=" + sueldoAnual + "]";
	}

	@Override
	public double getSueldo() {
		return this.sueldoAnual / this.nPagas;
	}

}
