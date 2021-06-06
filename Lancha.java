package embarcadero;

public class Lancha extends EmbarcacionMotor{
	private int velocidadMaxima;
	
	
	/**
	 * Método en el que declaramos la clase y el atributo, además de super(O) para la herencia.
	 */
	public Lancha() {
		super();
		velocidadMaxima = 0;
	}
	
	/**
	 * Método para la herencia.
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
	 * Método para obtener la velocidad máxima.
	 * @return la velocidad máxima.
	 */
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	/**
	 * Método para settear la velocidad máxima.
	 * @param velocidadMaxima
	 */
	public void setNumeroCamarotes(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	/**
	 * Método para introducir la información del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "Velocidad máxima: " + velocidadMaxima + "\n";
		
		return info;
	}
}
