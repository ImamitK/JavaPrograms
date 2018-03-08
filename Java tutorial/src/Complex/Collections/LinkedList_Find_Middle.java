package Complex.Collections;

import java.util.Random;

class Node1 {
	int data;
	Node1 next;
}

class LinkedList1 {

	Node1 head;

	public void insert(int data) {
		Node1 node = new Node1();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node1 n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void PrintMiddle() {
		
		Node1 fastNode = head;
		Node1 slowNode = head;
		
		if(head!=null){
			while(fastNode != null && fastNode.next != null){
				fastNode = fastNode.next.next;
				slowNode = slowNode.next;
			}
			System.out.println("middle Element is "+slowNode.data);
		}
	}
	
	public void show(){
		Node1 node = head;
		
		while(node.next != null){
			System.out.print(node.data+" -> ");
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public Node1 find(int data){
		Node1 node = head;
		
		if(head!=null){
			while(node.data != data){
				if(node.next == null){
					return null;
				}else{
					node = node.next;
				}
			}
		}else{
			System.out.println("Empty linked list");
		}
		return node;
	}

}

public class LinkedList_Find_Middle {

	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		int randomValue = 0 ;
		for(int i=0; i<5; i++){
			randomValue = new Random().nextInt(10);
			list.insert(randomValue);
			list.show();
			list.PrintMiddle();
		}
		Node1 node = list.find(randomValue);
		System.out.println("````````````````````"+node.data);
	}

}
