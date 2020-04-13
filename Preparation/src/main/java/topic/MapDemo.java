package topic;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {

		newStringAskey();

		MutableBean demo = new MutableBean();
		demo.setCompany("alt");

		// when Table size is full java hashmap resize it self by create new
		// Table with double the size default or
		// loadfactor* initial size and copy all old values to new Table
		// --Rehashing

		// So the answer is Yes there is potential race condition exists while
		// resizing HashMap in Java, if two thread at the same time found that
		// now HashMap needs resizing and they both try to resizing. on the
		// process of resizing of HashMap in Java, the element in the bucket
		// which is stored in linked list get reversed in order during their
		// migration to new bucket because Java HashMap doesn't append the new
		// element at tail instead it append new element at the head to avoid
		// tail traversing. If race condition happens then you will end up with
		// an infinite loop. Though this point, you can potentially argue that
		// what the hell makes you think to use HashMap in multi-threaded
		// environment to interviewer :)

		//default size 16

		
		Map<Integer, MutableBean> map = new HashMap<>();

		map.put(1, demo);
		// demo.setCompany("fis"); - value will change

		MutableBean demo1 = new MutableBean();
		demo1.setCompany("fis");

		map.put(2, demo1);
		// demo1.setCompany("anil");
		// demo1.setCompany("anl");
		for (Entry<Integer, MutableBean> ee : map.entrySet()) {
			ee.getValue().setCompany("Anil"); // value will change
			;
			/*
			 * System.out.println(ee.getKey());
			 * System.out.println(ee.getValue());
			 */
		}

		for (Entry<Integer, MutableBean> ee : map.entrySet()) {
			System.out.println(ee.getKey());
			System.out.println(ee.getValue());
		}
	}

	public void mapWithKeyObjects() {

		MutableBean demo = new MutableBean();
		demo.setCompany("alt");
		MutableBean demo1 = new MutableBean();
		demo1.setCompany("FIS");

		Map<MutableBean, String> map = new HashMap<>();
		map.put(demo, "alt");
		map.put(demo1, "fis");

		for (Entry<MutableBean,String > ee : map.entrySet()) {
			ee.getKey().setCompany("Anil");
			System.out.println(ee.getKey());
			System.out.println(ee.getValue());
		}
		
		System.out.println(map.get(demo));
		System.out.println(map.get(demo1));

		demo.setCompany("apple");
		System.out.println(map.get(demo));

		demo = demo1;
		System.out.println(map.get(demo));

	}

	public static void newStringAskey(){
	
		Map<MutableBean,String> map = new HashMap();
		MutableBean bean1 = new MutableBean("A");
		MutableBean bean2 = new MutableBean("A");

		map.put(new MutableBean("A"), "1");
		map.put(new MutableBean("A"), "2");
		
		System.out.println(map);
	}
	
	public void hashTable() {
		// synchronised
		Hashtable<Integer, Integer> htable = new Hashtable<>();
		htable.put(4, 2);
		htable.put(5, 12);
		htable.put(6, 112);
		Enumeration<Integer> e = htable.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		for (Entry<Integer, Integer> n : htable.entrySet()) {
			System.out.println(n.getKey() + "," + n.getValue());
		}
	}

}
