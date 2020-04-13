package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = { "Google", "facebook", "instagram", "facebook", "TikTak", "facebook", "Google", "Google" };

		List<String> l = new ArrayList<String>(Arrays.asList(a));

		System.out.println(l);

		Map<String, Long> map = l.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

		List<Integer> list = l.stream().map(s -> s.hashCode()).collect(Collectors.toList());
		System.out.println("hashcode"+list);
		
		System.out.println(map.toString());

		Comparator<Map.Entry<String, Long>> c = (Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) -> {
			if (o1.getValue() < o2.getValue()) {
				return 1;
			} else if (o1.getValue() > (o2.getValue())) {
				return -1;
			} else {
				return o2.getKey().compareTo(o1.getKey());
			}
		};

		Map.Entry<String, Long> e = map.entrySet().stream().sorted(c).findFirst().get();

		System.out.println(e);

	}

}
