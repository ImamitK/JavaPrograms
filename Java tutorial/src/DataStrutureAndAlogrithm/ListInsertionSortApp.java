package DataStrutureAndAlogrithm;

class Link1 {
	public Long dData;
	public Link1 next;

	public Link1(Long dData) {
		this.dData = dData;
	}
	
	public void displayLink(){
		System.out.print("{"+dData+"}");
	}
}

class SortedList {
	private Link1 first;

	public SortedList() {
		first = null;
	}

	public SortedList(Link1[] linkArr) {
		first = null;
		for (int i = 0; i < linkArr.length; i++) {
			insert(linkArr[i]);
		}
	}

	public void insert(Link1 newLink) {
		Link1 previous = null;
		Link1 current = first;

		// while because need to save the link at sorted place.
		while (current != null && newLink.dData > current.dData) {
			previous = current;
			current = current.next;
		}

		if (previous == null)
			first = newLink;
		else
			previous.next = newLink;
		newLink.next = current;
	}
	
	public Link1 deleteFirst(){
		Link1 tmp = first;
		first = first.next;
		return tmp;
	}
}

public class ListInsertionSortApp {
	public static void main(String[] args) {

		int size = 10;
		Link1[] linkArr = new Link1[size];

		for (int i = 0; i < size; i++) {
			int n = (int) (Math.random() * 99);
			Link1 newLink = new Link1(new Long(n));
			linkArr[i] = newLink;
		}
		
		for(Link1 tmp : linkArr){
			tmp.displayLink();
		}
		
		System.out.println();
		
		SortedList theSortedList = new SortedList(linkArr);
		
		for (int i = 0; i < size; i++) {
			linkArr[i] = theSortedList.deleteFirst();
		}
		
		System.out.println("Sorted List");
		for(Link1 tmp : linkArr){
			tmp.displayLink();
		}
	}
}
