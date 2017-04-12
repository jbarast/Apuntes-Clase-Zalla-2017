//Balon.java
//Autor: @jbarast
//Fecha: 12/04/2017
//Notas: Ejemplo de interface.

package apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos;

public class Balon extends ObjetoDeporte implements Rodable {
	@Override
	public void rodar() {
		System.out.println("El balon rueda");

	}

}
