package ej14_filomoteca;

import ej12_fecha.Fecha;

public class Main {
	/*
	 * Ejercicio 6 Imagina que quieres crear un programa que te permita organizar tus películas.
	 *   Crearemos una clase Película donde recogemos toda la información relacionada con un film.
	 *   Algunos campos serán Titulo, Actores (array de nombres), Directores (array de nombres),
	 *   fecha estreno, formato, etc. Crea un programa (clase Filmoteca) que permita: insertar,
	 *   modificar, eliminar, buscar o visualizar una película.
	 */

	public static void main(String[] args) {
		Filmoteca drama = new Filmoteca("Drama");
		
		drama.insertar(peliculasDePrueba());		
		drama.acciones();	

	}

	private static Pelicula[] peliculasDePrueba() {
		return new Pelicula[]{
			new Pelicula(
				"El saltamontes mecánico",
				new String[]{"Carlos Guchurrea","Miguel Juanes","Alfonso Guerra"},
				new String[]{"Manuel de la Fuente"},
				Fecha.nuevaFecha(12, 17, 2010)),
			new Pelicula(
				"La noche del ayer",
				new String[]{"Miguel Juanes","Ramon de Cerbando"},
				new String[]{"Carlos Azulez"},
				Fecha.nuevaFecha(7, 3, 2011)),
			new Pelicula(
				"El caso Paca",
				new String[]{"Gimeno Suarez","Ramon de Cerbando","Carlos Guchurrea","Alfonso Guerra"},
				new String[]{"Ramiro Castro"},
				Fecha.nuevaFecha(2, 14, 2010)),
			new Pelicula(
				"Nunca lo digas dos veces",
				new String[]{"Ramon de Cerbando","Gimeno Suarez"},
				new String[]{"Manuel de la Fuente"},
				Fecha.nuevaFecha(9, 18, 2011)),
			new Pelicula(
				"El caso Paca (Resurreción)",
				new String[]{"Gimeno Suarez","Ramon de Cerbando","Alfonso Guerra"},
				new String[]{"Ramiro Castro"},
				Fecha.nuevaFecha(6, 29, 2012))
		};
	
	}
	
}
