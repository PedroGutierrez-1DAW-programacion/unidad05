package ej05_euroDolar;

public class Main {

	public static void main(String[] args) {
		
		Finanzas normal, variado;

		normal = new Finanzas();
		variado = new Finanzas(1.52);
		
		System.out.println(normal.dolaresToEuros(1.36));
		System.out.println(normal.eurosToDolares(1));
		
		System.out.println(variado.dolaresToEuros(1.36));
		System.out.println(variado.eurosToDolares(1));

	}

}
