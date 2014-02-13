package ej08_peso;

public class Peso {
	private double pesoKG;

	private final double kgLibra	=	2.20462262;
	private final double kgLingote	=	0.06854009;
	private final double kgOnza		=	35.2739619;
	private final double kgPenique	= 	645.161290;
	private final double kgGramos	=	1000.00000;
	private final double kgQuintal	= 	0.01000000;
	
	public Peso(double peso, String unidad){
		// Si la unidad es errónea devuelve usa el Kg
		this.pesoKG = peso * (1 / getPesoPorKilo(unidad));
	}

	public double getPeso(String unidad){
		return getPeso(unidad, 2);
	}
	
	public double getPeso(String unidad, int decimales){
		return redondeo(this.pesoKG * getPesoPorKilo(unidad), decimales);
	}

	public double getLibras(){
		return getPeso("lb");
	}
	
	public double getLingotes(){
		return getPeso("li");
	}

	private double getPesoPorKilo(String unidad){
		switch(unidad.toLowerCase()){
			case "lb": return kgLibra;
			case "li": return kgLingote;
			case "oz": return kgOnza;
			case "p": return kgPenique;
			case "kg": return 1;
			case "g": return kgGramos;
			case "q": return kgQuintal;
		}
		return 1;
	}
	
	private double redondeo(double n, int decimales){
		double mult = Math.pow(10, decimales);
		return Math.round(n * mult) / mult;
	}
	
}
