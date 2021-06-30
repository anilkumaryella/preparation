package topic;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import strings.Dog;
import strings.Pet;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		
	List<Pet> list = new ArrayList<>();
	list.add(new Dog());
	System.out.println(list);
	
	/*
	 * List<Dog> list1 = new ArrayList<>(); list1.add(new Pet());
	 */
	//System.out.println(list1);
	
	}
}
