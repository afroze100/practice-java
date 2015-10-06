package DatsStructs;

public class KeyValueNode<S,T> {
	protected S key;
	protected T value;
	protected KeyValueNode<S,T> next;
	
	public KeyValueNode() {
		this.key = null;
		this.value = null;
		this.next = null;
	}
	
	public KeyValueNode(S key, T value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public void printNode(){
		System.out.printf("%s -> %d\n", key, value);
	}

}
