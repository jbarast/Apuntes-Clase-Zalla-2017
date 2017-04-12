//PuntoNombre.java
//Autor: @jonBarnes @jbarast (Github)
//Fecha: 05/04/2017
//Notas: Primer ejemplo de herecias en clases. Clase hija de la clase Punto.

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

public class PuntoNombre extends Punto {

	// Atributos.

	private String nombre;

	// Constructores.
	public PuntoNombre() {
		// super(); // No hereda el constructor del padre, si no, que lo
		// utiliza.
		// this.nombre = "Punto";
		this(0, 0, "Anónimo");
	}

	public PuntoNombre(int x, int y, String nombre) {

		super(x, y); // No hereda el constructor del padre, si no, que lo
						// utiliza.
		this.nombre = nombre;
	}

	// getters y setters.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Otras funciones.
	@Override
	public String toString() {

		return String.format("%s [x: %d, y: %d]", this.getNombre(), this.getX(), this.getY());
	}

}
