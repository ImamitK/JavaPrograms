package Complex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList_Implementation {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Amit");
		
		list.add(0,"kaushik");
		list.add(2,"kaushik");
		list.add(3,"kaushik");
		list.add("Amit");
		list.add(5,"Amit");
		Collection<String> o =null;
		list.addAll(o);
	}

}
