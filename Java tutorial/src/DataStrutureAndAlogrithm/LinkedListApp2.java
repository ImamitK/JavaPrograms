package DataStrutureAndAlogrithm;

class LinkList1 extends LinkList{
	
	public Link find(int key){
		Link current = first;
		while(current.iData != key){
			if(current.next == null){
				return null;
			}else{
				current = current.next;
			}
		}
		return current;
	}
	
	public Link delete(int key){
		Link current = first;
		Link previous = first;
		while(current.iData != key){
			if(current.next == null){
				return null;
			}else{
				previous = current;
				current = current.next;
			}
		}
		if(current == first){
			first = first.next;
		}else{
			previous.next = current.next;
		}
		return current;
	}
	
	public void insertAt(int id, double dd, int index){
		
		if(index == 0){
			insertFirst(id, dd);
		}else{
			Link current = first;
			int i=1;
			while(index > i){
				current = current.next;
				i++;
			}
			Link newList = new Link(id, dd);
			newList.next = current.next;
			current.next = newList;
		}
		
	}
}

public class LinkedListApp2 {

	public static void main(String[] args) {
		LinkList1 theList = new LinkList1();
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
		theList.displayList();
		System.out.println();
		
		Link f = theList.find(44);
		if(f!=null) 
			System.out.println("Found Link is "+f.iData+"  "+f.dData);
		else 
			System.out.println("Link is not found");
		
		Link d = theList.delete(66);
		if(d!=null)
			System.out.println("Deleted List is "+d.iData+"  "+d.dData);
		else
			System.out.println("can't delete link");
		
		theList.displayList();
		System.out.println();
		theList.insertAt(66, 6.99, 1);
		
		theList.displayList();
		
		
	}

}
