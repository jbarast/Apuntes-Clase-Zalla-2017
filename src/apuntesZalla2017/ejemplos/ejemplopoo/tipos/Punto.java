//Punto.java
// Autor: jbarast 
//https://github.com/jbarast
//Ejemplo de objeto.
//Fecha : 29/03/2017

package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

public class Punto {

	/*
	 * ************
	 * ATRIBUTOS ***********
	 */
	private double x; // Los private solo se pueden aceder desde la clase
						// propia.
	private double y;

	/*
	 * ************
	 * CONSTRUCTOR ***********
	 */
	// Para el caso que son doubles.
	public Punto(double x, double y) {
		setXDouble(x);
		setYDouble(y);
	}

	// Para el caso que son int.
	public Punto(int x, int y) {
		// setX(x);
		// setY(y);
		// Delegando.

		this((double) x, (double) y); // Pasan el marron al constructor gordo.
	}

	// Para el caso que no pongo ninguno. Lo pongo como doubles.
	public Punto() {
		// setXDouble(0); // En principio no hace falta ponerlo, coje como
		// default
		// el valor de 0,0
		// setYDouble(0);

		// Otra forma de hacerlo.
		this(0.0, 0.0); // Delega el constructor, menos codigo.

	}

	/*
	 * ************
	 * GET Y SET ***********
	 */

	// Creacion de metodos.

	// Metodos set y ge para x e y. En este caso maneja int. Por que como al
	// principio el codigo antiguo la x y la y eran int, para que siga
	// funcionando con los programas antiguas, pueda seguir funcionando.

	public int getX() {
		return (int) x;
	}

	public void setX(int x) {
		this.x = (double) x; // la this.x, es la x de la clase. La x normal es
								// la x del
		// metodo, que introduce el usuario.
	}

	public int getY() {
		return (int) y;
	}

	public void setY(int y) {
		this.y = (double) y;
	}

	// Metodos set y get, para que maneje doubles.

	public double getXDouble() {
		return x;
	}

	public void setXDouble(double x) {
		this.x = x;
	}

	public double getYDouble() {
		return y;
	}

	public void setYDouble(double y) {
		this.y = y;
	}

	// ********
	// Otras funciones.
	//
	// *********
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	// /
}
