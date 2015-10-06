package DatsStructs;

public class Stack {
	protected Node top;
	
	public void push(int data) {
		Node n = new Node(data);
		n.next = top;
		top = n;
	}
	
	public Integer pop() {
		if (top != null) {
			Integer item = top.data;
			top = top.next;
			return item;
		}
		else return null;
	}
	
	public Integer peek() {
		return top.data;
	}

	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		System.out.println(s.pop());

	}

}
