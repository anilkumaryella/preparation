package topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);

		Spliterator<String> spl = list.spliterator();
		spl.forEachRemaining((n) -> {
			if(n.equals("c")){
				list.remove("c");
			}
			
		});
		
		System.out.println(list);

	}

}
