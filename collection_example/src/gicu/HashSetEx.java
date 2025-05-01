package gicu;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		int[] array = { 6, 4, 3, 5, 9, 3, 1, 2 };
		int sum = 5;

		showPairs(array, sum);
	}

	public static void showPairs(int[] array, int sum) {
		int x, y;
		HashSet<Pairs> hs = new HashSet<Pairs>();

		for (int i = 0; i < array.length; i++) {
			x = array[i];
			for (int j = i + 1; j < array.length; j++) {
				y = array[j];
				if (x + y == sum) {
					Pairs p = new Pairs(x, y);
					if (!hs.contains(p)) {
						hs.add(p);
					}

				}
			}
		}

		System.out.println("hs: " + hs);	// => hs: [(3, 2), (4, 1), (3, 2)]

		System.out.println();
		System.out.println("for, Pairs p : hs");
		for (Pairs p : hs) {
			System.out.print(p + " ");		// => (3, 2) (4, 1) (3, 2) 
		}
		
		System.out.println();
		System.out.println("forEach, cu print static");
		hs.forEach(System.out::print);		// => (3, 2)(4, 1)(3, 2)
		
		System.out.println();
		System.out.println("ultimul forEach, cu lambda");
		hs.forEach(p -> System.out.print(p));		// => (3, 2)(4, 1)(3, 2) 
	}
}

class Pairs {
	int x;
	int y;

	Pairs(int _x, int _y) {
		x = _x;
		y = _y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pairs other = (Pairs) obj;
		if (x != other.x && y != other.y)
			return false;
		return true;
	}
	
//	@Override
	public boolean compareTo(Object obj) {
		return this.equals(obj);
	}

	@Override
	public String toString() {
		return ("(" + x + ", " + y + ")");
	}
}