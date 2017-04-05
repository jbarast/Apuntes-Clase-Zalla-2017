//Producto.java
//Autor: J.Barnes (Github: jbarast)
//Fecha: 03/04/2017
//Notas: Clase Producto.java

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import java.math.BigDecimal;

public class Producto {

	// Atributos:

	int id;
	String producto;
	double precio;
	private BigDecimal precioSeguro;

	// Constructor.
	// Siempre hay que meter id, nombre del producto y precio.

	public Producto(int id, String producto, double precio) {
		super();
		this.id = id;
		this.producto = producto;
		// this.precio = precio;
		setPrecio(precio); // Para hacer unas pruebas.

	}

	// Getter and Setters.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		// setPrecioSeguro(new BigDecimal(precio));
		setPrecioSeguro(new BigDecimal(String.format("%.2f", precio).replace(',', '.')));
	}

	public BigDecimal getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(BigDecimal precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	// Otras funciones

	@Override
	public String toString() {
		return "ID:" + id + " " + producto + " " + precio + "\n";
	}

}
