package main;

import java.util.Scanner;

import models.Actividad;
import models.DiaPlanificado;
import models.Estudiante;

public class main {

	static boolean error = false;
	static Estudiante estudiante;
	static Scanner scanner = new Scanner(System.in); // Create a Scanner object

	public static void main(String[] args) {

		while (true) {
			
			start();
			
			System.out.println("Desea agregar más dias?");
			System.out.println("Escriba 1 para si y 2 para no");
			int opcion = scanner.nextInt();
			if (opcion == 1) {
				error = false;
				start();
			}else {
				System.out.println(estudiante.printEstudiante());
			}
		}
		
		

	}
	
	public static void start() {
		while (!error) {
			
			introducirDatos();
			
		}
	}
	
	public static void introducirDatos() {
		try {

			System.out.println("Introduzca su nombre");
			estudiante = new Estudiante(scanner.next());

			System.out.println("Introduce el número de actividades");
			int numeroActividades = scanner.nextInt();
			DiaPlanificado dia = new DiaPlanificado(numeroActividades);
			int temp = 0;
			while (temp < numeroActividades) {
				System.out.println("Introduce la hora de inicio de actividad");
				int horaInicio = scanner.nextInt();

				System.out.println("Introduce la hora de final de actividad");
				int horaFinal = scanner.nextInt();
				Actividad actividad = new Actividad(temp);
				actividad.setHoraInicio(horaInicio);
				actividad.setHoraFin(horaFinal);
				dia.addActividad(actividad);
				temp++;
			}
			estudiante.addDiaPlanificado(dia);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			error = false;
			System.out.println("Error, debe empezar de nuevo");
//			for (int i =0 ; i<100; i++) {
//				System.out.println();
//			}
			return;
		} 
		
		error = true;
	}

}
