package ej15_listaCoches;

import java.util.Vector;

public class ListaCoches {
	private Vector<Coche> coches = new Vector<Coche>();
	
	public void insetarCoche(Coche coche){
		coches.add(coche);
	}
	public String verCoche(int index){
		return coches.elementAt(index).toString();
	}
	public int buscarMatricula(String matricula) {
		for(Coche coche : coches)
			if(coche.getMatricula().toLowerCase().equals(matricula.toLowerCase()))
				return coches.indexOf(coche);
		
		return -1;
	}
	public Coche[] buscarPorMarca(String marca){
		Vector<Coche> cochesPorMarca = new Vector<Coche>();
		
		for(Coche coche : coches)
			if(coche.getMarca().toLowerCase().equals(marca.toLowerCase()))
				cochesPorMarca.add(coche);
		
		return cochesPorMarca.toArray(new Coche[cochesPorMarca.size()]);
	}
}
