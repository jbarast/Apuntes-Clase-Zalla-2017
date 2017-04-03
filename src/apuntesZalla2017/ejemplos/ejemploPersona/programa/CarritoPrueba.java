//CarritoPrueba.java
//Autor: Javier(profesor) y J.Barnes(Github:jbarast)
//Fecha: 03/04/2017
//Notas: Prueba que a de pasar la clase Carrito.java

package apuntesZalla2017.ejemplos.ejemploPersona.programa;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Carrito;
import apuntesZalla2017.ejemplos.ejemplopoo.tipos.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {
		Carrito c = new Carrito();

		c.add(new Producto(1, "Monitor 21", 125.03));
		c.add(new Producto(2, "Placa base ...", 100.2));
		c.add(new Producto(3, "Ratón", 10.3));

		System.out.println(c);

		/*
		 * ID: 1, Monitor 21", 125.03€ ...
		 */

		System.out.println(c.getNumeroDeArticulos());
		System.out.println(c.getPrecioTotal());
		System.out.println(c.getIvaSobrePrecioTotal()); // Asumimos IVA 21%
		System.out.println(c.getPrecioTotalConIva());
	}
}
