package org.pris.ejericicio_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculador {
	
	public static boolean comprobarCantidad(Integer cantidad) {
		return (cantidad < 1000000 && cantidad > 0) ? true :  false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroPruebas;
		int burrosDisponibles;
		int cantidadSacos; 
		Scanner in = new Scanner(System.in);
		String input;
		do {
			System.out.println("Introducir número de casos de prueba (entero positivo mayor a 0)");
			input = in.nextLine();
			try {
				numeroPruebas = Integer.valueOf(input.trim());
			}
			catch(Exception e) {
				throw new RuntimeException("Valor no valido para numero de casos");
			}
		} while(numeroPruebas <= 0);
		
		ArrayList<Integer> pesosSacos;
		Caravana c = new Caravana();
		
		for (int caso = 0; caso < numeroPruebas; caso++) {
			String[] datos;
			pesosSacos = new ArrayList<Integer>();
			do {
				System.out.println("Introducir número de burros disponibles (numero positivo diferente de 0) y numero de sacos a cargar (entre 1 y 1.000.000). Caso: " + (caso + 1));
				input = in.nextLine();
				try {
					datos = input.split(" ");
					burrosDisponibles = Integer.valueOf(datos[0]);
					cantidadSacos = Integer.valueOf(datos[1]);
				}
				catch(Exception e) {
					throw new RuntimeException("Valores no validos");
				}
			}while(!(datos.length == 2) && !comprobarCantidad(cantidadSacos));
			
			do {
				System.out.println("Introduce los pesos (en gramos) de los " + cantidadSacos + " sacos separados por espacios. Valores entre 1 y 20.000: ");
				input = in.nextLine();
				try {
					datos = input.split(" ");
					for(int saco = 0; saco < datos.length; saco++) {
						pesosSacos.add(Integer.valueOf(datos[saco]));
					}
				}
				catch(Exception e) {
					throw new RuntimeException("Valores no válidos");
				}
				
			}while(!(datos.length == cantidadSacos));
			System.out.println("Burros necesarios para caso " + (caso+1) + " : " + c.calcularBurros(pesosSacos, burrosDisponibles));
		}
		in.close();
	}
}
