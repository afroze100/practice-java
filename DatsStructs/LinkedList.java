package DatsStructs;

public class LinkedList {
	protected Node begin, end;
	
	public void appendToEnd(int data) {
		if (begin == null) {
			begin = new Node(data);
			end = begin;
		}
		else {
			end.next = new Node(data);
			end = end.next;
		}
	}
	
	public void printList() {
		Node x = begin;
		while(x != null) {
			System.out.println(x.data);
			x = x.next;
		}
	}
	
	
	public static void main(String args[]) {
		LinkedList list1 = new LinkedList();
		list1.appendToEnd(1);
		list1.appendToEnd(2);
		list1.appendToEnd(3);
		
		list1.printList();
		System.out.println("\n");
		list1.printList();
	}

}

