package ej02_ejerciciosIniciales;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Ej05_numeroOculto oculto = new Ej05_numeroOculto();
		int n=0;
		
		do{
			n = oculto.pruebaNumero(teclado.nextInt());
			
			switch(n){
				case 0: System.out.println("[Número correcto]"); break;
				case 1: System.out.println("[El número es mayor]"); break;
				case -1: System.out.println("[El número es manor]"); break;
			}
		}while(n!=0);
		
		teclado.close();

	}

}
