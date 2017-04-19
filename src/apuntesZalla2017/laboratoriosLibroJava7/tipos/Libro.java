package apuntesZalla2017.laboratoriosLibroJava7.tipos;

/**
 * 
 * <h1>Clase Libro</h1>
 * 
 * <p>
 * Clase libro para el ejercio de la pagina 203 del libro java7.
 * </p>
 * 
 * 
 * @author libroJava7
 * @author jbarast
 * @version 19/04/2017
 *
 */
public class Libro {

	// atributos.
	private String autor;
	private String titulo;
	private String iSBN;

	// Constructor.
	public Libro(String autor, String titulo, String iSBN) {

		this.autor = autor;
		this.titulo = titulo;
		this.iSBN = iSBN;
	}

	// Getters y Setters.
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getiSBN() {
		return iSBN;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	// Otros metodos.
	@Override
	public String toString() {
		return String.format("%s, %s, %s", this.titulo, this.autor, this.iSBN);

	}

}
