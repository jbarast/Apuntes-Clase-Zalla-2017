//ContractoCuriso.java
//Autor: @jbarast
//Fecha: 12/04/2017
//Notas: Clase para ejemplo de interface.
package apuntesZalla2017.ejemplos.ejemplopoo.tipos;

import apuntesZalla2017.ejemplos.ejemplopoo.tipos.abstractos.Contracto;

public class ContratoCurioso implements Contracto {

	@Override
	public void clausula1() {
		System.out.println("Que curioso");
	}

	@Override
	public int clausula2(String s) {
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Se ha recibido texto, u se a devuelto el vaor 0");
		}
		return i;
	}

}
