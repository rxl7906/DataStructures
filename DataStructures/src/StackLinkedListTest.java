
public class StackLinkedListTest {
	public static void main(String args[]){
		StackLinkedList sll = new StackLinkedList();
		sll.push(5);
		sll.push(2);
		sll.push(7);
		sll.push(4);
		sll.printStack();
		System.out.println();
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		System.out.println(sll.pop());
		sll.printStack();
	}
}
