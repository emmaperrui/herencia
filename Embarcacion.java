package embarcadero;

public class Embarcacion {
	
	private String matricula;
	private String duenno;
	private int numeroTripulantes;
	private float eslora;
	private float manga;
	
	/**
	 * Método en el que declaramos la clase y el atributo, además de super(O) para la herencia.
	 */
	public Embarcacion() {
		matricula = null;
		duenno = null;
		numeroTripulantes = 0;
		eslora = 0f;
		manga = 0f;
	}
	
	/**
	 * Método para la herencia.
	 * @param matricula
	 * @param duenno
	 * @param numeroTripulantes
	 * @param eslora
	 * @param manga
	 */
	public Embarcacion(String matricula, String duenno, int numeroTripulantes, float eslora, float manga) {
		this.matricula = matricula;
		this.duenno = duenno;
		this.numeroTripulantes = numeroTripulantes;
		this.eslora = eslora;
		this.manga = manga;
	}

	/**
	 * Método `para obtener la matrícula.
	 * @return la matrícula.
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Método para settear la matrícula.
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Método para obtener el dueño.
	 * @return el dueño.
	 */
	public String getDuenno() {
		return duenno;
	}

	/**
	 * Método para settear el dueño.
	 * @param duenno
	 */
	public void setDuenno(String duenno) {
		this.duenno = duenno;
	}

	/**
	 * Método para obtener el número de tripulantes.
	 * @return el número de tripulantes.
	 */
	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}

	/**
	 * Método para settear el número de tripulantes.
	 * @param numeroTripulantes
	 */
	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
	}

	/**
	 * Método para obtener la eslora.
	 * @return la eslora.
	 */
	public float getEslora() {
		return eslora;
	}

	/**
	 * Método para settear la eslora.
	 * @param eslora
	 */
	public void setEslora(float eslora) {
		this.eslora = eslora;
	}

	/**
	 * Método para obtener la manga.
	 * @return la manga.
	 */
	public float getManga() {
		return manga;
	}

	/***
	 * Método para settear la manga. 
	 * @param manga
	 */
	public void setManga(float manga) {
		this.manga = manga;
	}
	
	/**
	 * Método para introducir la información del barco.
	 */
	public String getInfoEmbarcacion() {
		String info = "";
		
		info = info + "Matrícula:" + matricula + "\n";
		info = info + "Dueño:" + duenno + "\n";
		info = info + "Número de tripulantes:" + numeroTripulantes + "\n";
		info = info + "Eslora:" + eslora + "\n";
		info = info + "Manga:" + manga + "\n";
		
		return info;
	}
	
}
