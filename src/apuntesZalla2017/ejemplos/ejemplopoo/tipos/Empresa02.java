//Empresa02.java
//Autor: jonBarnes
//Fecha: 31/03/2017
//Notas: Clase Empresa copiada a Javier.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

//Imports.
import java.util.ArrayList;
import java.util.Arrays;

import apuntesZalla2017.ejemplos.ejemploPersona.tipos.Persona;

public class Empresa02 {

	// Atributos.

	private String nombre;
	private Persona director;

	private Persona[] junta = new Persona[5]; // Declaracion de un array de
												// personas.
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	// Constructores.

	public Empresa02(String nombre, Persona director) {
		super();
		this.nombre = nombre;
		this.director = director;

	}

	// Getters y setters.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getDirector() {
		return director;
	}

	public void setDirector(Persona director) {
		this.director = director;
	}

	public Persona[] getJunta() {
		return junta;
	}

	public void setJunta(Persona[] junta) {
		this.junta = junta;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	// Otras funciones.
	@Override
	public String toString() {
		return "Empresa02 [nombre=" + nombre + ", director=" + director + ", junta=" + Arrays.toString(junta)
				+ ", personas=" + personas + "]";
	}

	// Funciones para meter personas en la junta y saber quien esta en esa
	// posicion.
	public void setPersonaJunta(Persona persona, int posicion) {
		this.junta[posicion] = persona;
	}

	public Persona getPersonaJunta(int posicion) {

		return junta[posicion];
	}

	// Para añadir personas al arraylist.
	public void addPersona(Persona persona) {
		personas.add(persona);
	}

}
