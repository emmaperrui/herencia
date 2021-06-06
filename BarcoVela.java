package embarcadero;

public class BarcoVela extends EmbarcacionEolica{
	private float tamannoVelas;
	
	/**
	 * Método en el que declaramos la clase y el atributo, además de super(O) para la herencia.
	 */
	public BarcoVela() {
		super();
		tamannoVelas = 0f;
	}
	
	/**
	 * Método para la herencia.
	 * @param matricula
	 * @param duenno
	 * @param numeroTripulantes
	 * @param eslora
	 * @param manga
	 * @param peso
	 * @param tamannoVelas
	 */
	public BarcoVela(String matricula, String duenno, int numeroTripulantes, float eslora, float manga, float peso, float tamannoVelas) {
		super(matricula, duenno, numeroTripulantes, eslora, manga, peso);
		this.tamannoVelas = tamannoVelas;
	}
	
	/**
	 * Método para obtener el tamaño de las velas.
	 * @return el tamaño de las velas.
	 */
	public float getTamannoVelas() {
		return tamannoVelas;
	}
	
	/**
	 * Método para settear el tamaño de las velas.
	 * @param tamannoVelas
	 */
	public void setTamannoVelas(float tamannoVelas) {
		this.tamannoVelas = tamannoVelas;
	}
	
	/**
	 * Método para introducir la información del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "Tamaño de las velas:" + tamannoVelas + "\n";
		
		return info;
	}
}
