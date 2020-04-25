public static void main(String[] args) {
		TreeSet<Actividad> actividades = new TreeSet<Actividad>();
		String entrada;
		String[] entradas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero de actividades o 0 para finalizar:");
		while (sc.hasNextLine()) {			
			entrada = sc.nextLine();
			if (entrada.equals("0")) {
				break;
			}
			int numeroActividades = Integer.parseInt(entrada);
			if (numeroActividades > 200000 || numeroActividades < 1) {
				System.out.println("Por favor, introduzca un numero entre 1 y 200000 (inclusives).");
				continue;
			}
			System.out.println("Introduzca los horarios de las actividades (comienzo y finalizacion):");
			for (int i = 0; i < numeroActividades; i++) {
				entrada = sc.nextLine();
				entradas = entrada.split(" ");
				if (Integer.parseInt(entradas[0]) > Integer.parseInt(entradas[1])) {
					System.out.println("El inicio debe ser menor que la finalizacion.");
					i--;
					continue;
				}
				actividades.add(new Actividad(Integer.parseInt(entradas[0]), Integer.parseInt(entradas[1])));
			}
			Algoritmo algoritmo = new Algoritmo();
			int companeros = algoritmo.algoritmo(new ArrayList<Actividad>(actividades));
			System.out.println("Número de companeros necesarios: "+companeros);
			System.out.println("###########################################################################");
			System.out.println("Introduzca el numero de actividades o 0 para finalizar:");
			actividades.clear();
		}
	}