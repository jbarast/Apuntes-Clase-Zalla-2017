//Empresa02Test.java
//Autor: jonBarnes
//Fecha: 31/03/2017
//Notas: Test para la clase Empresa02.java

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

//Los imports

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import apuntesZalla2017.ejemplos.ejemploPersona.tipos.Persona;

public class Empresa02Test {

	// Atributos necesarios para hacer todos los teses.
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
		// Se crea al inicializar cada uno de los teses.
		Persona director = new Persona("Juanito");
		empresa = new Empresa02("empresa", director);

	}

	@After
	public void tearDown() throws Exception {
		// Se ejecuta al terminar cada uno de los teses-
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

	// TODO terminar de hacer los siguinetes tesese de los getters y setters.
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

	// Test de otras funiones.

	@Test
	public void setPersonaJunta() {
		// Creamos dos personas para el test.
		Persona persona1 = new Persona("persona1");
		Persona persona2 = new Persona("persona2");
		// Metemos a dos personas en la junta.
		empresa.setPersonaJunta(persona1, 2);
		empresa.setPersonaJunta(persona2, 4);
		// Miramos si se han creado las dos personas y una posicion null.
		assertEquals("Fallo en setPersonaJunta", persona1, empresa.getPersonaJunta(2));
		assertEquals("Fallo en setPersonaJunta", empresa.getPersonaJunta(4));
		assertEquals("Fallo en setPersonaJunta, tendria que ser Null", empresa.getPersonaJunta(3));

	}

	// TODO este test no me gusta demasiado.
	@Test
	public void getPersonaJunta() {
		// Creamos dos personas para el test.
		Persona persona1 = new Persona("persona1");
		Persona persona2 = new Persona("persona2");
		// Metemos a dos personas en la junta.
		empresa.setPersonaJunta(persona1, 2);
		empresa.setPersonaJunta(persona2, 4);
		// Miramos si se han creado las dos personas y una posicion null.
		assertEquals("Fallo en getPersonaJunta", persona1, empresa.getPersonaJunta(2));
		assertEquals("Fallo en getPersonaJunta", persona2, empresa.getPersonaJunta(4));
		assertEquals("Fallo en setPersonaJunta, tendria que ser null", null, empresa.getPersonaJunta(3));
	}

	// TODO test addPersona, hacerlo.

}
