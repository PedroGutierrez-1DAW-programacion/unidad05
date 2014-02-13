package ej07_numero;

public class Numero {
	private int n;

	public Numero(){
		this.n = 0;
	}
	
	public Numero(int n){
		this.n = n;
	}
	
	public void sumar(int incremento){
		this.n += incremento;
	}
	
	public int getValor(){
		return this.n;
	}
	
	public int getDoble(){
		return this.n * 2;
	}
	
	public int getTriple(){
		return this.n * 3;
	}
	
	public void setNumero(int n){
		this.n = n;
	}
}
