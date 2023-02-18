class Node {
	
	int data;
	Node next;
	
	public Node(int x) {
		data = x;
		next = null;
	}
}

public class Traverse {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3 = new Node(40);
		Node tail = new Node(50);
		
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = tail;
		
		//System.out.println(head.data+"-->"+temp1.data+"-->"+temp2.data+"-->"+temp3.data+"-->"+tail.data);
		printList(head);
	
		}
	// Traversing
	public static void printList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
	
	
	

}
