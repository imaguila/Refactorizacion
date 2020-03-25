package org;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static Pueblo pueblo = new Pueblo();
	static Tramo tramo;
	
	public static void main(String[] args) {
		
		newTramo();
		numeroMesas();
		
	}
	
	public static void newTramo() {
		
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("Introduce el número de personas en el tramo de edad (cuando no existan más tramos, introduce 0)");
			
			int nPersonas = scanner.nextInt();
			
			if (nPersonas != 0) {
				
				try {
					
					tramo = new Tramo(nPersonas);
					pueblo.addTramo(tramo);
					
				} catch (Exception e) {
					
					e.printStackTrace();
					
				}
				
			} else
				flag = false;
			
		}
		
	}
	
	
	public static void numeroMesas() {
		
		pueblo.calcularNumeroMesas();
		
		System.out.println("El número de mesas a utilizar es " + pueblo.getnMesas());
		
	}

}
