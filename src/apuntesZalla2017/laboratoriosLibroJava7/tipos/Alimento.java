package apuntesZalla2017.laboratoriosLibroJava7.tipos;

/**
 * 
 * <p>
 * Clase Alimento para el ejericio de la pagina 166 del libro. Que pide lo
 * siguiente:
 * </p>
 * <ul>
 * <li>Contenido en lipidos expresado en tanto por ciento.</li>
 * <li>Contenido en hidratos de carbano expresado en tanto por ciento.</li>
 * <li>Contenido en proteinas expresado en tanto por ciento.</li>
 * <li>Si es o no de origen animal.</li>
 * <li>Contenido en vitaminas expresado en los codigos A alto, M medio y B banjo
 * </li>
 * <li>Contenido en minerales expresados en los codigos A alto, M medio y B bajo
 * </li>
 * <li>La clase tiene dos constructores: uno que admite como argumentos el
 * nombre del alimento, y otro que admite todos los atributos</li>
 * </ul>
 *
 * <p>
 * - La clase contiene los siguientes metodos:
 * </p>
 *
 * <ul>
 * <li>esDietectico. Este metodo retorna cierto si el alimento contiene menos
 * del 20% de lipidos y el contenido en vitaminas nos es bajo</li>
 * <li>muestraAlimento. Retorna una decripcion del alimento</li>
 * <li>calculaContenidoEnergetico. Este metodo retorna el contenido en calorias
 * de un gramo de alimento, considerando que un gramo de lipidos 9.4Kcal. un
 * gramo de proteinas contiene 5.3 y un gramo de hidratos de carbomo contine
 * 4.1kcal</li>
 * <li>esRecomendableParaDeportistas.Este metodo retorna ciertso si el alimento
 * cumple la siguiente lista: proteinas:10-15%,lipidos:30-35%,hidratos de
 * carbono:55-65%</li>
 * </ul>
 * 
 * <p>
 * Crear una aplicacion en la que se solicie al usuario los datos de un
 * alimento, se genere un objeto de la clase Alimento y se muestren los datos
 * del alimento, el contenid energetico,si es dietetico y recomndable para
 * deportistas
 * </p>
 *
 * 
 * @author jbarast
 * @version 19/04/2017
 * 
 *
 */
public class Alimento {

	// atributos.

	private String nombreAlimento;
	private double lipidosContenidoPorCiento;
	private double hidratosCarbonoContenidoPorCiento;
	private double proteinasContenidoPorCiento;
	private boolean origenAnimal;
	private enumVitaminasContenidoCodigo vitaminasContenidoCodigo;
	private enumMineralesContenidoCodigo mineralesContenidoCodigo;

	// utilizamos unos enums para unos atributos.
	public enum enumVitaminasContenidoCodigo {
		A, M, B
	}

	public enum enumMineralesContenidoCodigo {
		A, M, B
	}

	// Constructores.

	public Alimento(String nombreAlimento, double lipidosContenidoPorCiento, double hidratosCarbonoContenidoPorCiento,
			double proteinasContenidoPorCiento, boolean origenAnimal,
			enumVitaminasContenidoCodigo vitaminasContenidoCodigo, enumMineralesContenidoCodigo mineralesContenidoCodigo) {
		super();
		this.nombreAlimento = nombreAlimento;
		this.lipidosContenidoPorCiento = lipidosContenidoPorCiento;
		this.hidratosCarbonoContenidoPorCiento = hidratosCarbonoContenidoPorCiento;
		this.proteinasContenidoPorCiento = proteinasContenidoPorCiento;
		this.origenAnimal = origenAnimal;
		this.vitaminasContenidoCodigo = vitaminasContenidoCodigo;
		this.mineralesContenidoCodigo = mineralesContenidoCodigo;
	}

	public Alimento(String nombreAlimento) {
		this(nombreAlimento, 0, 0, 0, false, enumVitaminasContenidoCodigo.B, enumMineralesContenidoCodigo.B);
	}

	// getters y setters

	public String getNombreAlimento() {
		return nombreAlimento;
	}

	public void setNombreAlimento(String nombreAlimento) {
		this.nombreAlimento = nombreAlimento;
	}

	public double getLipidosContenidoPorCiento() {
		return lipidosContenidoPorCiento;
	}

	public void setLipidosContenidoPorCiento(double lipidosContenidoPorCiento) {
		this.lipidosContenidoPorCiento = lipidosContenidoPorCiento;
	}

	public double getHidratosCarbonoContenidoPorCiento() {
		return hidratosCarbonoContenidoPorCiento;
	}

	public void setHidratosCarbonoContenidoPorCiento(double hidratosCarbonoContenidoPorCiento) {
		this.hidratosCarbonoContenidoPorCiento = hidratosCarbonoContenidoPorCiento;
	}

	public double getProteinasContenidoPorCiento() {
		return proteinasContenidoPorCiento;
	}

	public void setProteinasContenidoPorCiento(double proteinasContenidoPorCiento) {
		this.proteinasContenidoPorCiento = proteinasContenidoPorCiento;
	}

	public boolean isOrigenAnimal() {
		return origenAnimal;
	}

	public void setOrigenAnimal(boolean origenAnimal) {
		this.origenAnimal = origenAnimal;
	}

	public enumVitaminasContenidoCodigo getVitaminasContenidoCodigo() {
		return vitaminasContenidoCodigo;
	}

	public void setVitaminasContenidoCodigo(enumVitaminasContenidoCodigo vitaminasContenidoCodigo) {
		this.vitaminasContenidoCodigo = vitaminasContenidoCodigo;
	}

	public enumMineralesContenidoCodigo getMineralesContenidoCodigo() {
		return mineralesContenidoCodigo;
	}

	public void setMineralesContenidoCodigo(enumMineralesContenidoCodigo mineralesContenidoCodigo) {
		this.mineralesContenidoCodigo = mineralesContenidoCodigo;
	}

	// otros Metodos.
	@Override
	public String toString() {
		return "Alimento [nombreAlimento=" + nombreAlimento + ", lipidosContenidoPorCiento="
				+ lipidosContenidoPorCiento + ", hidratosCarbonoContenidoPorCiento="
				+ hidratosCarbonoContenidoPorCiento + ", proteinasContenidoPorCiento=" + proteinasContenidoPorCiento
				+ ", origenAnimal=" + origenAnimal + ", vitaminasContenidoCodigo=" + vitaminasContenidoCodigo
				+ ", mineralesContenidoCodigo=" + mineralesContenidoCodigo + "]";
	}

	/**
	 * 
	 * Nos indica si el alimento tiene menos del 20% de lipidos.
	 * 
	 * @return menos20PorCientoLipidos True si el alimento tiene menos de 20% de
	 *         lipidos false si no.
	 */
	public boolean esDietetico() {

		// Creamos el boolean a devolver.
		boolean menos20PorCientoLipidos = false;

		// Si es menor que 20% los lipidos lo cambiamos por true.
		if (this.lipidosContenidoPorCiento < 20) {
			menos20PorCientoLipidos = true;
		}

		return menos20PorCientoLipidos;

	}

	/**
	 * 
	 * Metodo toString(), canbiado de nombre por cliente. Metodo toString(),
	 * tambien implementado.
	 * 
	 * @return stringAlimetno Devuelve en un string la informacion del alimento.
	 */
	public String muestraAlimento() {
		return "Alimento [nombreAlimento=" + nombreAlimento + ", lipidosContenidoPorCiento="
				+ lipidosContenidoPorCiento + ", hidratosCarbonoContenidoPorCiento="
				+ hidratosCarbonoContenidoPorCiento + ", proteinasContenidoPorCiento=" + proteinasContenidoPorCiento
				+ ", origenAnimal=" + origenAnimal + ", vitaminasContenidoCodigo=" + vitaminasContenidoCodigo
				+ ", mineralesContenidoCodigo=" + mineralesContenidoCodigo + "]";
	}

	/**
	 * 
	 * <p>
	 * Este metodo nos devulve cuantas calorias tiene el Alimento.
	 * </p>
	 * <p>
	 * Calorias por gramo por cada tipo de ...:
	 * </p>
	 * <ul>
	 * <li>Lipidos: 9.4Kcal por gramo.</li>
	 * <li>Proteinas: 5.3Kcal por gramo.</li>
	 * <li>Hidratos: 4.1Kcal por gramo.</li>
	 * <li></li>
	 * </ul>
	 * 
	 * 
	 * @return totalContenidoEnergetico Nos devuelve el valor total de calorias.
	 */
	public double calculaContenidoEnergetico() {
		// variables necesarias para el metodo.
		double totalContenidoEnergetico = 0;
		double lipidosContenidoEnergetico = 0;
		double proteinasContenidEnergetico = 0;
		double hidratosContenidoEnergetico = 0;

		// Calculamos cada elemento y despues sumamos los tres.
		lipidosContenidoEnergetico = (this.getLipidosContenidoPorCiento() / 100) * 9.4;
		proteinasContenidEnergetico = (this.getProteinasContenidoPorCiento() / 100) * 5.3;
		hidratosContenidoEnergetico = (this.getHidratosCarbonoContenidoPorCiento() / 100) * 4.1;

		totalContenidoEnergetico = lipidosContenidoEnergetico + proteinasContenidEnergetico
				+ hidratosContenidoEnergetico;

		return totalContenidoEnergetico;

	}

	/**
	 * 
	 * <p>
	 * Mira si el alimento es recomendable para deportias. La cual es true solo
	 * si cumple las siguientes condiciones
	 * </p>
	 * <lu> <li>Lipidos: 30-35%</li> <li>Proteinas: 10-15%</li> <li>Hidratos de
	 * Carbono: 55-65%</li> </lu>
	 * 
	 * 
	 * 
	 * @return esRecomendableParaDeporstistas True si es apto para deportistas.
	 */
	public boolean esRecomendableParaDeportistas() {

		// Creamos la variable interna que devolveremos.
		boolean esRecomendableParaDeporstistas = false;

		// Miramos si es recomendable para deportistas.
		// Vamos a dividir.
		boolean lipidosOK = false;
		boolean proteinasOK = false;
		boolean hidratosCarbonoOK = false;

		// Miramos una a una.
		if (this.getLipidosContenidoPorCiento() >= 30 && this.getLipidosContenidoPorCiento() <= 35)
			lipidosOK = true;

		if (this.getProteinasContenidoPorCiento() >= 10 && this.getProteinasContenidoPorCiento() <= 15)
			proteinasOK = true;

		if (this.getHidratosCarbonoContenidoPorCiento() >= 55 && this.getHidratosCarbonoContenidoPorCiento() <= 65)
			hidratosCarbonoOK = true;

		// Comprobomas que todas son ciertas.
		if (lipidosOK == true && proteinasOK == true && hidratosCarbonoOK == true)
			esRecomendableParaDeporstistas = true;

		return esRecomendableParaDeporstistas;

	}
}
