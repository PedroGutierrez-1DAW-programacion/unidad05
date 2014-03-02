package ej11_hora;

public class Hora {
	private int hora, min, seg;
	final int
		maxHora = 24,
		maxMin = 60,
		maxSeg = 60;
	
	public Hora(){
		this.hora = 0;
		this.min = 0;
		this.seg = 0;
	}	
	public Hora(int hora, int minuto, int segundo){
		this.hora = hora % maxHora;
		this.min = minuto % maxMin;
		this.seg = segundo % maxSeg;
	}
	
	public int getHora() {
		return hora;
	}
	public int getMin() {
		return min;
	}
	public int getSeg() {
		return seg;
	}

	public String toString(){
		return
			this.hora + ":" +
			this.min + ":" + 
			this.seg;
	}
	
	public void suma(Hora sumarHora){
		int hora = sumarHora.getHora();
		int minuto = sumarHora.getMin();
		int segundo = sumarHora.getSeg();
		
		this.seg += segundo;
		
		this.min += this.seg / maxSeg;
		this.min += minuto;
		
		this.hora += this.min / maxMin;
		this.hora += hora;
		
		this.seg %= maxSeg;
		this.min %= maxMin;
		this.hora %= maxHora;
	}
	

}
