package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList();
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("d");

		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			i.next();
			list.add("");
		}
	}

}
