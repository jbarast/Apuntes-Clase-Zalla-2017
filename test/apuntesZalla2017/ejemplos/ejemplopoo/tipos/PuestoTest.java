//PuestoTest.java
//Autor: @jbarast
//Fecha: 07/04/2017
//Notas: Test para probar la clase Puesto.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import apuntesZalla2017.ejemplos.ejemplopoo.enums.EnumPuestos;

public class PuestoTest {

	// Variable.
	Puesto puesto;
	private EnumPuestos enumPuesto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// En el principio de los tiempos.
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// En el final de los tiempos.
	}

	@Before
	public void setUp() throws Exception {
		// Al principio.
		puesto = new Puesto(enumPuesto.CONSERJE);
	}

	@After
	public void tearDown() throws Exception {
		puesto = null;
	}

	// @Test
	// public void testPuestoEnumPuestos() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testPuestoEnumPuestosDouble() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetPuesto() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testSetPuesto() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetSalarioBase() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testSetSalarioBase() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetSalario() {
	// fail("Not yet implemented");
	// }

}
