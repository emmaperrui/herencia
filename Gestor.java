package embarcadero;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestor {
	
	private ArrayList<Embarcacion> lista;
	private Scanner sc;
	
	
	public Gestor() {
		lista = new ArrayList<Embarcacion>();
		sc = new Scanner(System.in);
	}
	
	/**
	 * M�todo para introducir la informaci�n del barco que deseamos guardar en nuestra aplicaci�n.
	 */
	public void addEmbarcacion() {
		
		System.out.println("Introduce el n�mero de matr�cula: ");
		String matricula = sc.next();
		
		System.out.println("Introduce el nombre del due�o: ");
		String duenno = sc.next();
		
		System.out.println("Introduce n�mero de tripulantes: ");
		int numTripulantes = sc.nextInt();
		
		System.out.println("Introduce la eslora: ");
		float eslora = sc.nextFloat();
		
		System.out.println("Introduce la manga: ");
		float manga = sc.nextFloat();
		
		
		// Despu�s de las preguntas generales se tiene que preguntar el tipo de barco
		
		// Preguntar tipo de propulsi�n
		
		System.out.println("Marca el tipo de propulsi�n (el n�mero):");
		System.out.println("1.Prpulosi�n a motor");
		System.out.println("2.Propulsi�n e�lica");
		int tipoPropulsion = sc.nextInt();
		
		if(tipoPropulsion == 1) {
			// Tipo EmbarcacionMotor
			System.out.println("Introduce el tipo de combustible:");
			String tipoCombustibleMotor = sc.next();
			System.out.println("Introduce los CV del motor");
			int cVMotor = sc.nextInt();
			
			System.out.println("Marca el tipo de embarcacion (n�mero):");
			System.out.println("1.Yate");
			System.out.println("2.Lancha");
			int tipoEmbarcacionMotor = sc.nextInt();
			
			if(tipoEmbarcacionMotor == 1) {
				// Yate
				System.out.println("Introduce el n�mero de camarotes");
				int numCamarotes = sc.nextInt();
				Yate yate = new Yate(matricula, duenno, numTripulantes, eslora, manga, tipoCombustibleMotor, cVMotor, numCamarotes);
				lista.add(yate);
			} else if(tipoEmbarcacionMotor == 2) {
				// Lancha
				System.out.println("Introduce la velocidad m�xima de la lancha");
				int velocidadMax = sc.nextInt();
				Lancha lancha = new Lancha(matricula, duenno, numTripulantes, eslora, manga, tipoCombustibleMotor, cVMotor, velocidadMax);
				lista.add(lancha);
			}
		} else if(tipoPropulsion == 2) {
			// Tipo EmbarcacionEolica
			System.out.println("Introduce el peso del barco en toneladas:");
			float peso = sc.nextFloat();
			
			System.out.println("Marca el tipo de embarcacion (n�mero):");
			System.out.println("1.Barco de vela");
			System.out.println("2.Barco de rotor");
			int tipoEmbarcacionEolica = sc.nextInt();
			
			if(tipoEmbarcacionEolica == 1) {
				// Barco de vela
				System.out.println("Introduce el tama�o de las velas:");
				float tamannoVelas = sc.nextFloat();
				BarcoVela barcoVela = new BarcoVela(matricula, duenno, numTripulantes, eslora, manga, peso, tamannoVelas);
				lista.add(barcoVela);
			} else if(tipoEmbarcacionEolica == 2) {
				// Barco de rotor
				System.out.println("Introduce el tama�o de los cilindros:");
				float tamannoCilindros = sc.nextFloat();
				BarcoRotor barcoRotor = new BarcoRotor(matricula, duenno, numTripulantes, eslora, manga, peso, tamannoCilindros);
				lista.add(barcoRotor);
			}
		}
	}
	
	/**
	 * M�todo para listar los barcos introducidos en nuestra aplicaci�n.
	 */
	public void listarBarcos() {
		for(Embarcacion barco : lista) {
			System.out.println(barco.getInfoEmbarcacion());
			System.out.println("//////////////////////////////////");
		}
	}
	
	/**
	 * M�todo para buscar un barco en concreto en nuestra aplicaci�n.
	 */
	public void buscarBarco() {
		boolean barcoEncontrado = false;
		System.out.println("Introduce la matr�cula del barco que quieres buscar:");
		String matricula = sc.next();
		for(Embarcacion barco : lista) {
			if(barco.getMatricula() == matricula) {
				System.out.println(barco.getInfoEmbarcacion());
				barcoEncontrado = true;
				break;
			}
		}
		if(!barcoEncontrado) {
			System.out.println("Barco no encontrado");
		}
	}
	
	/**
	 * M�todo para eliminar el barco que queramos en nuestra aplicaci�n.
	 */
	public void eliminarBarco() {
		boolean barcoEncontrado = false;
		System.out.println("Introduce la matr�cula del barco que quieres eliminar:");
		String matricula = sc.next();
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getMatricula() == matricula) {
				lista.remove(i);
				barcoEncontrado = true;
				break;
			}
		}
		if(!barcoEncontrado) {
			System.out.println("Barco no encontrado");
		}
	}
	
}
