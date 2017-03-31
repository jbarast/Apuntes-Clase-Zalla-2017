//Empresa.java
//Autor: jonBarnes
//Fecha: 31/03/2017
//Notas: Creacion de la clase empresa.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

//Imports.
import apuntesZalla2017.ejemplos.ejemploPersona.tipos.Persona;

public class Empresa {

	// Atributos.

	private String nombreEmpresa;
	private int numeroEmpleados;
	private int numeroJuntaDirectiva; // No se si es necesaria.
	private Persona director;
	private Persona[] juntaDirectiva;
	private Persona[] empleados;

	// Constructores.

	// Constructor con nombre de la empresa, consideramos el constructor minimo.
	public Empresa(String nombreEmpresa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.director = null;
		this.numeroEmpleados = 0;
		this.numeroJuntaDirectiva = 0;
		this.juntaDirectiva = null;
		this.empleados = null;
	}

	// Constructor Empresa con nombre de empresa y director.

	public Empresa(String nombrePersona, Persona director) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.director = director;
		this.numeroEmpleados = 1; // Consideramos al director como empleado.
		this.numeroJuntaDirectiva = 0;
		this.juntaDirectiva = null;
		this.empleados = null;

	}

}
