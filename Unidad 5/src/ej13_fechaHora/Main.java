package ej13_fechaHora;

public class Main {

	public static void main(String[] args) {
		
		FechaHora f1 = new FechaHora(2010, 12, 31, 20, 42, 58);
		
		for(int i=0; i<10; i++){
			System.out.println(f1.toString());
			f1.siguienteHora();
		}
		
		System.out.println(f1.toString());

	}

}
