//Puesto.java
//Autor: @jbarast
//Fecha: 06/04/2017
//Notas: Creacion de la clase puesto.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import java.math.BigDecimal;

import apuntesZalla2017.ejemplos.ejemplopoo.enums.EnumPuestos;

public class Puesto {

	// Atributos.

	private EnumPuestos puesto;
	private double salarioBase;
	private BigDecimal salarioBaseBG;

	// private double salario;

	// Constructor.

	public Puesto(EnumPuestos puesto) {

		this.puesto = puesto;
		this.salarioBase = 1000.0;
		this.salarioBaseBG = new BigDecimal(salarioBase);

	}

	public Puesto(EnumPuestos puesto, double salarioBase) {
		this.puesto = puesto;
		this.salarioBase = salarioBase;
		this.salarioBaseBG = new BigDecimal(salarioBase);

	}

	public Puesto(EnumPuestos puesto, BigDecimal salarioBaseBG) {
		this.puesto = puesto;
		this.salarioBaseBG = salarioBaseBG;
	}

	// Getters y Setters.

	public EnumPuestos getPuesto() {
		return puesto;
	}

	public BigDecimal getSalarioBaseBG() {
		return salarioBaseBG;
	}

	public void setSalarioBaseBG(BigDecimal salarioBaseBG) {
		this.salarioBaseBG = salarioBaseBG;
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

	@Override
	public String toString() {
		return "Puesto [puesto=" + puesto + ", salarioBase=" + salarioBase + ", salarioBaseBG=" + salarioBaseBG + "]";
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
		case JUNTA:
			salarioPuesto = this.salarioBase * 4;
			break;
		case EMPLEADO:
			salarioPuesto = this.salarioBase * 1;
			break;

		case DIRECTOR:
			salarioPuesto = this.salarioBase * 6;
			break;

		}
		return salarioPuesto;
	}

	// getSalarioBG()
	// in:--
	// out: BigDecimal() salario
	// Nos dice cuanto es el salario respecto del puesto
	public BigDecimal getSalarioBG() {

		// variable interna para el salario.

		double salarioPuesto = 0.0;

		// switch case:
		switch (this.puesto) {
		case JUNTA:
			salarioPuesto = this.salarioBase * 4;
			break;
		case EMPLEADO:
			salarioPuesto = this.salarioBase * 1;
			break;

		case DIRECTOR:
			salarioPuesto = this.salarioBase * 6;
			break;

		}
		return new BigDecimal(salarioPuesto);
	}

}
