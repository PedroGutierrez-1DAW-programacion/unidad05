package ej08_peso;

public class Peso {
	private double pesoKG;
	
	public Peso(double peso, String unidad){
		// Si la unidad es errónea usa el Kg como unidad
		this.pesoKG = peso * (1 / getPesoPorKilo(unidad));
	}

	private final double getPesoPorKilo(String unidad){
		switch(unidad.toLowerCase()){
			default:
			case "kg":	return 1.00000000; // Kilogramos
			case "lb":	return 2.20462262; // Libras
			case "li":	return 0.06854009; // Lingotes
			case "oz":	return 35.2739619; // Onzas
			case "p":	return 645.161290; // Peniques
			case "g":	return 1000.00000; // Gramos
			case "q":	return 0.01000000; // Quintales
		}
	}

	public double getPeso(String unidad){ // Peso con dos decimales
		return getPeso(unidad, 2);
	}                             
	
	public double getPeso(String unidad, int decimales){ // Peso con los decimales establecidos
		return redondeo(this.pesoKG * getPesoPorKilo(unidad), decimales);
	}

	public double getLibras(){
		return getPeso("lb");
	}
	
	public double getLingotes(){
		return getPeso("li");
	}
	
	private double redondeo(double n, int decimales){
		double mult = Math.pow(10, decimales);
		return Math.round(n * mult) / mult;
	}	
}