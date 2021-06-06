package embarcadero;

import java.util.Scanner;

public class Main {
	
	static Gestor gestor;
	static Scanner sc;
	
	/**
	 * Método main para guardar el menú de opciones de nuestra aplicación, con un try catch para comprobar que la gente mete 
	 * los datos correctos.
	 * @param args
	 */
	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		gestor = new Gestor();
		
		boolean programaFuncionando = true;
		while(programaFuncionando) {
			sc = new Scanner(System.in);
			mostrarMenu();
			
			int opcion = 0;
			
			try {
				opcion = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Opción no válida");
			}
			
			switch (opcion) {
			case 1:
				gestor.addEmbarcacion();
				break;
			case 2:
				gestor.listarBarcos();
				break;
			case 3:
				gestor.buscarBarco();
				break;
			case 4:
				gestor.eliminarBarco();
				break;
			case 5:
				programaFuncionando = false;
				System.out.println("Programa finalizado");
				break;
			default:
				break;
			}
		}
	}
	
	/**
	 * Método para mostrar el menú de nuestra aplicación.
	 */
	public static void mostrarMenu() {
		System.out.println("LISTADO DE OPCIONES");
		System.out.println("1. Añadir barco:");
		System.out.println("2. Listar barcos:");
		System.out.println("3. Buscar barco");
		System.out.println("4. Eliminar barco");
		System.out.println("5. Salir");
		System.out.println("Introduce el número de la opción:");
	}
}
