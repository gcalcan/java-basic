// https://beginnersbook.com/2014/07/java-hashmap-iterator-example/

package gicu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteratorEx {

	public static void main(String[] args) {
		// Creating a HashMap of int keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		// Adding Key and Value pairs to HashMap
		hashmap.put(null, "valoarea pt null key"); // pot avea 'null" key
		hashmap.put(11, "prima valoare");
		hashmap.put(11, "Value1"); // aici modifica valoarea de mai sus
		hashmap.put(22, "Value2");
		hashmap.put(33, "Value3");
		hashmap.put(44, "Value4");
		hashmap.put(55, "Value5");
		System.out.println("size: " + hashmap.size()); // => size: 6, cu sau fara hashmap.put(11, "prima valoare");

		// Getting a Set of Key-value pairs
//		Set entrySet = hashmap.entrySet();	// asa am un worning: Set is a raw type. References to generic type Set<E> should be parameterized
		Set<Entry<Integer, String>> entrySet = hashmap.entrySet();
		/*
		 * Set<Entry<Integer, String>> java.util.HashMap.entrySet() Returns a Set view
		 * of the mappings contained in this map. The set is backed by the map, so
		 * changes to the map are reflected in the set, and vice-versa. If the map is
		 * modified while an iteration over the set is in progress (except through the
		 * iterator's own remove operation, or through the setValue operation on a map
		 * entry returned by the iterator) the results of the iteration are undefined.
		 * The set supports element removal, which removes the corresponding mapping
		 * from the map, via the Iterator.remove, Set.remove, removeAll, retainAll and
		 * clear operations. It does not support the add or addAll operations.
		 */

		// Obtaining an iterator for the entry set
//		Iterator it = entrySet.iterator();	// asa am un worning: Iterator is a raw type. References to generic type Iterator<E> should be parameterized
		Iterator<Entry<Integer, String>> it = entrySet.iterator();
		
		// Iterate through HashMap entries(Key-Value pairs)
		System.out.println();
		System.out.println("HashMap Key-Value Pairs : ");
		while (it.hasNext()) {
//	    	Map.Entry me = (Map.Entry)it.next();
			Map.Entry<Integer, String> me = (Map.Entry<Integer, String>) it.next();
			System.out.println("Key is: " + me.getKey() + " & " + " value is: " + me.getValue());
		}

		/*
		 * iesirea este: HashMap Key-Value Pairs : Key is: null & value is: valoarea pt
		 * null key Key is: 33 & value is: Value3 Key is: 22 & value is: Value2 Key is:
		 * 55 & value is: Value5 Key is: 11 & value is: Value1 Key is: 44 & value is:
		 * Value4
		 */

		for (Map.Entry<Integer, String> m : hashmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		/*
		 * iesirea este: null valoarea pt null key 33 Value3 22 Value2 55 Value5 11
		 * Value1 44 Value4
		 */

//	    Collections.sort((List<String>) hashmap);
		/*
		 * chiar daca compileaza, la executie da exceptia: Exception in thread "main"
		 * java.lang.ClassCastException: class java.util.HashMap cannot be cast to class
		 * java.util.List (java.util.HashMap and java.util.List are in module java.base
		 * of loader 'bootstrap') at
		 * gicu.HashMapIteratorExample.main(HashMapIteratorExample.java:70)
		 */

//	    asa nu merge: Type mismatch: cannot convert from element type Object to Map.Entry<Integer,String>
//	    for (Map.Entry<Integer, String> me: entrySet) {
//	    	
//	    }
	}

}
