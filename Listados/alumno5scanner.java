//...
Scanner in = new Scanner(System.in);
		String input;
		do {
			System.out.println("Introducir n�mero de casos de prueba (entero positivo mayor a 0)");
			input = in.nextLine();
			try {
				numeroPruebas = Integer.valueOf(input.trim());
			}
			catch(Exception e) {
				throw new RuntimeException("Valor no valido para numero de casos");
			}
        } while(numeroPruebas <= 0);
//...