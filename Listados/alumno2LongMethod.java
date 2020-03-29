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