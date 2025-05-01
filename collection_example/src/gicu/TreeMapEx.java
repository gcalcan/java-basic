package gicu;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("x", "xylophone");
		map.put("l", "leopard");
		map.put("m", "monkey");
		map.put("t", "tiger");
		System.out.print("	" + map.higherKey("m")); 	//line1
		System.out.print("	" + map.ceilingKey("m")); 	//line2
		System.out.print("	" + map.floorKey("m")); 	//line3
		
		SortedMap<String, String> sub = map.tailMap("m");
		System.out.print("	" +	sub.firstKey());		//line4
						
		Stream<String> stringStream = Stream.of("java22", "scala", "ruby", "jee9");
//		var result = stringStream.map(String::length).filter(s -> s <= 5).collect(Collectors.toSet()));
//		stringStream.map(String::length).filter(s -> s <= 5).collect(Collectors.toSet()));
		
//		System.out.print(result);
	}
}
