package embarcadero;

public class EmbarcacionEolica extends Embarcacion{
	private float peso;
	
	/**
	 * Método en el que declaramos la clase y el atributo, además de super(O) para la herencia.
	 */
	public EmbarcacionEolica() {
		super();
		peso = 0f;
		
	}
	
	/**
	 * Método para la herencia.
	 * @param matricula
	 * @param duenno
	 * @param numeroTripulantes
	 * @param eslora
	 * @param manga
	 * @param peso
	 */
	public EmbarcacionEolica(String matricula, String duenno, int numeroTripulantes, float eslora, float manga, float peso) {
		super(matricula, duenno, numeroTripulantes, eslora, manga);
		this.peso = peso;
	}
	
	/**
	 * Método para obtener el peso.
	 * @return el peso.
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * Método para settear el peso.
	 * @param peso
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	/**
	 * Método para introducir la información del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "Peso: " + peso + "\n";
		
		return info;
	}
}
