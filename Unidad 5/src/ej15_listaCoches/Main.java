package ej15_listaCoches;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ejercicio 7 Crea la clase llamada ListaCoches que contenga como atributos un array de la clase Coche.
		 * 
		 * La clase Coche tendrá los atributos privados modelo, matrícula, marca y color.
		 * Crea los constructores que estimes necesarios, los get/set necesarios y el método toString().
		 * 
		 * La clase ListaCoches contendrá el array de coches y los métodos necesarios para hacer
		 * un programa principal que pueda hacer lo siguiente:
		 * 
		 *   Devolver el coche que se encuentra en una posición dada. Si la posición aportada no es válida devolverá null.
		 *   Devolver la posición del coche cuya matrícula coincide con una dada. En caso de no encontrar esta devolverá -1.
		 *   Devuelve la lista de coches que son de una marca determinada.
		 */
		
		ListaCoches coches = new ListaCoches();

		coches.insetarCoche(new Coche("0123JFS", "Ford", "Focus", "rojo"));
		coches.insetarCoche(new Coche("9021BBQ", "Ford", "Kuga", "marron"));
		coches.insetarCoche(new Coche("7882GFL", "Opel", "Astra", "gris"));
		coches.insetarCoche(new Coche("6101GHW", "Opel", "Corsa", "blanco"));
		coches.insetarCoche(new Coche("5499FCB", "Opel", "Vectra", "blanco"));
		coches.insetarCoche(new Coche("8791CRL", "Renault", "Clio", "azul"));
		coches.insetarCoche(new Coche("2900BFK", "Renault", "Megane", "negro"));
		coches.insetarCoche(new Coche("2901BFK", "Renault", "Megane", "azul"));
		coches.insetarCoche(new Coche("2902BFK", "Renault", "Megane", "azul"));
		
		System.out.println(coches.verCoche(4));
		System.out.println();
		
		System.out.println(coches.buscarMatricula("5499FCB"));
		System.out.println(coches.buscarMatricula("0000BBB"));
		System.out.println();

		mostrarCocheDeLista(coches.buscarPorMarca("Opel"));
		System.out.println();

		mostrarCocheDeLista(coches.buscarPorMarca("Renault"));

	}

	private static void mostrarCocheDeLista(Coche[] coches) {		
		for(Coche coche : coches)
			System.out.println(String.format(
				"%s\t=> %s %s",
				coche.getMatricula(), coche.getMarca(), coche.getModelo()));
	}

}
