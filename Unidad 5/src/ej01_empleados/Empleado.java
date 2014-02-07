package ej01_empleados;
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
	
	// Métodos
	calculaSueldo(horasExtra, precioHora)
	  // sueldo = sueldoBase+horasExtra*precioHora;
 */

public class Empleado {
	private String nombre;
	private String apellido_1;
	private String apellido_2;
	private String DNI;
	private int sueldoBase = 0;

	public Empleado(String nombre, String apellido_1){
		this.nombre = nombre;
		this.apellido_1 = apellido_1;
	}
	
	public double calcularSueldoalculaSueldo(int horasExtra, double precioHora){
		return this.sueldoBase + (horasExtra * precioHora);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_1() {
		return apellido_1;
	}

	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}

	public String getApellido_2() {
		return apellido_2;
	}

	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
}
