package ej05_euroDolar;

public class Finanzas {
	private double euroDolarDefault = 1.36;
	private double euroDolar;
	
	public Finanzas(){
		this.euroDolar = euroDolarDefault;
	}
	
	public Finanzas(double newEuroDolar){
		this.euroDolar = newEuroDolar;
	}
	
	public double dolaresToEuros(double dolares){
		return redondeo(1 / euroDolar * dolares);
	}
	
	public double eurosToDolares(double euros){
		return redondeo(euros * euroDolar);
	}
	
	private double redondeo(double n){
		return Math.round(n * 100) / 100.0;
	}

}
