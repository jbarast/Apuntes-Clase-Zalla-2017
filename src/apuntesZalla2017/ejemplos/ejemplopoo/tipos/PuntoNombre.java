//PuntoNombre.java
//Autor: @jonBarnes @jbarast (Github)
//Fecha: 05/04/2017
//Notas: Primer ejemplo de herecias en clases. Clase hija de la clase Punto.

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

public class PuntoNombre extends Punto {

	// Atributos.

	private String nombre;

	// Constructores.

	// getters y setters.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Otras funciones.
	// TODO arreglar esto bien.
	@Override
	public String toString() {
		return String.format("%s [x: %d, y: %d]", this.getNombre(), this.getX(), this.getY());
	}

}
