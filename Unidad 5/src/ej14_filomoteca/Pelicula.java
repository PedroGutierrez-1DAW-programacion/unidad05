package ej14_filomoteca;

import ej12_fecha.Fecha;

public class Pelicula {
	private int id;
	private String titulo;
	private String[] actores, directores;
	private Fecha estreno;
	
	public Pelicula(String titulo, String[] actores, String[] directores, Fecha estreno){
		this.titulo = titulo;
		this.actores = actores;
		this.directores = directores;
		this.estreno = estreno;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String[] getActores() {
		return actores;
	}
	public void setActores(String[] actores) {
		this.actores = actores;
	}
	public String[] getDirectores() {
		return directores;
	}
	public void setDirectores(String[] directores) {
		this.directores = directores;
	}
	public Fecha getEstreno() {
		return estreno;
	}
	public void setEstreno(Fecha estreno) {
		this.estreno = estreno;
	}

	public String toString(){
		String	listaActores = "",
				listaDirectores = "";
		
		for (String actor : this.actores) {
			listaActores += "   " + actor + "\n";
		}
		for (String director : this.directores) {
			listaDirectores += "   " + director + "\n";
		}
		
		return String.format(
			"--[Pel�cula]-----------\n" +
			"T�tulo: %s\n" +
			"Directores:\n%s" +
			"Actores:\n%s"+
			"Estreno: %s\n" +
			"-----------------------\n",
			this.titulo, listaDirectores, listaActores, estreno.toString());
			
	}
}