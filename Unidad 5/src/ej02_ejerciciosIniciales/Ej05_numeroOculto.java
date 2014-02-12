package ej02_ejerciciosIniciales;

public class Ej05_numeroOculto {
	private int numero;

	public Ej05_numeroOculto(){
		this.numero = (int) (Math.random() * 100);
	}
	public Ej05_numeroOculto(int min, int max){
		this.numero = (int) (min + (Math.random() * (max - min)));
	}
	
	public int pruebaNumero(int n){
		if(n == this.numero) return 0;
		else if(n<this.numero) return 1;
		else return -1;
	}

}
