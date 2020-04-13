package collection;

import java.util.HashMap;
import java.util.Map;

import topic.SampleBean;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<SampleBean,String> map = new HashMap<>();
		
		SampleBean s1 = new SampleBean("a",1);
		SampleBean s2 = new SampleBean("b",2);
		SampleBean s3 = new SampleBean("c",3);
	
	map.put(s1,"a");
	
	}

}
