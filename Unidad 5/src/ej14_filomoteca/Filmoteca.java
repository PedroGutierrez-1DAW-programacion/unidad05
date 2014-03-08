package ej14_filomoteca;

import java.util.Scanner;
import java.util.Vector;

import ej12_fecha.Fecha;

public class Filmoteca {
	private Vector<Pelicula> peliculas = new Vector<Pelicula>();
	private String titulo;
	private int idAsignadas = 0;
	
	public Filmoteca(String titulo){
		this.titulo = titulo;
	}
	
	// Insertar datos
	public void insertar(){
		Scanner teclado = new Scanner(System.in);

		String titulo;
		Vector <String> actores = new Vector <String>();
		Vector <String> directores = new Vector <String>();
		int dia, mes, anio;

		System.out.println("--[Insertar]-----------");

		System.out.print("Titulo => ");
		titulo = teclado.nextLine();

		System.out.print("Día del estreno => ");
		dia = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Mes del estreno => ");
		mes = Integer.parseInt(teclado.nextLine());
		
		System.out.print("Año del estreno => ");
		anio = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Directores: ");
		while(true){
			System.out.print("  => ");
			String director = teclado.nextLine();
			
			if(director.equals("")) break;
			
			directores.add(director);
		}
		
		System.out.println("Actores: ");
		while(true){
			System.out.print("  => ");
			String actor = teclado.nextLine();
			
			if(actor.equals("")) break;
			
			actores.add(actor);
		}
		
		insertar(new Pelicula(
			titulo,
			(String[]) actores.toArray(new String[actores.size()]),
			(String[]) directores.toArray(new String[directores.size()]),
			Fecha.nuevaFecha(mes, dia, anio)));
		
		System.out.println("-----------------------\n");
		
		teclado.close();
	}
	// Insertar objeto Pelicula nuevo
	public void insertar(Pelicula pelicula){
		peliculas.add(pelicula);
		peliculas.lastElement().setId(idAsignadas++);	
	}
	
	// Eliminar una pelicula por la ID
	public void eliminar(int id){
		for(Pelicula pelicula : this.peliculas)
			if(pelicula.getId() == id){
				this.peliculas.remove(pelicula);
				break;
			}
	}
	
	// Información de la pelíula por su ID
	public String informacion(int id){
		for(Pelicula pelicula : this.peliculas)
			if(pelicula.getId() == id)
				return pelicula.toString();

		return null;
	}
	
	// Buscar texto contenido en los títulos
	public String buscar(String busqueda){
		String lista = "";
		
		for(Pelicula pelicula : this.peliculas)
			if(pelicula.getTitulo().toLowerCase().indexOf(busqueda.toLowerCase()) != -1)
				lista += String.format("  [%s]\t%s\n", pelicula.getId(), pelicula.getTitulo());
		
		return
			"--[Busqueda]-----------\n" +
			"Buscando: \"" + busqueda + "\"\n" +
			"Películas:\n" + 
			lista +
			"-----------------------\n";
	}
	
	// Lista de las películas
	public String toString(){
		String lista = "";
		
		for(Pelicula pelicula : this.peliculas){
			lista += String.format("  [%s]\t%s\n", pelicula.getId(), pelicula.getTitulo());
		}

		return String.format(
			"--[Filmoteca]----------\n" +
			"Titulo: %s\n" +
			"Películas:\n%s" + 
			"-----------------------\n",
			this.titulo, lista);
	}
}
