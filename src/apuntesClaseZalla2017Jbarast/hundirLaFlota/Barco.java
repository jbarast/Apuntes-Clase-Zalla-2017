// Barco.java

/*
 * Nombre : Barco.java
 * Autor : J.Barnes https://github.com/jbarast
 * Fecha : 26-03-2017
 * Notas: Objeto barco. Mas que nada crea un objeto con unas coordenadas x e y.
 * 
 */
package apuntesClaseZalla2017Jbarast.hundirLaFlota;

//Librerias.

public class Barco {

	// Atributos.

	private int xCoordenadaBarco;
	private int yCoordenadaBarco;

	// Constructor.

	public Barco(int x, int y) {

		this.xCoordenadaBarco = x;
		this.yCoordenadaBarco = y;
	}

	public Barco() {

		this.xCoordenadaBarco = 0;
		this.yCoordenadaBarco = 0;
	}

	public int getxCoordenadaBarco() {
		return xCoordenadaBarco;
	}

	public void setxCoordenadaBarco(int xCoordenadaBarco) {
		this.xCoordenadaBarco = xCoordenadaBarco;
	}

	public int getyCoordenadaBarco() {
		return yCoordenadaBarco;
	}

	public void setyCoordenadaBarco(int yCoordenadaBarco) {
		this.yCoordenadaBarco = yCoordenadaBarco;
	}

	@Override
	public String toString() {
		return "Barco [xCoordenadaBarco=" + xCoordenadaBarco + ", yCoordenadaBarco=" + yCoordenadaBarco + "]";
	}

}
