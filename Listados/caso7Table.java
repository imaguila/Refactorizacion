package Party;

import java.util.ArrayList;

public class Table {

	public  int totalPeople( ArrayList<Integer> group){

		int total = 0;
		for(int i=0;i<group.size();i++){
			total += group.get(i);
		}

		return total;

	}

	public  int getMin( ArrayList<Integer> group){
	   int max = 0;
	        for (int i = 0; i < group.size() - 1; i++) {
	            if (group.get(i) > max) {
	                max = group.get(i);
	            }
	        }
	        int min = max;
	        for (int i = 0; i < group.size() - 1; i++) {
	            if (group.get(i) < min) {
	                min = group.get(i);
	            }
	        }
	        return min;
	}
}