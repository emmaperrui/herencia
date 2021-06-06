package embarcadero;

public class Lancha extends EmbarcacionMotor{
	private int velocidadMaxima;
	
	
	/**
	 * M�todo en el que declaramos la clase y el atributo, adem�s de super(O) para la herencia.
	 */
	public Lancha() {
		super();
		velocidadMaxima = 0;
	}
	
	/**
	 * M�todo para la herencia.
	 * @param matricula
	 * @param duenno
	 * @param numeroTripulantes
	 * @param eslora
	 * @param manga
	 * @param tipoCombustibleMotor
	 * @param potenciaMotor
	 * @param velocidadMaxima
	 */
	public Lancha(String matricula, String duenno, int numeroTripulantes, float eslora, float manga, String tipoCombustibleMotor, int potenciaMotor, int velocidadMaxima) {
		super(matricula, duenno, numeroTripulantes, eslora, manga, tipoCombustibleMotor, potenciaMotor);
		this.velocidadMaxima = velocidadMaxima;
	}
	
	/**
	 * M�todo para obtener la velocidad m�xima.
	 * @return la velocidad m�xima.
	 */
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	/**
	 * M�todo para settear la velocidad m�xima.
	 * @param velocidadMaxima
	 */
	public void setNumeroCamarotes(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	/**
	 * M�todo para introducir la informaci�n del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "Velocidad m�xima: " + velocidadMaxima + "\n";
		
		return info;
	}
}
