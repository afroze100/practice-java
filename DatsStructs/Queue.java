package DatsStructs;

public class Queue {
	protected Node first, last;
	
	public void enqueue(int item) {
		if (first == null) {
			last = new Node(item);
			first = last;
		}
		else {
			last.next = new Node(item);
			last = last.next;
		}
	}
	
	public Integer dequeue() {
		if (first != null) {
			int item = first.data;
			first = first.next;
			if (first == null) last = null;
			return item;
		}
		else {
			return null;
		}
	}
	
	
	public static void main(String args[]) {
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		Queue p = new Queue();
		p = q;
		q.enqueue(4);
		q.enqueue(5);
		
		p.first.printNode();
		p.last.printNode();
		
//		Node first = new Node(1);
//		Node last = new Node(2);
//		
//		first = last;
//		last.next = new Node(3);
//		last = last.next;
//		last.next = new Node(4);
//		last = last.next;
//		
//		first.printNode();
//		last.printNode();
		
	}
}