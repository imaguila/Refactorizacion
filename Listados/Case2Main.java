public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directorioEntrada = System.getProperty("user.dir") + File.separator +
			    "src" + File.separator +
			    "org" + File.separator +
			    "pis2" + File.separator +
			    "serie" + File.separator;


		ArrayList<Entrada> entradas = new ArrayList<Entrada>();//entradas
		ArrayList<Integer> soluciones = new ArrayList<Integer>();//soluciones a las entradas

		Lector lect = new Lector();
		Salida sal = null;
		entradas = lect.cargarArchivo(directorioEntrada + "EntradaPrueba");

		for(int i = 0;i < entradas.size()-1;i++){
			sal = new Salida(entradas.get(i));
			sal.calculaCiclo();
			soluciones.add(sal.calculaSalida());
		}
	}
}
