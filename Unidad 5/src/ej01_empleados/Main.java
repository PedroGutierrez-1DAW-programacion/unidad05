package ej01_empleados;

public class Main {

	public static void main(String[] args) {

		Empleado juan = new Empleado("Juan", "Perez");
		juan.setSueldoBase(1100);
		
		System.out.println(juan.calcularSueldoalculaSueldo(10, 12.4));

	}

}

/*

Clase Empleado, tiene:
	// Atributos
	Nombre
	Apellido 1
	Apellido 2
	DNI
	SueldoBase
	
	// Constructores
	Empleado()
	Empleado(Nombre,Apellido1)
	
	// M�todos
	calculaSueldo(horasExtra, precioHora)
	  // sueldo = sueldoBase+horasExtra*precioHora;

Vamos a hacer una Agenda, necesitamos la clase Contacto, que tiene:
	Nombre
	Apellido 1
	Apellido 2
	Direcci�n
	telFijo
	telMovil
	mail
	
	// constructores
	Contacto(Nombre,Apellido 1,movil)
	Contacto(Nombre,Apellido 1,Apellido 2,movil)
	Contacto(Nombre,Apellido 1,Apellido 2,dir,movil,fijo,correo)
	
	// m�todos
	M�todos get/set para todos los atributos
	
	

*/