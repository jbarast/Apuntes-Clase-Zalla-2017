//Persona.java

//Autor: jbarast 
//Fecha : 29/03/2017
//Notas : La clase Persona.

package apuntesZalla2017.ejemplos.ejemploPersona.tipos;

import java.util.Date;

public class Persona {

	// Variables
	private int id;
	private String nombre;

	private Date fechaNacimiento;

	// Metodos set y get.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Constructor.

	public Persona(int id, String nombre) {

		setId(id);
		setNombre(nombre);

	}

	public Persona() {
		this(0, "");
	}

	// Metodos.

	public String aTexto() {
		return "ID: " + id + ", NOMBRE: " + nombre + ", FECHA NACIMIENTO: " + fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {

		this.fechaNacimiento = fechaNacimiento;

	}

}
