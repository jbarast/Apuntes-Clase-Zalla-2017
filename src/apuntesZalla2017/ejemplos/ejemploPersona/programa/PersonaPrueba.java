//PersonaPrueba.java
//Autor: jbarast
//Fecha : 29/03/2017
//Notas: Programa para probar la programacion orientada a objetos.

package apuntesZalla2017.ejemplos.ejemploPersona.programa;

import java.util.Date;

import apuntesZalla2017.ejemplos.ejemploPersona.tipos.Persona;

public class PersonaPrueba {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// PRIMERO
		Persona p1 = new Persona();
		System.out.println(p1.aTexto());

		p1.setId(5);
		p1.setNombre("Javier");

		System.out.println(String.format("ID: %d, NOMBRE: %s", p1.getId(), p1.getNombre()));

		// SEGUNDO
		p1 = new Persona(1, "Javier");

		// TERCERO
		p1.setFechaNacimiento(new Date("1970/10/20"));

		// CUARTO
		System.out.println(p1.aTexto()); // ID: 1, NOMBRE: Javier

		// Haciendo pruebas extras.
		// Persona p2 = new Persona(89, "Jon");
		// System.out.println(p2.aTexto());

	}

}
