package ej07_numero;

public class Main {

	public static void main(String[] args) {
		Numero n = new Numero(2);

		System.out.println(n.getValor());
		System.out.println(n.getDoble());
		System.out.println(n.getTriple());
		
		System.out.println(n.getValor());

		n.sumar(3);
		System.out.println(n.getValor());
		
		n.setNumero(9);
		System.out.println(n.getValor());

	}

}
