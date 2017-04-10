package apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos;

//import apuntesZalla2017.ejemplos.ejemploPersona.tipos.Persona;

public abstract class Empleado {

	// atributos
	private String nombre;

	// constructor.
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	// getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Otros metodos.
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}

	public abstract double getSueldo();

}
