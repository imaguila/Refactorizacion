package Party;


import java.util.ArrayList;
import java.util.Scanner;

public class Data {

	public  ArrayList<Integer> readData(){

		ArrayList<Integer> group = new ArrayList<Integer>();
		Scanner reader = new Scanner(System.in);
		int aux = 0;

		System.out.println("Introducir grupos de edades. Numero 0 para acabar");


		do {
			aux = reader.nextInt();
			group.add(aux);

		} while (aux != 0);

		return group;

		}

	}



