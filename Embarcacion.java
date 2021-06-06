package embarcadero;

public class Embarcacion {
	
	private String matricula;
	private String duenno;
	private int numeroTripulantes;
	private float eslora;
	private float manga;
	
	/**
	 * M�todo en el que declaramos la clase y el atributo, adem�s de super(O) para la herencia.
	 */
	public Embarcacion() {
		matricula = null;
		duenno = null;
		numeroTripulantes = 0;
		eslora = 0f;
		manga = 0f;
	}
	
	/**
	 * M�todo para la herencia.
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
	 * M�todo `para obtener la matr�cula.
	 * @return la matr�cula.
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * M�todo para settear la matr�cula.
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * M�todo para obtener el due�o.
	 * @return el due�o.
	 */
	public String getDuenno() {
		return duenno;
	}

	/**
	 * M�todo para settear el due�o.
	 * @param duenno
	 */
	public void setDuenno(String duenno) {
		this.duenno = duenno;
	}

	/**
	 * M�todo para obtener el n�mero de tripulantes.
	 * @return el n�mero de tripulantes.
	 */
	public int getNumeroTripulantes() {
		return numeroTripulantes;
	}

	/**
	 * M�todo para settear el n�mero de tripulantes.
	 * @param numeroTripulantes
	 */
	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
	}

	/**
	 * M�todo para obtener la eslora.
	 * @return la eslora.
	 */
	public float getEslora() {
		return eslora;
	}

	/**
	 * M�todo para settear la eslora.
	 * @param eslora
	 */
	public void setEslora(float eslora) {
		this.eslora = eslora;
	}

	/**
	 * M�todo para obtener la manga.
	 * @return la manga.
	 */
	public float getManga() {
		return manga;
	}

	/***
	 * M�todo para settear la manga. 
	 * @param manga
	 */
	public void setManga(float manga) {
		this.manga = manga;
	}
	
	/**
	 * M�todo para introducir la informaci�n del barco.
	 */
	public String getInfoEmbarcacion() {
		String info = "";
		
		info = info + "Matr�cula:" + matricula + "\n";
		info = info + "Due�o:" + duenno + "\n";
		info = info + "N�mero de tripulantes:" + numeroTripulantes + "\n";
		info = info + "Eslora:" + eslora + "\n";
		info = info + "Manga:" + manga + "\n";
		
		return info;
	}
	
}
