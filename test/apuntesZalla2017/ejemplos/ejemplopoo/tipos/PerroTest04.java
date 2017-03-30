//PerroTest04.java
//Autor: jbarast
//Fecha: 30/03/2017
//Notas: Test para la clase Perro.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

;

public class PerroTest04 {

	// Atributo para el test.
	Perro perro;

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
		perro = new Perro("laika");
	}

	@After
	public void tearDown() throws Exception {
		// Se ejecuta despues de acada @Test
		perro = null;
	}

	@Test
	public void testPerro() {
		assertNotNull(perro);
		assertEquals("Fallo constructor simple nombre", "laika", perro.getNombre());
		assertEquals("Fallo constructor simple pulgas", false, perro.isPulgas());
		assertEquals("Fallo constructor simple dueño", "no dueño", perro.getDueno());
		assertEquals("Fallo constructor simple raza", "milrazas", perro.getRaza());

	}

	@Test
	public void testGetNombre() {
		assertEquals("Falla el getNombre", "laika", perro.getNombre());
	}

	@Test
	public void testSetNombre() {
		perro.setNombre("Sin nombre");
		assertEquals("Fallfa el setNombre", "Sin nombre", perro.getNombre());
	}

	@Test
	public void testGetRaza() {
		assertEquals("Fallo getRaza", "milrazas", perro.getRaza());
	}

	@Test
	public void testSetRaza() {
		perro.setRaza("dalmata");
		assertEquals("Fallo setRaza", "dalmata", perro.getRaza());

	}

	@Test
	public void testGetDueno() {
		assertEquals("Fallo getDueno", "no dueño", perro.getDueno());
	}

	@Test
	public void testSetDueno() {
		perro.setDueno("Jon");
		assertEquals("Fallo setDueno", "Jon", perro.getDueno());
	}

	@Test
	public void testIsPulgas() {
		assertEquals("Fallo  isPulgas", false, perro.isPulgas());
	}

	@Test
	public void testSetPulgas() {
		perro.setPulgas(true);
		assertEquals("Fallo  setPulgas", true, perro.isPulgas());

	}

	@Test
	public void testToString() {
		assertEquals("Fallo toString", "Perro [nombre=" + "laika" + ", raza=" + "milrazas" + ", dueno=" + "no dueño"
				+ ", pulgas=" + false + "]", perro.toString());
	}

}
