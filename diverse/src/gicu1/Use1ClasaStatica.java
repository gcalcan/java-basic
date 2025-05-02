package gicu1;

import java.util.Arrays;

public class Use1ClasaStatica {
	
	public static void main(String[] args) {

		int[] arr = {49, 1,2,3,4,5,6,7,8,9,10,11,15,25,42,48,12};
		Arrays.sort(arr);
		for(int val: arr) {
			System.out.print(" " + val);
		}
		
		int index = findIndex(arr, 0); 
		System.out.println("\nindex:" + index);
	}
	
	static int findIndex(int[] array, int val) {
		int baseIndex = 0;
		int index = array.length / 2;
		if (array[index] == val) {
			return index;
		}
		if (index == 0) {
			System.out.println("\nValue " + val + " is not part of array");
			return - 1000;
		}
		
		int[] newArray;
		if (array[index] < val) {
			baseIndex = index;
			newArray = Arrays.copyOfRange(array, index, array.length);
		}else
		{
			newArray = Arrays.copyOf(array, index);
		}
		return baseIndex  + findIndex(newArray, val);
	}
}
