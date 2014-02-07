package ej02_ejerciciosIniciales;

public class Ej01 {

	public static void main(String[] args) {
		Ej01_temperatura temp = new Ej01_temperatura();
		
		temp.setCelsius(20);
		System.out.println(temp.getFahrnheit());
		System.out.println(temp.getKelvin());
		
		System.out.println(Ej01_temperatura.celsiusToFarenheit(20));

	}

}
