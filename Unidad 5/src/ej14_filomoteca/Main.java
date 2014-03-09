package ej14_filomoteca;

import ej12_fecha.Fecha;

public class Main {
	/*
	 * Ejercicio 6 Imagina que quieres crear un programa que te permita organizar tus pel�culas.
	 *   Crearemos una clase Pel�cula donde recogemos toda la informaci�n relacionada con un film.
	 *   Algunos campos ser�n Titulo, Actores (array de nombres), Directores (array de nombres),
	 *   fecha estreno, formato, etc. Crea un programa (clase Filmoteca) que permita: insertar,
	 *   modificar, eliminar, buscar o visualizar una pel�cula.
	 */

	public static void main(String[] args) {
		Filmoteca drama = new Filmoteca("Drama");
		
		drama.insertar(peliculasDePrueba());		
		drama.acciones();	

	}

	private static Pelicula[] peliculasDePrueba() {
		return new Pelicula[]{
			new Pelicula(
				"El saltamontes mec�nico",
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
				"El caso Paca (Resurreci�n)",
				new String[]{"Gimeno Suarez","Ramon de Cerbando","Alfonso Guerra"},
				new String[]{"Ramiro Castro"},
				Fecha.nuevaFecha(6, 29, 2012))
		};
	
	}
	
}
