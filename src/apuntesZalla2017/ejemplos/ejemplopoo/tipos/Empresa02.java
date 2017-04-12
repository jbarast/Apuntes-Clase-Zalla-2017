//Empresa02.java
//Autor: jonBarnes
//Fecha: 31/03/2017
//Notas: Clase Empresa copiada a Javier.

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

//Imports.
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import apuntesZalla2017.ejemplos.ejemploPersona.tipos.Persona;

public class Empresa02 {

	// Atributos.

	private String nombre;
	private Persona director;

	// Con personas.
	private Persona[] junta = new Persona[5]; // Declaracion de un array de
												// personas.
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	// Con empleados.

	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

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

	// El setJunta no se hace por que hay que meterlos de uno en uno.
	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	// Nueva funcion. getTotalEmpleados.
	public BigDecimal getTotalSueldoBruto() {
		BigDecimal total = new BigDecimal(0.0);

		Empleado e;
		for (Persona p : personas) {
			if (p instanceof Empleado) {
				e = (Empleado) p;
				total = total.add(e.getSueldoBruto());
			}

		}
		return total;

	}

	// Otras funciones.
	@Override
	public String toString() {
		return "Empresa02 [nombre=" + nombre + ", director=" + director + ", junta=" + Arrays.toString(junta)
				+ ", personas=" + personas + ", empleados= " + empleados + "]";
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
	// Hecho por mi.
	// public void addPersona(Persona persona) {
	// personas.add(persona);
	// }

	// Para añadir personas al arraylist, por el profesor.
	public void addPersona(Persona persona) {

		personas.add(persona);

		if (persona instanceof Empleado) {
		}
	}

	// Para añadir empleados al arraylist.
	public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

}
