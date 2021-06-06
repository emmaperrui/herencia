package embarcadero;

public class Yate extends EmbarcacionMotor{
	private int numeroCamarotes;
	
	/**
	 * M�todo en el que declaramos la clase y el atributo, adem�s de super(O) para la herencia.
	 */
	public Yate(){
		super();
		numeroCamarotes = 0;
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
	 * @param numeroCamarotes
	 */
	public Yate(String matricula, String duenno, int numeroTripulantes, float eslora, float manga, String tipoCombustibleMotor, int potenciaMotor, int numeroCamarotes) {
		super(matricula, duenno, numeroTripulantes, eslora, manga, tipoCombustibleMotor, potenciaMotor);
		this.numeroCamarotes = numeroCamarotes;
	}
	
	/**
	 * M�todo para obtener el n�mero de los camarotes.
	 * @return el n�mero de los camarotes.
	 */
	public int getNumeroCamarotes() {
		return numeroCamarotes;
	}
	
	/**
	 * M�todo para settear el n�mero de los camarotes.
	 * @param numeroCamarotes
	 */
	public void setNumeroCamarotes(int numeroCamarotes) {
		this.numeroCamarotes = numeroCamarotes;
	}
	
	/**
	 * M�todo para introducir la informaci�n del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "N�mero de camarotes: " + numeroCamarotes + "\n";
		
		return info;
	}
}
