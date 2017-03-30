package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PerroTest02 {

	@Test
	public void test() {

		Perro perro = new Perro("Laia");
		assertEquals("Nombre incorrecto", "Laia", perro.getNombre());
		assertEquals("Raza incorrecto", "milrazas", perro.getRaza());
		assertEquals("Dueños incorrecto", "no dueño", perro.getDueno());
		assertEquals("Pulgas Boolean incorrecto", false, perro.isPulgas());
	}

}
