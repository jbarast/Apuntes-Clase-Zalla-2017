//Producto.java
//Autor: J.Barnes (Github: jbarast)
//Fecha: 03/04/2017
//Notas: Clase Producto.java

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

public class Producto {

	// Atributos:

	int id;
	String producto;
	double precio;

	// Constructor.
	// Siempre hay que meter id, nombre del producto y precio.

	public Producto(int id, String producto, double precio) {
		super();
		this.id = id;
		this.producto = producto;
		this.precio = precio;
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

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	// Otras funciones

	@Override
	public String toString() {
		return "ID:" + id + " " + producto + " " + precio + "\n";
	}

}
