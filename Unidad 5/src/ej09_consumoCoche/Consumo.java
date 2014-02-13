package ej09_consumoCoche;

public class Consumo {
	private double kms;			// Kilómetros recorridos por el coche.
	private double litros;		// Litros de combustible consumido.
	private double vmed;		// Velocidad media.
	private double pgas;		// Precio de la gasolina.
	
	public Consumo(double kmRecorridos, double listros, double velocidadMedia, double precioGasolina){
		this.kms = kmRecorridos;
		this.litros = listros;
		this.vmed = velocidadMedia;
		this.pgas = precioGasolina;
	}
	
	public String getTiempo(){
		return redondeo(60 / this.vmed * this.kms, 2) + "\t[minutos]";
	}
	
	private double getDoubleConsumoMedio(){
		return this.litros / this.kms * 100;
	}
	
	public String getConsumoMedio(){
		return redondeo(getDoubleConsumoMedio(), 2) + "\t[l/100km]";
	}
	
	public String getConsumoEuros(){
		return redondeo(getDoubleConsumoMedio() *  this.pgas, 2) + "\t[€/100km]";
	}

	public void setKms(double kmRecorridos){
		this.kms = kmRecorridos;
	}
	public void setLitros(double listros){
		this.litros = listros;
	}
	public void setVmed(double velocidadMedia){
		this.vmed = velocidadMedia;
	}
	public void setPgas(double precioGasolina){
		this.pgas = precioGasolina;
	}

	
	private double redondeo(double n, int decimales){
		double mult = Math.pow(10, decimales);
		return Math.round(n * mult) / mult;
	}
}
