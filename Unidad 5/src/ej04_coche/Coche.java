package ej04_coche;

public class Coche {
	private String marca = "";
	private String modelo = "";
	
	public Coche(){
	}
	
	public Coche(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String mostrarDatos(){
		return "Marca: " + this.marca + "\nModelo: " + this.modelo;
	}
}
