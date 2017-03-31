//Persona.java

//Autor: jbarast 
//Fecha : 29/03/2017
//Notas : La clase Persona.

package apuntesZalla2017.ejemplos.ejemploPersona.tipos;

import java.util.Date;

public class Persona {

	// Atributo.
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

	public void setFechaNacimiento(Date fechaNacimiento) {

		this.fechaNacimiento = fechaNacimiento;

	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	// Constructor.

	public Persona(int id, String nombre, Date fechaNacimiento) {
		setId(id);
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);

	}

	public Persona(int id, String nombre) {

		this(id, nombre, new Date("0999/01/01"));

	}

	public Persona() {
		this(0, "Anonimo", new Date("0999/01/01"));
	}

	public Persona(String nombre) {
		this(0, nombre, new Date("0999/01/01"));
	}

	// Metodos.

	public String aTexto() {
		return String.format("ID: %d, NOMBRE: %s, FECHA_NACIMIENTO: %d-%d-%d", getId(), getNombre(),
				fechaNacimiento.getDay(), fechaNacimiento.getMonth() + 1, fechaNacimiento.getYear() + 1900);
	}

}
