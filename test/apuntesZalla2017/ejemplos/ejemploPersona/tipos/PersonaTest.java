package apuntesZalla2017.ejemplos.ejemploPersona.tipos;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonaTest {

	Persona p;
	Date date;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Se inicializa cuando al principio de los tiempos.
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Se inicializa al final de los tiempos.
	}

	@Before
	public void setUp() throws Exception {
		// Se inicializa antes de cada test.
		p = new Persona();
		Date date;
		date = new Date("0999/01/01");
	}

	@After
	public void tearDown() throws Exception {
		// Se inicializa al terminar cada test.
		p = null;
	}

	// Test constructores.
	@Test
	public void testConstructorVacio() {

		// 0, anonimo, new Date("0999/01/01")
		assertEquals("Fallo en Constructor Vacio id", 0, p.getId());
		assertEquals("Fallo en Constructor Vacio nombre", "Anonimo", p.getNombre());

		assertEquals("Fallo en Constructo todos los parametros fecha", date.getMonth(), p.getFechaNacimiento()
				.getMonth());
		assertEquals("Fallo en Constructo todos los parametros fecha", date.getDay(), p.getFechaNacimiento().getDay());
		assertEquals("Fallo en Constructo todos los parametros fecha", date.getYear(), p.getFechaNacimiento().getYear());
	}

	@Test
	public void testConstructorTodosLosParametros() {
		// TODO hacer este test.
		Date date02;
		date02 = new Date(1989 / 10 / 01);
		Persona p2 = new Persona(101, "juan", date);

		assertEquals("Fallo en Constructor todos los parametros id", 101, p2.getId());
		assertEquals("Fallo en Constructor todos los parametros nombre", "juan", p2.getNombre());
		assertEquals("Fallo en Constructo todos los parametros fecha mes", date02.getMonth(), p2.getFechaNacimiento()
				.getMonth());
		assertEquals("Fallo en Constructo todos los parametros fecha dia", date02.getDay(), p2.getFechaNacimiento()
				.getDay());
		assertEquals("Fallo en Constructo todos los parametros fecha año", date02.getYear(), p2.getFechaNacimiento()
				.getYear());
	}

	@Test
	public void testConstructorIdNombre() {

		Persona p3 = new Persona(100, "Jon");

		assertEquals("Fallo en Constructor ConstructorIdNombre id", 100, p3.getId());
		assertEquals("Fallo en Constructor ConstructorIdNombre nombre", "Jon", p3.getNombre());
		assertEquals("Fallo en Constructo ConstructorIdNombre fecha", "0999/01/01", p3.getFechaNacimiento());
	}

	@Test
	public void testGetId() {
		assertEquals("Fallo getId", 0, p.getId());
	}

	@Test
	public void testSetId() {
		p.setId(153);
		assertEquals("Fallo setID", 153, p.getId());
	}

	@Test
	public void testGetNombre() {
		assertEquals("Fallo getNombre", "Anonimo", p.getNombre());
	}

	@Test
	public void testSetNombre() {
		p.setNombre("Michel");
		assertEquals("Fallo setNombre", "Michel", p.getNombre());
	}

	@Test
	public void testSetFechaNacimiento() {

		Date date;
		date = new Date("1989/11/01");
		p.setFechaNacimiento(date);
		assertEquals("Fallo en Constructo Vacio fecha", date, p.getFechaNacimiento());

	}

	@Test
	public void testGetFechaNacimiento() {
		assertEquals("Fallo getFechaNacimiento", "0999/01/01", p.getFechaNacimiento());
	}

	@Test
	public void testATexto() {
		assertEquals("Fallo aTexto", "ID: 0, NOMBRE: Anonimo, FECHA_NACIMIENTO: 099-01-01", p.aTexto());
	}

}
