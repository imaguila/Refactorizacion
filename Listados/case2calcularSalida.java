public int calculaSalida(){
		int finNum = numeros.get(numeros.size()-1);
		int finIncr = incrementos.get(incrementos.size()-1);
		int nextIncr = 0;
		int nextNum = 0;

		if(ciclo.size() == 1){
			nextNum = finNum + finIncr;
		}else{
			int befIncr = incrementos.get(incrementos.size()-2);


			boolean match = false;

			int ci1 = ciclo.indexOf(finIncr);
			int ci2 = ciclo.lastIndexOf(finIncr);

			if(ci1 == ci2){
				if(ci2 == ciclo.size()-1){
					ci2 = 0;
				}
				nextIncr = ciclo.get(ci2+1);
				nextNum = finNum + nextIncr;
			}else{
				// 1 1 2
				// b2 f1 Si el anterior es el ultimo entonces
				if(befIncr == ciclo.get(ciclo.size()-1)){
					nextIncr = ciclo.get(ci1+1);
					nextNum = finNum + nextIncr;
				}else{
					nextIncr = ciclo.get(befIncr+1);
					nextNum = finNum + nextIncr;
				}

			}
		}


		return nextNum;
	}
