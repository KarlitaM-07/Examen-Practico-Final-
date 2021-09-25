package concesionario;

import java.util.Arrays;
import java.util.Scanner;

import ejercicios.ordenamiento.taller.Estudiante;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner (System.in);
		System.out.println("Ingrese auto ");
		
		AutoNacional auto = new AutoNacional("MAZDA");
		auto.setMarca("Mazda");
		auto.setModelo("BT50");
		auto.setAñoFabricacion("2010");
		auto.setPlaca("PBI-4556");
		auto.setKilometraje("1500");
		
		AutoNacional auto1 = new AutoNacional("TOYOTA");
		auto1.setMarca("TOYOTA");
		auto1.setModelo("PRIUS");
		auto1.setAñoFabricacion("2008");
		auto1.setPlaca("PCT-4578");
		auto1.setKilometraje("2000");
		

		AutoNacional auto2 = new AutoNacional("KIA");
		auto.setMarca("KIA");
		auto.setModelo("Sportage");
		auto.setAñoFabricacion("2007");
		auto.setPlaca("PZT-1078");
		auto.setKilometraje("1000");
		
		AutoNacional auto3 = new AutoNacional("Chevrolet");
		auto3.setMarca("chevrolet");
		auto3.setModelo("MD");
		auto3.setAñoFabricacion("2006");
		auto3.setPlaca("PJK-2209");
		auto3.setKilometraje("3000");
		
		AutoNacional auto4 = new AutoNacional("Hyundai");
		auto4.setMarca("hyundai");
		auto4.setModelo("accent");
		auto4.setAñoFabricacion("2010");
		auto4.setPlaca("MKL-0703");
		auto4.setKilometraje("4000");
		
		
		System.out.println("Auto Nacional: "+auto.getMarca()+ auto.getModelo()+ auto.getAñoFabricacion()+ auto.getPlaca()+ auto.getKilometraje());
		System.out.println("Auto Nacional: "+auto1.getMarca()+ auto1.getModelo()+ auto1.getAñoFabricacion()+ auto1.getPlaca()+ auto1.getKilometraje());
		System.out.println("Auto Nacional: "+auto2.getMarca()+ auto2.getModelo()+ auto2.getAñoFabricacion()+ auto2.getPlaca()+ auto2.getKilometraje());
		System.out.println("Auto Nacional: "+auto3.getMarca()+ auto3.getModelo()+ auto3.getAñoFabricacion()+ auto3.getPlaca()+ auto3.getKilometraje());
		System.out.println("Auto Nacional: "+auto4.getMarca()+ auto4.getModelo()+ auto4.getAñoFabricacion()+ auto4.getPlaca()+ auto4.getKilometraje());
		
	}

	
	
		AutoNacional listaAuto[]=new AutoNacional[5];
		listaAuto[0]= mazda;
		listaAuto[1]= toyota;
		listaAuto[2]= kia;
		listaAuto[3]= chevrolet;
		listaAuto[4]= hyundai;
		
		Arrays.sort(listaAuto);
		System.out.println("Ordenar autos");
		System.out.println(Arrays.toString(listaAuto));
		
		
	

}
