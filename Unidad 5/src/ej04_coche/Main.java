package ej04_coche;

public class Main {

	public static void main(String[] args) {
		Coche coche1, coche2;
		
		coche1 = new Coche();
		coche2 = new Coche("Ford", "Fiesta");

		System.out.println("Coche 1:");
		System.out.println(coche1.mostrarDatos());
		
		System.out.println("\nCoche 2:");
		System.out.print(coche2.mostrarDatos());

	}

}
