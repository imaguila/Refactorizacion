public int algoritmo(ArrayList<Actividad> actividades) {
		int companeros = 0;
		if(actividades.size() == 1) {
			return companeros;
		}
		for (int i = 0; i < actividades.size(); i++) {
			for (int j = i+1; j < actividades.size(); j++) {
				if(actividades.get(i).getFinalizacion() > actividades.get(j).getComienzo()) {
					companeros++;
				} else {
					i = j;
					break;
				}
				if(j == actividades.size() - 1) return companeros;
			}
		}
		return companeros;
}