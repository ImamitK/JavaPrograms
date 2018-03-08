package Complex.Array;

import java.util.Arrays;

public class Array_Cyclically_Rotate {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		int last = intArr[intArr.length -1];
		for(int i=intArr.length-1; i>0; i--){
			intArr[i]=intArr[i-1];
		}
		intArr[0]=last;
		System.out.println(Arrays.toString(intArr));
	}
}
