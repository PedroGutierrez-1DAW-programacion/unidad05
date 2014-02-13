package ej06_miNumero;

public class MiNumero {
	
	private int n;
	
	public MiNumero(int n){
		this.n = n;
	}
	
	public int doble(){
		return this.n * 2;
	}
	
	public int triple(){
		return this.n * 3;
	}
	
	public int cuadruple(){
		return this.n * 4;
	}

	public static void main(String[] args) {

		MiNumero numero = new MiNumero(9);

		System.out.println(numero.doble());
		System.out.println(numero.triple());
		System.out.println(numero.cuadruple());

	}

}
