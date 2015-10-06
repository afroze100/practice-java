package DatsStructs;

public class Node {
	protected Node next = null;
	protected Integer data;
	
	public Node() {
		this.data = null;
	}
	
	public Node(int data) {
		this.data = data;
	}
	
	public void printNode() {
		System.out.println(this.data);
	}
}
