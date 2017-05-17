//PrimerHilo.java


package apuntesZalla2017.ejemplos.thread;

/**
 * 
 * Ejemplo de thread del libro java 7 pagina 214.
 * 
 * @author jbarast
 * @version 17/05/2017
 *
 */
public class PrimerHilo implements Runnable {

	//variables.
	static final short limiteS = 1000;
	private short limiteI = 0;
	
	public static void main(String[] args) {

		PrimerHilo destino = new PrimerHilo();
		Thread nuevoHilo = new Thread(destino,"Nuevo hilo");
		
		//Empezamos con el hilo.
		nuevoHilo.start();
		
		System.out.println("El hilo principal ha terminado");
	}
		public void run(){
			while(limiteI++<limiteS){
				System.out.println("El hilo actual es: ");
				System.out.println(Thread.currentThread().toString());
				
				try{
					Thread.currentThread().sleep(100);
				}catch(InterruptedException e){
					System.out.println("El hilo hijo interrumpido.");
				}
				System.exit(1);
			}
		}

	}


