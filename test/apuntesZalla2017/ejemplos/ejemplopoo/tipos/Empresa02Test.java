package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import apuntesZalla2017.ejemplos.ejemploPersona.tipos.Persona;

public class Empresa02Test {

	Empresa02 empresa;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Antes de empezar el test.
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Despues de terminar.
	}

	@Before
	public void setUp() throws Exception {
		Persona director = new Persona("Juanito");
		empresa = new Empresa02("empresa", director);

	}

	@After
	public void tearDown() throws Exception {

		empresa = null;
	}

	@Test
	public void testConstructorNombreDirector() {
		assertNotNull(empresa);
		assertEquals("Fallo constructor Nombre/Director en Director", "Juanito", empresa.getDirector().getNombre());
		assertEquals("Fallo constructor Nombre/Director en Nombre", "empresa", empresa.getNombre());
	}

	// Test set y getters.
	@Test
	public void testGetNombre() {
		assertEquals("Fallo getNombre", "empresa", empresa.getNombre());
	}

	@Test
	public void testSetNombre() {
		empresa.setNombre("Ipartek");
		assertEquals("Fallo setNombre", "Ipartek", empresa.getNombre());
	}

	@Test
	public void testGetDirector() {
		assertEquals("Fallo getDirector", "Juanito", empresa.getDirector().getNombre());
	}

	@Test
	public void testSetDirector() {
		Persona persona = new Persona("director");
		empresa.setDirector(persona);
		assertEquals("Fallo setDirector", "director", empresa.getDirector().getNombre());
	}

	// @Test
	// public void testGetJunta() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testSetJunta() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetPersonas() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testSetPersonas() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testToString() {
	// fail("Not yet implemented");
	// }

}
