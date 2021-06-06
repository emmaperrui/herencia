package embarcadero;

public class EmbarcacionMotor extends Embarcacion{
	private String tipoCombustibleMotor;
	private int potenciaMotor;
	
	/**
	 * Método en el que declaramos la clase y el atributo, además de super(O) para la herencia.
	 */
	public EmbarcacionMotor() {
		super();
		tipoCombustibleMotor = null;
		potenciaMotor = 0;
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
	 */
	public EmbarcacionMotor(String matricula, String duenno, int numeroTripulantes, float eslora, float manga, String tipoCombustibleMotor, int potenciaMotor) {
		super(matricula, duenno, numeroTripulantes, eslora, manga);
		this.tipoCombustibleMotor = tipoCombustibleMotor;
		this.potenciaMotor = potenciaMotor;
	}
	
	/**
	 * Método para obtener el tipo de combustible usado.
	 * @return el tipo de combustible usado.
	 */
	public String getTipoCombustibleMotor() {
		return tipoCombustibleMotor;
	}
	
	/**
	 * Método para settear el tipo de combustible usado.
	 * @param tipoCombustibleMotor
	 */
	public void setTipoCombustibleMotor(String tipoCombustibleMotor) {
		this.tipoCombustibleMotor = tipoCombustibleMotor;
	}
	
	/**
	 * Método para obtener la potencia del motor.
	 * @return la potencia del motor.
	 */
	public int getPotenciaMotor() {
		return potenciaMotor;
	}
	
	/**
	 * Método para settear la potencia del motor.
	 * @param potenciaMotor
	 */
	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	/**
	 * Método para introducir la información del barco.
	 */
	@Override
	public String getInfoEmbarcacion() {
		String info = super.getInfoEmbarcacion();
		
		info = info + "Tipo combustible:" + tipoCombustibleMotor + "\n";
		info = info + "Potencia del motor:" + potenciaMotor + "\n";
		
		return info;
	}
}
