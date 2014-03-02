package ej11_hora;

public class Main {

	public static void main(String[] args) {
		
		Hora mihora, unahoraycuarto, horaVacia;
		
		mihora=new Hora(12,45,32);
		unahoraycuarto=new Hora(1,15,0);
		horaVacia = new Hora();
		
		mihora.suma(unahoraycuarto);
		
		System.out.println(mihora.toString());

		horaVacia.suma(mihora);
		horaVacia.suma(unahoraycuarto);
		
		System.out.println(horaVacia.toString());
	}

}
