package apuntesZalla2017.ejemplos.ejemplopoo.programa;

import java.math.BigDecimal;

//Imports.
import apuntesZalla2017.ejemplos.ejemploPersona.tipos.Persona;
import apuntesZalla2017.ejemplos.ejemplopoo.enums.EnumPuestos;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Empleado;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Empresa02;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Puesto;

;

public class EmpleadoPrueba {

	public static void main(String[] args) {

		Puesto puesto = new Puesto(EnumPuestos.DIRECTOR);

		Empresa02 e = new Empresa02("SLSA", new Persona(1, "Jefe JEfacez"));

		Persona p = new Persona(2, "Invitado Invitadez");
		Empleado e1 = new Empleado(3, "Empleado Epeadez", new BigDecimal(111110.0));
		Empleado e2 = new Empleado(3, "Empleado EMpeadez", new BigDecimal(200000.0));

		Empleado e3 = new Empleado(3, "Puesto Puesto", puesto);

		// Añadimos los empleados.
		e.addEmpleado(e1);
		e.addEmpleado(e2);
		e.addEmpleado(e3);

		// Añadimos una persona.
		e.addPersona(p);
		// System.out.println(p); //Linea de comprobacion.

		// Imprimimos los empleados.
		System.out.println(e);

		System.out.println(e1.getSueldoBruto());
		System.out.println(e3.getSueldoBruto());
		System.out.println(e3.getPuesto());
		System.out.println(puesto.getSalario());
		System.out.println(puesto.getSalarioBase());

	}
}
