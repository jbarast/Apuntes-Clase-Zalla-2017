//Perro.java
//Autor: jbarast
//Fecha: 30/03/2017
//Notas: Clase Perro

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

public class Perro {

	// Atributos.

	String nombre;
	String raza;
	String dueno;
	boolean pulgas;

	// Constructores.

	public Perro(String nombre) {
		this.nombre = nombre;
		this.raza = "milrazas";
		this.dueno = "no dueño";
		this.pulgas = false;
	}

	// getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(Boolean pulgas) {
		this.pulgas = pulgas;
	}

	// Otras funciones.

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", dueno=" + dueno + ", pulgas=" + pulgas + "]";
	}

}
