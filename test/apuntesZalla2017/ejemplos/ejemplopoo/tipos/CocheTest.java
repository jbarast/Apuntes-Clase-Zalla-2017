//CocheTest.java
//Autor: jbarast.
//Fecha: 30/03/2017
//Notas: Test para la clase coche.

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CocheTest {

	// @Test
	// public void test() {
	//
	// //assertTrue(true); -->Hello world de JUNIT?
	// }

	@Test
	public void testConstructorVacio() {
		Coche c = new Coche();
		assertEquals("nisu", c.getMarca());
		assertEquals("Potencia no correacta", 50, c.getPotencia()); // Mensaje
																	// de error,
																	// resultado
																	// esperado,
																	// el
																	// resultado
																	// del
																	// programa.
		assertTrue(c.isNuevo());
		assertEquals("Precio incorrecto", 0, c.getAntiguedad());
		assertEquals("Precio incorrecto", 500, c.getPrecio());

	}

	@Test
	public void testConstructorParametros() {
		Coche ferrari = new Coche("ferrari", 900);
		assertEquals("Marca incorrecta", "ferrari", ferrari.getMarca());
		assertEquals("Potencia incorrecta", 900, ferrari.getPotencia());
		assertEquals("Estado incorrecto", true, ferrari.isNuevo());

	}

	@Test
	public void testPrecio() {
		// Creamos el coche.
		Coche honda = new Coche("honda", 150);
		// Miramos que lo crea bien.
		assertEquals("Precio incorrecto", 500, honda.getPrecio());
		// Cambiamos la antiguedad para el caso que tenga un ano de antiguedad.
		honda.setAntiguedad(1);
		assertEquals("Precio incorrecto", 1, honda.getAntiguedad());
		assertEquals("Precio incorrecto", 300, honda.getPrecio());
		// Cambiamos la antiguedad para el caso que tenga dos anos o mas de
		// antiguedad.
		honda.setAntiguedad(2);
		assertEquals("Precio incorrecto", 100, honda.getPrecio());
		honda.setAntiguedad(5);
		assertEquals("Precio incorrecto", 100, honda.getPrecio());
		honda.setAntiguedad(-5);
		assertEquals("Precio incorrecto", 500, honda.getPrecio());

		// Cambiamos precio.
		honda.setPrecio(1000);
		honda.setAntiguedad(0);
		assertEquals("Precio incorrecto", 5000, honda.getPrecio());
		// Cambiamos la antiguedad para el caso que tenga un ano de antiguedad.
		honda.setAntiguedad(1);
		assertEquals("Precio incorrecto", 1, honda.getAntiguedad());
		assertEquals("Precio incorrecto", 3000, honda.getPrecio());
		// Cambiamos la antiguedad para el caso que tenga dos anos o mas de
		// antiguedad.
		honda.setAntiguedad(150);
		assertEquals("Precio incorrecto", 1000, honda.getPrecio());

	}
}
