package javaPack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionBasics {

	public static void main(String[] args) {

		// Collections
		// group of objects
		// Size is not fixed
		CollectionBasics obj1 = new CollectionBasics();
		CollectionBasics obj2 = new CollectionBasics();
		CollectionBasics obj3 = new CollectionBasics();
		CollectionBasics obj4 = new CollectionBasics();

		List<CollectionBasics> colBasicObjs = new ArrayList<CollectionBasics>();
		colBasicObjs.add(obj1);
		colBasicObjs.add(obj2);
		colBasicObjs.add(obj3);
		colBasicObjs.add(obj4);

		System.out.println("No. of objects " + colBasicObjs.size());

		// majorly 2 - list and set
		// List
		// allows duplicate and maintain orders
		List<Integer> intObjs = new ArrayList<Integer>();
		intObjs.add(10);
		intObjs.add(10);
		intObjs.add(20);
		System.out.println(intObjs);

		// Set
		// won't allows duplicate and won't maintain orders
		Set<Integer> intObjs2 = new HashSet<Integer>();
		intObjs2.add(10);
		intObjs2.add(10);
		intObjs2.add(20);
		System.out.println(intObjs2);
	}

}
