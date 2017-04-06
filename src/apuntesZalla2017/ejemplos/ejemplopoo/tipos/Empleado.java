//Empleado.java
//Autor: @jbarast
//Fecha: 06/04/2017
//Notas: Clase Empleado para un ejercicio de clase.

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import java.util.Date;

import apuntesZalla2017.ejemplos.ejemploPersona.tipos.Persona;

public class Empleado extends Persona {

	// Atributos.

	private int dni;
	private int numeroSeguridadSocial;
	private Puesto puesto;
	private String empresa;
	private double sueldoBruto;

	// Constructor.

	// Mirar bien si que datos quiero meter bien.
	public Empleado() {
		super();
	}

	public Empleado(int dni) {
		super();
		this.dni = dni;
	}

	// Constructor completo.
	public Empleado(int id, String nombre, Date fechaNacimiento, int dni, int numeroSeguridadSocial, Puesto puesto,
			String empresa, double sueldoBruto) {
		super(id, nombre, fechaNacimiento);
		this.dni = dni;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.puesto = puesto;
		this.empresa = empresa;
		this.sueldoBruto = sueldoBruto;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	// Getter y setters.

	public int getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(int numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	// Otras funciones.
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", numeroSeguridadSocial=" + numeroSeguridadSocial + ", puesto=" + puesto
				+ ", empresa=" + empresa + ", sueldoBruto=" + sueldoBruto + "]";
	}

}
