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