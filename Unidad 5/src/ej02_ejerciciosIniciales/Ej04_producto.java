package ej02_ejerciciosIniciales;

public class Ej04_producto {
	private int codigo;
	private double precio;
	private double descuento;
	
	public Ej04_producto(int codigo, double precio, double descuento){
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = (100 - descuento) / 100;
	}
	
	public double getPrecioTotal(){
		return round(precio * descuento, 2);
	}
	public double getPrecioTotal(int nuevoPrecio){
		return round(nuevoPrecio * descuento, 2);
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getDescuento() {
		return (descuento * 100) - 100;
	}
	public void setDescuento(double descuento) {
		this.descuento = (100 - descuento) / 100;
	}
	
	public static double round(double n, int digits){
		double multi = (double) Math.pow(10, digits);
		return Math.round(n * multi) / multi;
	}

}
