package Party;

public class Algorit {

	public int distribute(int total, int min, int elem){
		int div = 0;
		int aux = 0;
		if (elem == 1){
			aux = 1;
			return aux;
		}else{
			for (int i = 1; i < total; i++){
				div = total % i;

					if (div == 0 && i >= min){
						aux = i;
						i = 0;
						return aux;
					}else{}

			}

			if (aux == 0){
				for (int x = elem; x < total; x++){
					div = total % x;

						if (div == 0){
							aux = x;
							x = 0;
							return aux;
						}else{}

				}

			}else{

			}

			return aux;
		}
	}

}