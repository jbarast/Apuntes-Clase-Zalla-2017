//Figuras.java
//Autor: @jbarast
//Fecha: 12/04/2017
//Notas: Ejercicio pag.185

package apuntesZalla2017.laboratoriosLibroJava7.tipos;

import java.util.ArrayList;

public class Figuras {

	// atributos.
	private int lados;
	// private double[] longitud;
	ArrayList<Double> longitudes = new ArrayList<Double>();

	// Constructor:

	public Figuras(int lados) throws Exception {

		if (lados <= 2) {
			throw (new Exception("Exception;Numero de lados no valido"));
		}
		this.lados = lados;

	}

	// public Figuras(int lados) {
	// this.Figuras(lados,...);
	// }

	// geters y setters.
	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public ArrayList<Double> getLongitud() {
		return longitudes;
	}

	public void setLongitud(ArrayList longitud) {
		this.longitudes = longitud;
	}

	// Otros metodos.
	@Override
	public String toString() {
		return "Figuras [lados=" + lados + ", longitudes=" + longitudes + "]";
	}

	// Devuelve el perimetro de la figura.
	// in:--
	// out: double Perimetro.
	// Notas: --
	public double Perimetro() {

		double perimetro = 0.0;
		for (double dato : longitudes) {
			perimetro += dato;
		}
		return perimetro;

	}

}
