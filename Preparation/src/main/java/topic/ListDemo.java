package topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

	String[] str = new String[] { "a", "b", "c", "d", "e", "f" };
	List<String> list = new ArrayList<>(Arrays.asList(str));

	public boolean containskey(String s) {
		return list.contains(s);
	}

	public static void main(String[] args) {
		
		/*List<ParentBean> plist = new ArrayList<>();
		List<ChildBean> clist = new ArrayList<>();

		ParentBean p = new ParentBean();
		ChildBean c = new ChildBean();
		p.setAge("12");
		p.setName("anil");
		
		c.setDesignation("engg");
		c.setCompany("alti");
		
		
		//ChildBean cb = (ChildBean) p;
		ParentBean pb = c;
		
		
	//	System.out.println(cb);
		System.out.println(pb);
		
		plist.addAll(clist);
		
		
		System.out.println(clist);
		
	//	"Hackerearth".chars().distinct().peek(ch -> System.out.print(ch)).sorted();

		
	

		// 4 . stream filter java 8
		List<MutableBean> list = new ArrayList<>();
		list.stream().filter(d -> d.getCompany().equals("alti")).map(d -> d.getCompany() + "anil")
				.collect(Collectors.toList());

		Integer[] a = new Integer[] { 1, 2, 3 };
		List<Integer> list1 = Arrays.asList(a);
		list1.stream().map(aa -> aa + 1);

		list1.contains(1);

		String sArray[] = new String[] { "A", "B", "C" };

		// 5. clone method
		// List<String> list = Arrays.asList(sArray);

*/
		List<Integer> ilist = new ArrayList<>();
		ilist.add(1);
		ilist.add(2);
		ilist.add(3);
		ilist.add(4);
		ilist.add(5);
		ilist.add(6);
	/*	int r=3;
		ilist.remove(r);
*/
		
		for (Integer inte : ilist) {
			System.out.println(inte);
		}
		Iterator<Integer> iterator = ilist.iterator();
		

		while (iterator.hasNext()) {
			if (3 == iterator.next())
				iterator.remove();
		}

		System.out.println(ilist);
	}

}
