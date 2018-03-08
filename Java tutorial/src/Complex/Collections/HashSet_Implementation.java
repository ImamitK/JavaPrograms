package Complex.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class HashSet{
	
	Object PRESENT = new Object();
	Map<String,Object> map = new HashMap<>();
	
	public int size(){
		return map.size();
	}
	
	public boolean isEmpty(){
		return map.isEmpty();
	}
	
	public boolean add(String e){
		return map.put(e, PRESENT)==null;
	}
	
	public Iterator<String> iterator() {
        return map.keySet().iterator();
    }
}

public class HashSet_Implementation {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		System.out.println(set.add("Amit"));
		System.out.println(set.add(new String("Amit")));
		System.out.println(set.add("Amol"));
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
	}

}
