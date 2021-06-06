package embarcadero;

public class BarcoVela extends EmbarcacionEolica{
	private float tamannoVelas;
	
	/**
	 * M�todo en el que declaramos la clase y el atributo, adem�s de super(O) para la herencia.
	 */
	public BarcoVela() {
		super();
		tamannoVelas = 0f;
	}
	
	/**
	 * M�todo para la herencia.
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
	 * M�todo para obtener el tama�o de las velas.
	 * @return el tama�o de las velas.
	 */
	public float getTamannoVelas() {
		return tamannoVelas;
	}
	
	/**
	 * M�todo para settear el tama�o de las velas.
	 * @param tamannoVelas
	 */
	public void setTamannoVelas(float tamannoVelas) {
		this.tamannoVelas = tamannoVelas;
	}
	
	/**
	 * M�todo para introducir la informaci�n del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "Tama�o de las velas:" + tamannoVelas + "\n";
		
		return info;
	}
}
