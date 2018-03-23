package DataStrutureAndAlogrithm;

class Link{
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}
	
	public void displayLink(){
		System.out.print("{"+iData+", "+dData+"}");
	}
}

class LinkList{
	
	public Link first;

	public LinkList() {
		this.first = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void insertFirst(int id, double dd){
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst(){
		Link tmp = first;
		first = first.next;
		return tmp;
	}
	
	public void displayList(){
		Link current  = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}
}

public class LinkedListApp {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
		theList.displayList();
		System.out.println();
		
		while(!theList.isEmpty()){
			Link aLink= theList.deleteFirst();
			System.out.print("Deleted");
			aLink.displayLink();
			System.out.println();
		}
		
		theList.displayList();
	}

}
