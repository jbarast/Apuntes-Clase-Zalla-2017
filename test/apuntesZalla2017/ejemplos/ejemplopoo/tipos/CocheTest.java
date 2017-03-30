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

	}

	@Test
	public void testConstructorParametros() {
		Coche ferrari = new Coche("ferrari", 900);
		assertEquals("Marca incorrecta", "ferrari", ferrari.getMarca());
		assertEquals("Potencia incorrecta", 900, ferrari.getPotencia());
		assertEquals("Estado incorrecto", true, ferrari.isNuevo());

	}

}
