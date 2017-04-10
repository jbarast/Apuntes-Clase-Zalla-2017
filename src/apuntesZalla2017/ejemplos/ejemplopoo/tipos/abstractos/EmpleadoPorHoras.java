//EmpleadoPorHoras.java
//Autor: @jbarast
//Fecha: 10/04/2017
//Notas: Clase que hereda de una clase Abstract.

package apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos;

public class EmpleadoPorHoras extends Empleado {

	// atributos.
	private int numeroHoras;
	private double precioHora;

	// constructores

	public EmpleadoPorHoras(String nombre, int numeroHoras, double precioHora) {
		super(nombre);
		this.numeroHoras = numeroHoras;
		this.precioHora = precioHora;
	}

	// getter y setters
	public double getSueldo() {

		return numeroHoras * precioHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	// Otros metodos.

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	@Override
	public String toString() {
		return super.toString() + "EmpleadoPorHoras [numeroHoras=" + numeroHoras + ", precioHora=" + precioHora + "]";
	}

}
