package ej09_consumoCoche;

public class Main {

	public static void main(String[] args) {
		Consumo coche = new Consumo(230.24, 14.2, 86.4, 1.33);

		System.out.println(coche.getTiempo());
		System.out.println(coche.getConsumoMedio());
		System.out.println(coche.getConsumoEuros());
		

	}

}
