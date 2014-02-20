package ej10_numerosRacionales;

/*
Numeros Racionales
clase Racional

Constructores:
Por defecto 1
Con los valores que le pase

Metodos:
get/set
Sumar (Racional a, Racional b)
o
Sumar(Racional otro)
Restar
Dividir
Multiplicar
toSring() \"1/2\"
toFloatString() \"0.5\"

Metodo privado:
simplificar(Ejemplo: 2/4 --> 1/2)

Clase para probarlo: Leer dos números racionales, mostrar un menu para (sumar/restar/multiplicar/dividir) hacer la operacion y mostrarla
 */

public class Main {

	public static void main(String[] args) {

		Racional num1 = new Racional(1,2);
		Racional num2 = new Racional(3,4);

		System.out.println(num1.toString());
		
		num1.suma(num2);

		System.out.println(num1.toString());
		
		num1.resta(num2);

		System.out.println(num1.toString());
		
		num1.multiplicar(num1);

		System.out.println(num1.toString());
		
		num1.dividir(num2);

		System.out.println(num1.toString());
	}

}
