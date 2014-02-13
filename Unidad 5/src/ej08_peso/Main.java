package ej08_peso;

public class Main {

	public static void main(String[] args) {

		Peso peso = new Peso(100, "oz");

		System.out.println(peso.getPeso("lb"));
		System.out.println(peso.getPeso("q", 6));
		System.out.println(peso.getPeso("li", 4));

	}

}
