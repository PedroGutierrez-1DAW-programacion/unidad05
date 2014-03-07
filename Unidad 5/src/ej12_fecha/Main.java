package ej12_fecha;

public class Main {

	public static void main(String[] args) {
		
		Fecha f1 = nuevaFecha(12, 26, 2010);
		
		for(int i=0; i<10; i++){
			System.out.println(f1.toString());
			f1.aumentarDia();
		}
		
		System.out.println(f1.toString());

	}
	
	private static Fecha nuevaFecha(int elMes, int elDia, int elAnio){
		Fecha devolver;
		try{
			devolver = new Fecha(elMes, elDia, elAnio);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			return new Fecha(1,1,1970);
		}
		return devolver;
	}

}
