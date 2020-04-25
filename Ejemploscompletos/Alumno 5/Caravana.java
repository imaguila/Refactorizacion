package org.pris.ejericicio_01;

import java.util.ArrayList;

public class Caravana {
	
	public Caravana() {
		
	}
	
	public int calcularBurros(ArrayList<Integer> pesosSacos, int burrosDisponibles) {
		Integer saco;
		int burrosUsados = burrosDisponibles;
		int posicion;
		while(burrosDisponibles != 0 && pesosSacos.size() != 0) {
			saco = pesosSacos.remove(0);
			posicion = pesosSacos.indexOf(saco);
			if(posicion != -1) {
				pesosSacos.remove(posicion);
				burrosDisponibles--;
			}
		}
		return burrosUsados - burrosDisponibles;
	}

}
