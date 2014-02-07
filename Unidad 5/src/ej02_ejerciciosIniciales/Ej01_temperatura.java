package ej02_ejerciciosIniciales;

public class Ej01_temperatura {
	private double temperatura = 0; // En ºC
	
	public static double celsiusToFarenheit(double grados){
		return grados * 9/5.0 + 32.0;
	}
	public static double farenheitToCelsius(double grados){
		return (grados - 32) * 5/9.0;
	}
	
	public double getCelsius() {
		return this.temperatura;
	}
	public void setCelsius(double grados) {
		this.temperatura = grados;
	}

	public double getFahrnheit() {
		// F = C * 9/5 + 32
		return this.temperatura * 9/5.0 + 32.0;
	}
	public void setFahrnheit(double grados) {
		// C = (F - 32) * 5/9
		this.temperatura = (grados - 32) * 5/9.0;
	}

	public double getKelvin() {
		return this.temperatura + 273;
	}
	public void setKelvin(double grados) {
		this.temperatura = grados - 273;
	}
}
