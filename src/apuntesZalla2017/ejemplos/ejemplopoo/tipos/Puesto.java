//Puesto.java
//Autor: @jbarast
//Fecha: 06/04/2017
//Notas: Creacion de la clase puesto.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import apuntesZalla2017.ejemplos.ejemplopoo.enums.EnumPuestos;

public class Puesto {

	// Atributos.

	private EnumPuestos puesto;
	private double salarioBase;

	// private double salario;

	// Constructor.

	public Puesto(EnumPuestos puesto) {

		this.puesto = puesto;
		this.salarioBase = 1000.0;

	}

	public Puesto(EnumPuestos puesto, double salarioBase) {
		this.puesto = puesto;
		this.salarioBase = salarioBase;

	}

	// Getters y Setters.

	public EnumPuestos getPuesto() {
		return puesto;
	}

	public void setPuesto(EnumPuestos puesto) {
		this.puesto = puesto;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	// Otras funciones.
	@Override
	public String toString() {
		return String.format("El salario para el puesto %s es %d", this.getPuesto(), this.getSalario());
	}

	// getSalario()
	// in:--
	// out: double salario
	// Nos dice cuanto es el salario respecto del puesto
	public double getSalario() {

		// variable interna para el salario.

		double salarioPuesto = 0;

		// switch case:
		switch (this.puesto) {
		case PORTERO:
			salarioPuesto = this.salarioBase * 1;
			break;
		case CONSERJE:
			salarioPuesto = this.salarioBase * 2;
			break;
		case PROGRAMADOR:
			salarioPuesto = this.salarioBase * 3;
			break;
		case SECRETARIO:
			salarioPuesto = this.salarioBase * 4;
			break;
		case JUNTERO:
			salarioPuesto = this.salarioBase * 5;
			break;
		case DIRECTOR:
			salarioPuesto = this.salarioBase * 6;
			break;
		case DUENO:
			salarioPuesto = this.salarioBase * 7;
			break;
		}
		return salarioPuesto;
	}

}
