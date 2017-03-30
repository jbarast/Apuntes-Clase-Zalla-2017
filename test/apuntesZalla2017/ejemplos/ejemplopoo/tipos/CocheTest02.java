//CocheTest02.java
//Autor: jbarast
//Fecha: 30/03/2017
//Notas: Test para la clase coche.

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CocheTest02 {

	Coche coche;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// se ejecuta al iniciar Clase de Test
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// se ejecuta al finalizar Clase de Test
	}

	@Before
	public void setUp() throws Exception {
		// Se ejecuta antes de acada @Test
		coche = new Coche();
	}

	@After
	public void tearDown() throws Exception {
		// Se ejecuta al finalizar cada test.
		coche = null;
	}

	@Test
	public void testCoche() {
		// this.marca = "nisu";
		// this.potencia = 50;
		// this.nuevo = true;
		// this.antiguedad = 0;
		// this.precio = 100;
		assertNotNull("Fallo constructor vacio esta vacio", coche);
		assertEquals("Fallo constructor vacio marca", "nisu", coche.getMarca());
		assertEquals("Fallo constructor vacio potencia", 50, coche.getPotencia());
		assertEquals("Fallo constructor vacio nuevo?", true, coche.isNuevo());
		assertEquals("Fallo constructor vacio antiguedad", 0, coche.getAntiguedad());
		assertEquals("Fallo constructor vacio precio", 500, coche.getPrecio());
	}

	@Test
	public void testCocheConstructorParametros() {
		Coche ferrari = new Coche("ferrari", 900);
		assertNotNull("Fallo constructor con parametros esta vacio", coche);
		assertEquals("Fallo constructor parametros marca", "ferrari", ferrari.getMarca());
		assertEquals("Fallo constructor parametros potencia", 900, ferrari.getPotencia());
		assertEquals("Fallo constructor parametros nuevo?", true, ferrari.isNuevo());
		assertEquals("Fallo constructor parametros antiguedad", 0, ferrari.getAntiguedad());
		assertEquals("Fallo constructor parametros precio", 500, ferrari.getPrecio());
	}

	@Test
	public void testGetMarca() {
		assertEquals("Fallo getMarca", "nisu", coche.getMarca());

	}

	@Test
	public void testSetMarca() {
		coche.setMarca("Honda");
		assertEquals("Fallo setMarca", "Honda", coche.getMarca());
	}

	@Test
	public void testGetPotencia() {
		assertEquals("Fallo getPotencia", 50, coche.getPotencia());
	}

	@Test
	public void testSetPotencia() {
		coche.setPotencia(185);
		assertEquals("Fallo setPotencia", 185, coche.getPotencia());

	}

	@Test
	public void testIsNuevo() {
		assertEquals("Fallo isNuevo", true, coche.isNuevo());
	}

	@Test
	public void testSetNuevo() {
		coche.setNuevo(false);
		assertEquals("Fallo setNuevo", false, coche.isNuevo());
	}

	@Test
	public void testGetAntiguedad() {
		assertEquals("Fallo getAntiguedad", 0, coche.getAntiguedad());
	}

	@Test
	public void testSetAntiguedad() {
		coche.setAntiguedad(15789);
		assertEquals("Fallo setAntiguedad", 15789, coche.getAntiguedad());
	}

	@Test
	public void testGetPrecio() {
		final int PRECIO_INICIAL = 100;

		assertEquals("Fallo getPrecio", PRECIO_INICIAL * 5, coche.getPrecio());

		// Cambiando la antiguedad.
		coche.setAntiguedad(1);
		assertEquals("Fallo getPrecio 1 año antiguedad", PRECIO_INICIAL * 3, coche.getPrecio());
		coche.setAntiguedad(2);
		assertEquals("Fallo getPrecio 2 años antiguedad", PRECIO_INICIAL * 1, coche.getPrecio());
		coche.setAntiguedad(15);
		assertEquals("Fallo getPrecio 15 años antiguedad", PRECIO_INICIAL * 1, coche.getPrecio());
		coche.setAntiguedad(-10);
		assertEquals("Fallo getPrecio antiguedad negativa(-10)", PRECIO_INICIAL * 5, coche.getPrecio());

		// Cambiando el precio.
		coche.setAntiguedad(2);
		coche.setPrecio(2 * PRECIO_INICIAL);
		assertEquals("Fallo getPrecio cambiando el precio y 2 años de antiguedad.", PRECIO_INICIAL * 1 * 2,
				coche.getPrecio());

	}

	@Test
	public void testSetPrecio() {
		// Mirando si funciona bien cambiando el precio.
		coche.setPrecio(5000);
		assertEquals("Fallo setPrecio", 5000 * 5, coche.getPrecio());

	}

	@Test
	public void testToString() {
		assertEquals("Fallo toString", "Coche [marca=" + "nisu" + ", potencia=" + "50" + ", nuevo=" + true + "]",
				coche.toString());
	}

}
