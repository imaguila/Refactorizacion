
package Party;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> group = new ArrayList<Integer>();
		int total, result, min, elem;
		Data myData = new Data();
		Table myTable = new Table();
		Algorit myOper = new Algorit();

		group = myData.readData();
		total = myTable.totalPeople(group);
		min = myTable.getMin(group);
		elem = group.size() - 1;

		result = myOper.distribute(total, min, elem);

		System.out.println(result);

	}

}