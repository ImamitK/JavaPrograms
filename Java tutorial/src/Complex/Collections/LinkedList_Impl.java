package Complex.Collections;

class Node {
	int data;
	Node next;
}

class LinkedList {

	Node head;

	public void intsert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtFirst(int data) {
		Node node = new Node();
		node.data = data;

		if (head == null) {
			node.next = null;
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void insertAt(int index, int data) {

		if (index == 0) {
			insertAtFirst(data);
		} else {
			Node node = head;
			int i = 1;
			while (index > i) {
				node = node.next;
				i++;
			}
			Node n = new Node();
			n.data = data;
			n.next = node.next;
			node.next = n;
		}
	}
	
	public void deleteAt(int index){
		if(index==0){
			head = head.next;
		}else{
			Node n = head;
			Node n1 = null ;
			for(int i=0; i<index-1; i++){
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("Deleted Value"+n1.data);
		}
	}

	public void show() {
		Node node = head;

		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}

public class LinkedList_Impl {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.intsert(20);
		list.intsert(10);
		list.intsert(40);
		list.intsert(60);
		list.intsert(30);

		list.insertAtFirst(10);

		list.insertAt(0, 100);
		
		list.show();
		
		list.deleteAt(2);

		list.show();

	}

}
