package embarcadero;

public class Yate extends EmbarcacionMotor{
	private int numeroCamarotes;
	
	/**
	 * Método en el que declaramos la clase y el atributo, además de super(O) para la herencia.
	 */
	public Yate(){
		super();
		numeroCamarotes = 0;
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
	 * @param numeroCamarotes
	 */
	public Yate(String matricula, String duenno, int numeroTripulantes, float eslora, float manga, String tipoCombustibleMotor, int potenciaMotor, int numeroCamarotes) {
		super(matricula, duenno, numeroTripulantes, eslora, manga, tipoCombustibleMotor, potenciaMotor);
		this.numeroCamarotes = numeroCamarotes;
	}
	
	/**
	 * Método para obtener el número de los camarotes.
	 * @return el número de los camarotes.
	 */
	public int getNumeroCamarotes() {
		return numeroCamarotes;
	}
	
	/**
	 * Método para settear el número de los camarotes.
	 * @param numeroCamarotes
	 */
	public void setNumeroCamarotes(int numeroCamarotes) {
		this.numeroCamarotes = numeroCamarotes;
	}
	
	/**
	 * Método para introducir la información del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "Número de camarotes: " + numeroCamarotes + "\n";
		
		return info;
	}
}
