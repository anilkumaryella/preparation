package topic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class d{
	
}
class CallByValue {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
try {
	Thread.currentThread().join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		for (String s : list) {
			if (s.equals("B")) {
				list.remove("B");
			}
		}
		
		Iterator<String> i = list.iterator();

		while (i.hasNext()) {
			if (i.next().equals("A")) {
				i.remove();
			}
		}

		System.out.println(list);
		CallByValue c = new CallByValue();
		MutableBean bean = new MutableBean("Fis");
		c.changeCompany(bean);
		System.out.println(bean);
	}

	public MutableBean changeCompany(MutableBean b) {
		b.setCompany("Alti");
		return b;
	}

	private static final List<String> NAMES = new ArrayList<String>() {
		{
			add("John");
			System.out.println(NAMES);

		}
	};

}
