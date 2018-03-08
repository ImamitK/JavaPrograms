package Complex.Array;

import java.util.Arrays;

public class Element_Unsorted {
	
	public static void main(String[] args) {
		int[] arr = {2,4,3,56,7,1};
		int min = 3;
		int max = 2;
		Arrays.sort(arr);
		System.out.println(arr[min-1]);
		System.out.println(arr[arr.length - max]);
	}
}
