package ej02_ejerciciosIniciales;

public class Ej02_coche {
	private int velocidad;
	
	public Ej02_coche() {
		  velocidad=0;
	}
	
	public void acelera(int aceleracion){
		this.velocidad += aceleracion;
	}
	
	public int getVelocidad(){
		return this.velocidad;
	}
}
