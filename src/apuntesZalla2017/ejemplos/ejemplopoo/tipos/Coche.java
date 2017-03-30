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

	// Constructores.
	public Coche() {
		super();
		this.marca = "nisu";
		this.potencia = 50;
		this.nuevo = true;
	}

	public Coche(String marca, int potencia) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.nuevo = true;
	}

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

	// Otras funcionalidades.
	@Override
	public String toString() {
		return "Coche [marca=" + getMarca() + ", potencia=" + getPotencia() + ", nuevo=" + isNuevo() + "]";
	}

}
