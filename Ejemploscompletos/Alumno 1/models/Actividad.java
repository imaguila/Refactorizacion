package models;

public class Actividad {

	int horaInicio;
	int horaFin;
	int numActividad;
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}
	public int getNumActividad() {
		return numActividad;
	}
	public void setNumActividad(int numActividad) {
		this.numActividad = numActividad;
	}
	public Actividad(int numActividad) {
		super();
		this.numActividad = numActividad;
	}
	public String printActividad() {
		StringBuilder str = new StringBuilder();
		str.append("La actividad número: " + numActividad);
		str.append("\n");
		str.append("Hora de inicio: " + horaInicio + " - Hora de fin: " + horaFin);
		str.append("\n");
		return str.toString();
	}
	
}
