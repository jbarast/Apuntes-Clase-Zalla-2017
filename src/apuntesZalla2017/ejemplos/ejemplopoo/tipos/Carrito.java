//Carrito.java
//Autor: J.Barnes (Github:jbarast)
//Fecha: 03/04/2017
//Notas: Clase Carrito para el ejercicio del 03/04/2017.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import java.math.BigDecimal;
import java.util.ArrayList;

//imports.

public class Carrito {

	// atributos.

	private ArrayList<Producto> arrayListCarrito;

	// Constructor.

	// Creando un carrito sin valor inicial.
	public Carrito() {
		this.arrayListCarrito = new ArrayList<Producto>();

	}

	// Creandolo con un producto inicial.
	public Carrito(Producto producto) {
		this.arrayListCarrito = new ArrayList<Producto>();
		this.arrayListCarrito.add(producto);

	}

	// Metiendo un ArrayList.
	public Carrito(ArrayList<Producto> arrayListCarrito) {
		super();
		this.arrayListCarrito = arrayListCarrito;
	}

	// Getters and Setters normales.
	public ArrayList<Producto> getArrayListCarrito() {
		return arrayListCarrito;
	}

	public void setArrayListCarrito(ArrayList<Producto> arrayListCarrito) {
		this.arrayListCarrito = arrayListCarrito;
	}

	// Otras funciones.
	@Override
	public String toString() {
		return "" + arrayListCarrito; // El que
										// viene
										// de
										// serie.

	}

	// Funcion: getPrecioTotal(),
	// Int: --
	// Out: float precioTotal.
	// Funcion que nos devuelve el precio total
	public double getPrecioTotal() {

		// Hacemos la suma.
		double precioTotal = 0.0;

		for (Producto dato : arrayListCarrito) {
			precioTotal += dato.getPrecio();
		}

		return Math.round(precioTotal * 100.0) / 100.0; // Metodo para hacer el
														// round.

	}

	// Funcion: getPrecioTotalSeguro(),
	// Int: --
	// Out: BigDecimal precioTotal.
	// Funcion que nos devuelve el precio total en BigDecimal
	public BigDecimal getPrecioTotalSeguro() {
		// Creamos el BigDecimal
		BigDecimal precioTotal = new BigDecimal(0.0);

		// Sacamos los precios.
		for (Producto p : arrayListCarrito) {
			precioTotal = precioTotal.add(p.getPrecioSeguro());
		}

		return precioTotal;
	}

	// Funcion: add(),
	// Int: Producto producto
	// Out: --.
	// Funcion: Mete un elemento en la "ArrayList" Carrito.

	public void add(Producto producto) {

		this.arrayListCarrito.add(producto);
	}

	// Funcion: numeroArticulos(),
	// Int: --
	// Out: int numeroArticulos
	// Funcion: Nos dice cuantos articulos tenemos.

	public int getNumeroDeArticulos() {
		return arrayListCarrito.size();
	}

	// Funcion: getIva(),
	// Int: --
	// Out: float iva
	// Funcion: Nos dal el valor del iva.

	public double getIvaSobrePrecioTotal() {
		// Hacemos la suma.
		final double VALOR_IVA = 21;

		// System.out.println(((double) 21 / (double) 100));

		// Calculamos el iva y lo devolvemos.

		return Math.round((this.getPrecioTotal() * (VALOR_IVA / 100)) * 100.0) / 100.0;

	}

	// Funcion: getPrecioTotalIva(),
	// Int: --
	// Out: double precioTotalIva
	// Funcion: Nos da el precio con el IVA.

	public double getPrecioTotalConIva() {

		return Math.round((this.getPrecioTotal() + this.getIvaSobrePrecioTotal()) * 100.0) / 100.0;

	}

}
