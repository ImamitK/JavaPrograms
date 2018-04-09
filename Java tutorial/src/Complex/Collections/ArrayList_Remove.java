package Complex.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList_Remove {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();	
		List<Integer> list = new ArrayList<>();	
		for(int i = -3; i<3; i++) {
			set.add(i);
			list.add(i);
		}
		System.out.println("Set stored "+set);
		System.out.println("List Stored "+list);
		System.out.println();
		for(int j=0; j<3; j++){
			set.remove(j);
			list.remove(j);
		}
		System.out.println("Set after remove method  "+set);
		System.out.println("List after remove method  "+list);
	}
}
 //Output

/*	Set stored [-1, 0, -2, 1, -3, 2]
	List Stored [-3, -2, -1, 0, 1, 2]

	Set after remove method  [-1, -2, -3]
	List after remove method  [-2, 0, 2]
*/