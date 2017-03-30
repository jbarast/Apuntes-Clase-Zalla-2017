//Coche.java
//Autor: jbarast
//Fecha: 30/03/2017
//Notas: POJO coche

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

public class Coche {

	// Atributos.
	private String marca;
	private int potencia;
	private boolean nuevo;
	private int antiguedad;
	private int precio;

	// Constructores.
	public Coche() {
		super();
		this.marca = "nisu";
		this.potencia = 50;
		this.nuevo = true;
		this.antiguedad = 0;
		this.precio = 100;
	}

	public Coche(String marca, int potencia) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;
		this.antiguedad = 0;
		this.precio = 100;
	}

	// public Coche(String marca, int potencia, int antiguedad) {
	// super();
	// this.marca = marca;
	// this.potencia = potencia;
	// this.nuevo = true;
	// this.antiguedad = 100;
	// this.precio = antiguedad;
	// }

	// Getters y setters.

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getPrecio() {
		// El precio depende de la antiguedad.
		int multiplicador = 1;

		if (antiguedad <= 0) {
			multiplicador = 5;
		} else if (antiguedad == 1) {
			multiplicador = 3;
		}

		// } else if (antiguedad >= 2) {
		// multiplicador = 1;
		//
		// }
		return precio * multiplicador;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// Otras funcionalidades.
	@Override
	public String toString() {
		return "Coche [marca=" + getMarca() + ", potencia=" + getPotencia() + ", nuevo=" + isNuevo() + "]";
	}

}
