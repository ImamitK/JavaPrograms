package Complex.Array;

public class Array_Search_Sorted_Rotated {

	public static void main(String[] args) {
		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		int length = arr.length;
		int key = 3;
		
		int i = search(arr, 0, length-1, key);
		if (i != -1) 
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
		
	}

	private static int search(int[] arr, int low, int length, int key) {
		
		if(low > length) return -1;
		
		int mid = (low + length)/2;
		
		if(arr[mid] == key) return mid;
		
		if(arr[low] <= arr[mid]){
			
			if(key >= arr[low] && key <= arr[mid]){
				return search(arr, low, mid-1, key);
			}
			return search(arr, mid+1, length, key);
		}
		
		if(key >= arr[mid] && key <=arr[length]){
			return search(arr, mid+1, length, key);
		}
		return search(arr, low, mid-1, key);
	}

}
