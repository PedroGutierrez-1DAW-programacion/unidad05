package ej03_millasKilometros;

public class conversor {
	private final static double kmPorMilla = 1.852;
	
	public static double millasAMetros(double millas){
		return millasAKilometros(millas) * 1000;
	}
	
	public static double millasAKilometros(double millas){
		return millas * kmPorMilla;
	}

}
