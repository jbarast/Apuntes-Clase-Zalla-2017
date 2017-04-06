package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class EmpleadoTest {

	// Atributo para el test.
	Empleado empleado;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Se crea antes del principio de los tiempos.
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Se crea antes del final de los tiempos.
	}

	@Before
	public void setUp() throws Exception {
		// Se crea al inicializar cada test.
		empleado = new Empleado(); // Se crea uno vacio.
	}

	@After
	public void tearDown() throws Exception {
		// Se crea al finalizar cada test.
		empleado = null;
	}

	// @Test
	// public void testEmpleado() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testEmpleadoIntStringDateIntIntStringStringDouble() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetDni() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testSetDni() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetNumeroSeguridadSocial() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testSetNumeroSeguridadSocial() {
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
	// public void testGetEmpresa() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testSetEmpresa() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testGetSueldoBruto() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testSetSueldoBruto() {
	// fail("Not yet implemented");
	// }
	//
	// @Test
	// public void testToString() {
	// fail("Not yet implemented");
	// }

}
