package org.pis2.serie;

import java.util.*;

public class Entrada {

	/*
	 * Variables
	 */
	private int N;//Numero de elementos.
	private ArrayList<Integer> numeros; //Seríe de numeros
	private ArrayList<Integer> incrementos; //incrementos entre serie de numeros


	/*
	 * Constructor
	 */
	public Entrada(int n,ArrayList<Integer> numeros, ArrayList<Integer> incrementos ){
		this.N = n;
		this.numeros = numeros;
		this.incrementos = incrementos;
	}

	/*Deprecated
	 * public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 *
	 */


	/*
	 * Getters
	 */
	public int getN() {
		return N;
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public ArrayList<Integer> getIncrementos() {
		return incrementos;
	}


}
