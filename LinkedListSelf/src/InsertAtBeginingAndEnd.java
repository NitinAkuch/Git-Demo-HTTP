		
	public class InsertAtBeginingAndEnd {
		
		private static Node insertAtBegining(Node head, int i) {
			Node temp = new Node(i);
			temp.next = head;			
			return temp;
		}
		
		private static Node insertAtEnd(Node tail, int i) {
			Node temp = new Node(i);
			tail.next = temp;
			return null;
		}

		private static void printList(Node head) {
			Node curr = head;
			while (curr!=null) {
				System.out.println(curr.data+" ");
				curr=curr.next;
			}
		}
		
	public static void main(String[] args) {
		
		Node head = new Node(50);
		Node temp1 = new Node(40);
		Node temp2 = new Node(30);
		Node tail = new Node(20);
		head.next = temp1;
		temp1.next = temp2;
		temp2.next = tail; 
		//System.out.println(head.data+" "+temp1.data+" "+temp2.data);		
		head = insertAtBegining(head, 60);
		printList(head);
		System.out.println("60 inserted at begining");
		System.out.println("============");
		tail = insertAtEnd(tail, 10);
		printList(head);
		System.out.println("10 inserted at end.");

	}

	
		
	}




