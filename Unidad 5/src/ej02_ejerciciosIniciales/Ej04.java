package ej02_ejerciciosIniciales;

public class Ej04 {

	public static void main(String[] args) {

		Ej04_producto producto = new Ej04_producto(19002, 120.29, 10);

		System.out.println(producto.getPrecioTotal());
		
		producto.setPrecio(287.01);
		System.out.println(producto.getPrecioTotal());
		
		producto.setDescuento(50.5);
		System.out.println(producto.getPrecioTotal());
		
		System.out.println(producto.getPrecioTotal(200));
	}

}
