package models;

import java.util.Stack;

public class Estudiante {

	public Estudiante(String nombre) {
		super();
		this.nombre = nombre;
	}


	String nombre;
	Stack<DiaPlanificado> pilaDiasPlanificados = new Stack<DiaPlanificado>();
	
	
	public void addDiaPlanificado (DiaPlanificado dia) {
		this.pilaDiasPlanificados.push(dia);
	}
	
	public String printEstudiante() {
		StringBuilder str = new StringBuilder();
		str.append("El nombre del estudiante es: " + this.nombre );
		str.append("\n"); 
		for (DiaPlanificado dia : pilaDiasPlanificados) {
			str.append(dia.printDia());
		}
		return str.toString();
		
		
	}
}
