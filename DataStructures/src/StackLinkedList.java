/*
 * Implement Stack using Singly Linked List
 * (rotate linkedlist 90 degrees clockwise and the list 
 * will look like a stack)
 */
class Node {
	public int val;
	public Node next;
	public Node(int val){
		this.val=val;
	}
	public void printNode(){
		System.out.print(val+" ");
	}
}

class LinkedListEmptyException extends RuntimeException{
	public LinkedListEmptyException(){
		super();
	}
	public LinkedListEmptyException(String msg){
		super(msg);
	}
}

class LinkedList{
	public Node head;
	public LinkedList(){
		head = null;
	}
	// inserting to front is pushing to stack
	public void insertFront(int val){
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}
	// deleting front is popping from stack
	public Node removeFront(){
		if(head==null){
			throw new LinkedListEmptyException("Linked List is empty.");
		}
		Node tmp = head;
		head = head.next;
		return tmp;
	}
	
	// print linked list
	public void printList(){
		while(head!=null){
			head.printNode();
			head = head.next;
		}
	}
}

public class StackLinkedList{
	public static void main(String args[]){
		
	}
}