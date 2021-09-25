package concesionario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner (System.in);
		String   opcion;
		do {
			System.out.println("Elija una opcion   ");
			System.out.println("1.-Ingresar Auto ");
			System.out.println("2.- Consultar AUTo ");
			System.out.println("3.- Actualizar Kilometraje ");
			System.out.println("4.- imprimir reporte  ");
			System.out.println("5.- Salir ");
			opcion = teclado.nextLine();
			
			// El switch hasta antes de la version 1.7 
			// solo funcionaba para byte, short, char e int
			
			switch (opcion) {
			case "1":
				System.out.println(" escoja opcion ");
				System.out.println(" A.- Auto nacional ");
				System.out.println(" B.- Auto Importado ");
				break;
				
			case "2":
				System.out.println("ingrese placa del AUTO ");
				break;
				default: 
					System.out.println(" ERROR AL BUSCAR AUTO  ");
					break;	
				case "3":
					System.out.println("INGRESE PLACA DEL AUTO");
					System.out.println(" Ingrese nuevo kilometraje ");
					System.out.println("Actualizar nuevo kilometraje ");
					break;	
				case "4":
					System.out.println("Imprimir reporte ");
					
					break;	
			}
			
			if (opcion.equals("1")) {
				System.out.println(" ingrese auto ");
			}else if (opcion.equals("2")) {
				System.out.println(" Consultar auto ");
			}else if (opcion.equals("3")) {
				System.out.println(" Actualizar kilometraje ");
			}else if (opcion.equals("4")) {
				System.out.println(" Imprimir reporte ");
			}
			
	
		}while (! opcion.equals("5"));  
		System.out.println(" Gracias por preferirnos "); 
	

	}

}
