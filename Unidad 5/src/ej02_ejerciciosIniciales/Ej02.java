package ej02_ejerciciosIniciales;

public class Ej02 {

	public static void main(String[] args) {
		Ej02_coche coche = new Ej02_coche();

		coche.acelera(20);
		coche.acelera(40);
		coche.acelera(21);
		
		System.out.println(coche.getVelocidad());

	}

}
