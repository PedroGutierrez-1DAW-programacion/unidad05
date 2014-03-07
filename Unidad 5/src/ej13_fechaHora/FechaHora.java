package ej13_fechaHora;

import ej11_hora.Hora;
import ej12_fecha.Fecha;

public class FechaHora {
	private Fecha fecha;
	private Hora hora;
	
	public FechaHora(int anio, int mes, int dia, int hora, int min, int seg){
		this.fecha = nuevaFecha(mes, dia, anio);
		this.hora = new Hora(hora, min, seg);
	}
	
	public void siguienteHora(){
		int horaAntigua = this.hora.getHora();
		
		this.hora.incrementarHora();
		
		//Si pasa al siguiente dia
		if(horaAntigua > this.hora.getHora())
			this.fecha.aumentarDia();
	}
	
	public String toString(){
		return 
			this.fecha.toString() + " " +
			this.hora.toString();
	}
	
	private static Fecha nuevaFecha(int elMes, int elDia, int elAnio){
		Fecha devolver;
		try{
			devolver = new Fecha(elMes, elDia, elAnio);
		}catch(IllegalArgumentException e){
			System.out.println("Fecha no válida: [" + e.getMessage() + "]");
			return new Fecha(1,1,1970);
		}
		return devolver;
	}
}
