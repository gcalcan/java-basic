package gicu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
//		cars.add(null);
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i) + ", "); // => null, Volvo, BMW, Ford, Mazda,
		}

		System.out.println();
		for (String marca : cars) {
			System.out.print(marca + ", "); // => null, Volvo, BMW, Ford, Mazda,
		}

		Collections.sort(cars);
//	    /* java.lang.NullPointerException: Cannot read field "value" because "anotherString" is null
//			at java.base/java.lang.String.compareTo(String.java:2023)
//			at java.base/java.lang.String.compareTo(String.java:141)
//			at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//			at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)*/
//	    
////		a trebuit sa comentez cars.add(null), ca sa nu mai am exceptia ;

		System.out.println();
		for (String marca : cars) {
			System.out.print(marca + ", "); // => BMW, Ford, Mazda, Volvo
		}

		record Person(int id, String name) {
		}

		List<Person> persons = List.of(new Person(5, "jack"), new Person(7, "john"), new Person(3, "kurt"),
				new Person(1, "arnold"));
		UnaryOperator<Integer> consumer = i -> i > 3 ? ++i : --i;

		System.out.println();
		for (Person person : persons) {
			System.out.print(consumer.apply(person.id()) + " ");
		}
	}
}
