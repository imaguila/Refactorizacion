package org;
import java.util.*;

public class Pueblo {

	List<Tramo> tramos;
	private int nMesas;
	private int nTramos;
	
	public Pueblo() {
		this.tramos = new ArrayList<Tramo>();
	}
	
	public Pueblo(List<Tramo> tramos) throws Exception {
		this.tramos = tramos;
		setnTramos(tramos.size());
	}
	
	public int getnMesas() {
		return nMesas;
	}
	
	public void setnMesas(int nMesas) {
		this.nMesas = nMesas;
	}
	
	public int getnTramos() {
		return nTramos;
	}
	
	public void setnTramos(int nTramos) {
		this.nTramos = nTramos;
	}
	
	public void addTramo(Tramo tramo) {
		this.tramos.add(tramo);
		setnTramos(nTramos + 1);
	}
	
	private int MCD (int num1, int num2) {
        int resto;
        int numDiv1 = num1;
        int numDiv2 = num2;
        
        try {
            do {            
                resto = numDiv1 % numDiv2;
                numDiv1 = numDiv2;
                if (resto != 0)
                    numDiv2 = resto;            
            } while (resto != 0);
            
            return numDiv2;
        } catch (Exception e) {
            return 0;
        }
    }
	
	private int MCD() {
		
		int mcdFinal = 1;
		List<Integer> mcd = new ArrayList<Integer>();
		int actualMcd = 0;
		boolean flag = true;
		
		for(int i = 0; i < this.tramos.size(); i++) {
			
			if (i < this.tramos.size() - 1)
				actualMcd = MCD(this.tramos.get(i).getnPersonas(), this.tramos.get(i + 1).getnPersonas());
			else
				actualMcd = MCD(this.tramos.get(i).getnPersonas(), this.tramos.get(0).getnPersonas());
			
			for(int j = 0; j < this.tramos.size(); j++) {
				
				if (this.tramos.get(j).getnPersonas() % actualMcd != 0)
					flag = false;
				
			}
			
			if (!mcd.contains(actualMcd) && flag == true)
				mcd.add(actualMcd);
			
		}
		
		for (int k = 0; k < mcd.size(); k++) {
			mcdFinal = mcdFinal * mcd.get(k);
		}
		
		return mcdFinal;
		
	}
	
	private int totalPersonas() {
		
		int nTotalPersonas = 0;
		
		for (int i = 0; i < this.tramos.size(); i++)
			nTotalPersonas += this.tramos.get(i).getnPersonas();
		
		return nTotalPersonas;
		
	}
	
	// Sumo valores y hago MCD. Divido total valores entre MCD.
	
	public void calcularNumeroMesas() {
		setnMesas(totalPersonas() / MCD());
	}

}