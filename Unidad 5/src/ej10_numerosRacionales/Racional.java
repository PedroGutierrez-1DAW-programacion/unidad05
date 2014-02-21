package ej10_numerosRacionales;

public class Racional {
	private int nominador;
	private int denominador;
	
	Racional(int nominador, int denominador){
		this.nominador = nominador;
		this.denominador = denominador;
	}

	public int getNominador() {
		return nominador;
	}
	public void setNominador(int nominador) {
		this.nominador = nominador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public String toString(){
		return this.nominador + "/" + this.denominador;
	}
	public float toFloat(){
		return (float) (this.nominador/1.0/this.denominador);
	}
	
	public void suma(Racional numero){
		int oNumerador = numero.getDenominador() * this.nominador;
		int nNumerador = this.denominador * numero.getNominador();
		setNomDen(
			oNumerador + nNumerador,
			this.denominador * numero.getDenominador()
		);
	}
	public void resta(Racional numero){
		int oNumerador = numero.getDenominador() * this.nominador;
		int nNumerador = this.denominador * numero.getNominador();
		setNomDen(
			oNumerador - nNumerador,
			this.denominador * numero.getDenominador()
		);
	}
	public void multiplicar(Racional numero){
		setNomDen(
			this.nominador * numero.getNominador(),
			this.denominador * numero.getDenominador()
		);
	}
	public void dividir(Racional numero){
		setNomDen(
			this.nominador * numero.getDenominador(),
			this.denominador * numero.getNominador()
		);
	}
	
	private void setNomDen(int nominador, int denominador){
		this.nominador = nominador;
		this.denominador = denominador;
		simplificar();
	}
	
	private void simplificar(){
		int actualMCD = mcd(this.nominador, this.denominador);
		this.denominador /= actualMCD;
		this.nominador /= actualMCD;
	}
	
	private int mcd(int a, int b){ 
		int temp; 
		if(a<b){ 
			temp = a;
			a = b;
			b = temp; 
		} 
		do{ 
			temp = b;
			b = a % b;
			a = temp; 
		}while(b != 0); 
		return a;
	} 
}
