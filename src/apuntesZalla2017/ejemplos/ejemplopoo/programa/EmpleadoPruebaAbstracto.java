//EmpleadoPruebaAbstracto.java
//Autor: @jbarast
//Fecha: 10/04/2017
//Notas: Probando clases abstractas.
package apuntesZalla2017.ejemplos.ejemplopoo.programa;

//imports:
import java.util.ArrayList;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.Empleado;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.EmpleadoIndefinido;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.EmpleadoPorHoras;

public class EmpleadoPruebaAbstracto {

	public static void main(String[] args) {

		// Creamos la lista de empleados.
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		empleados.add(new EmpleadoPorHoras("Javier", 8, 15.0));
		empleados.add(new EmpleadoIndefinido("Jon", 14, 36000.0));

		for (Empleado empleado : empleados)
			System.out.println(empleado.getSueldo());
	}

}
