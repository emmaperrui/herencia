package embarcadero;

public class BarcoRotor extends EmbarcacionEolica{
	private float tamannoCilindros;
	
	
	/**
	 * Método en el que declaramos la clase y el atributo, además de super(O) para la herencia.
	 */
	public BarcoRotor() {
		super();
		tamannoCilindros = 0f;
	}
	
	/**
	 * Método para la herencia.
	 * @param matricula
	 * @param duenno
	 * @param numeroTripulantes
	 * @param eslora
	 * @param manga
	 * @param peso
	 * @param tamannoCilindros
	 */
	public BarcoRotor(String matricula, String duenno, int numeroTripulantes, float eslora, float manga, float peso, float tamannoCilindros) {
		super(matricula, duenno, numeroTripulantes, eslora, manga, peso);
		this.tamannoCilindros = tamannoCilindros;
	}
	
	/**
	 * Método para obtener el tamaño de los cilindros.
	 * @return el tamaño de los cilindros.
	 */
	public float getTamannoCilindros() {
		return tamannoCilindros;
	}
	
	/**
	 * Método para settear el tamaño de los cilindros.
	 * @param tamannoCilindros
	 */
	public void setTamannoCilindros(float tamannoCilindros) {
		this.tamannoCilindros = tamannoCilindros;
	}
	
	/**
	 * Método para introducir la información del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "Tamaño del cilindro:" + tamannoCilindros + "\n";
		
		return info;
	}
}
