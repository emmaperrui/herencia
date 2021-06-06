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
	 * Método para introducir la información del barco que deseamos guardar en nuestra aplicación.
	 */
	public void addEmbarcacion() {
		
		System.out.println("Introduce el número de matrícula: ");
		String matricula = sc.next();
		
		System.out.println("Introduce el nombre del dueño: ");
		String duenno = sc.next();
		
		System.out.println("Introduce número de tripulantes: ");
		int numTripulantes = sc.nextInt();
		
		System.out.println("Introduce la eslora: ");
		float eslora = sc.nextFloat();
		
		System.out.println("Introduce la manga: ");
		float manga = sc.nextFloat();
		
		
		// Después de las preguntas generales se tiene que preguntar el tipo de barco
		
		// Preguntar tipo de propulsión
		
		System.out.println("Marca el tipo de propulsión (el número):");
		System.out.println("1.Prpulosión a motor");
		System.out.println("2.Propulsión eólica");
		int tipoPropulsion = sc.nextInt();
		
		if(tipoPropulsion == 1) {
			// Tipo EmbarcacionMotor
			System.out.println("Introduce el tipo de combustible:");
			String tipoCombustibleMotor = sc.next();
			System.out.println("Introduce los CV del motor");
			int cVMotor = sc.nextInt();
			
			System.out.println("Marca el tipo de embarcacion (número):");
			System.out.println("1.Yate");
			System.out.println("2.Lancha");
			int tipoEmbarcacionMotor = sc.nextInt();
			
			if(tipoEmbarcacionMotor == 1) {
				// Yate
				System.out.println("Introduce el número de camarotes");
				int numCamarotes = sc.nextInt();
				Yate yate = new Yate(matricula, duenno, numTripulantes, eslora, manga, tipoCombustibleMotor, cVMotor, numCamarotes);
				lista.add(yate);
			} else if(tipoEmbarcacionMotor == 2) {
				// Lancha
				System.out.println("Introduce la velocidad máxima de la lancha");
				int velocidadMax = sc.nextInt();
				Lancha lancha = new Lancha(matricula, duenno, numTripulantes, eslora, manga, tipoCombustibleMotor, cVMotor, velocidadMax);
				lista.add(lancha);
			}
		} else if(tipoPropulsion == 2) {
			// Tipo EmbarcacionEolica
			System.out.println("Introduce el peso del barco en toneladas:");
			float peso = sc.nextFloat();
			
			System.out.println("Marca el tipo de embarcacion (número):");
			System.out.println("1.Barco de vela");
			System.out.println("2.Barco de rotor");
			int tipoEmbarcacionEolica = sc.nextInt();
			
			if(tipoEmbarcacionEolica == 1) {
				// Barco de vela
				System.out.println("Introduce el tamaño de las velas:");
				float tamannoVelas = sc.nextFloat();
				BarcoVela barcoVela = new BarcoVela(matricula, duenno, numTripulantes, eslora, manga, peso, tamannoVelas);
				lista.add(barcoVela);
			} else if(tipoEmbarcacionEolica == 2) {
				// Barco de rotor
				System.out.println("Introduce el tamaño de los cilindros:");
				float tamannoCilindros = sc.nextFloat();
				BarcoRotor barcoRotor = new BarcoRotor(matricula, duenno, numTripulantes, eslora, manga, peso, tamannoCilindros);
				lista.add(barcoRotor);
			}
		}
	}
	
	/**
	 * Método para listar los barcos introducidos en nuestra aplicación.
	 */
	public void listarBarcos() {
		for(Embarcacion barco : lista) {
			System.out.println(barco.getInfoEmbarcacion());
			System.out.println("//////////////////////////////////");
		}
	}
	
	/**
	 * Método para buscar un barco en concreto en nuestra aplicación.
	 */
	public void buscarBarco() {
		boolean barcoEncontrado = false;
		System.out.println("Introduce la matrícula del barco que quieres buscar:");
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
	 * Método para eliminar el barco que queramos en nuestra aplicación.
	 */
	public void eliminarBarco() {
		boolean barcoEncontrado = false;
		System.out.println("Introduce la matrícula del barco que quieres eliminar:");
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
