package gicu;

import java.util.*;

class TreeMap1 {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		map.put(102, "Gicu");

		System.out.println("Before invoking remove() method");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		/*  Before invoking remove() method
			100 Amit
			101 Vijay
			102 Gicu
			103 Rahul
		 * */
		
		map.remove(102);
		System.out.println("After invoking remove() method");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		/*  After invoking remove() method
			100 Amit
			101 Vijay
			103 Rahul
		 * */
	}
}