package org.pis2.serie;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

/*
 * Ciclos de no m�s de 3
 */

public class PruebasSerie {
	String directorioEntrada = "";
	Lector lect = null;
	ArrayList<Entrada> entradas = new ArrayList<Entrada>();
	ArrayList<Integer> salidas = new ArrayList<Integer>(Arrays.asList(2, 12, 10, 13, 9, 15, 7, 12, 9, 13));


	@Before
	public void setUp() throws Exception {
		directorioEntrada = System.getProperty("user.dir") + File.separator +
			    "src" + File.separator +
			    "org" + File.separator +
			    "pis2" + File.separator +
			    "serie" + File.separator;


	}


	@Test
	public void testGlobal(){
		lect = new Lector();
		entradas = lect.cargarArchivo(directorioEntrada + "EntradaPrueba");

		System.out.println("Numero de entradas: " + entradas.size());
		System.out.println("Salidas resultantes del algoritmo");
		System.out.print("- ");
		Salida sal = null;
		for(int i = 0;i < entradas.size();i++){
			sal = new Salida(entradas.get(i));
			sal.calculaCiclo();
			int salida = (sal.calculaSalida());

			System.out.print(salida + " - ");
			assertEquals(salida + "", salidas.get(i).toString());
		}
	}


}
