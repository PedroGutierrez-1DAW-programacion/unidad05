package ej15_listaCoches;

public class Coche {
	private String matricula, marca, modelo, color;
	
	public Coche(String matricula, String marca, String modelo, String color){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	public String toString(){
		return String.format(
			"Matrícula: %s\n" +
			"Marca:\t %s\n" +
			"Modelo:\t %s\n" +
			"Color:\t %s",
			matricula, marca, modelo, color);
	}

}
