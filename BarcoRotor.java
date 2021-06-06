package embarcadero;

public class BarcoRotor extends EmbarcacionEolica{
	private float tamannoCilindros;
	
	
	/**
	 * M�todo en el que declaramos la clase y el atributo, adem�s de super(O) para la herencia.
	 */
	public BarcoRotor() {
		super();
		tamannoCilindros = 0f;
	}
	
	/**
	 * M�todo para la herencia.
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
	 * M�todo para obtener el tama�o de los cilindros.
	 * @return el tama�o de los cilindros.
	 */
	public float getTamannoCilindros() {
		return tamannoCilindros;
	}
	
	/**
	 * M�todo para settear el tama�o de los cilindros.
	 * @param tamannoCilindros
	 */
	public void setTamannoCilindros(float tamannoCilindros) {
		this.tamannoCilindros = tamannoCilindros;
	}
	
	/**
	 * M�todo para introducir la informaci�n del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "Tama�o del cilindro:" + tamannoCilindros + "\n";
		
		return info;
	}
}
