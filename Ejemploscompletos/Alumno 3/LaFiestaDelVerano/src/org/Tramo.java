package org;

public class Tramo {

	private int nPersonas;
	
	public Tramo(int nPersonas) throws Exception {
		if (nPersonas < Math.pow(10, 18) || nPersonas > 0)
			this.nPersonas = nPersonas;
		else
			throw new Exception("Superado número de personas en el pueblo");
	}
	
	public int getnPersonas() {
		return nPersonas;
	}
	
	public void setnPersonas(int nPersonas) {
		this.nPersonas = nPersonas;
	}

}