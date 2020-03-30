package clases;

public class Actividad implements Comparable<Actividad>{

	private int comienzo;
	private int finalizacion;
	
	public Actividad(int comienzo, int finalizacion){
		this.comienzo = comienzo;
		this.finalizacion = finalizacion;
	}

	public int getComienzo() {
		return comienzo;
	}

	public int getFinalizacion() {
		return finalizacion;
	}

	public int compareTo(Actividad o) {
		return this.comienzo - o.comienzo;
	}

}
