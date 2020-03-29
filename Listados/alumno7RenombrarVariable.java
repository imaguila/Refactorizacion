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