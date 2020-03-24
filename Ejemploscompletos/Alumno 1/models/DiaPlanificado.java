package models;

import java.util.Stack;

public class DiaPlanificado {

	int numActividadesDia;
	
	Stack<Actividad> pilaActividades = new Stack<Actividad>();

	public DiaPlanificado(int numActividadesDia) {
		super();
		this.numActividadesDia = numActividadesDia;
	}
	
	public void addActividad (Actividad actividad) {
		this.pilaActividades.push(actividad);
	}
	
	
	public String printDia() {
		StringBuilder str = new StringBuilder();
		str.append("El número de actividades es: " + numActividadesDia);
		str.append("\n");
		for (Actividad actividad : pilaActividades) {
			str.append(actividad.printActividad());
		}
		return str.toString();
	}
	
}
