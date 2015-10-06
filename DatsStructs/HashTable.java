package DatsStructs;

public class HashTable<S,T> {
	int size;
	KeyValueNode<S,T>[] hTable;
	
	public HashTable(int size){
		this.size = size;
		hTable = new KeyValueNode [size];
	}
	
	
	public void put(S key, T val) {
		int hash = calcHash(key);
				
		if (hTable[hash] == null) {
			hTable[hash] = new KeyValueNode(key, val);
		}
		else {
			while(hTable[hash].next != null) {
				hTable[hash] = hTable[hash].next;
			}
			hTable[hash].next = new KeyValueNode(key, val);
		}
	}
	
	
	public T get(S key) {
		int hash = calcHash(key);
		
		if (hTable[hash] != null) {
			if (hTable[hash].key == key) return hTable[hash].value;
			
			KeyValueNode<S, T> n = hTable[hash];
			while(n.next != null) {
				n = n.next;
				if (n.key == key) return n.value;
			}
			return null;
		}
		return null;
		
	}
	
	
	public int calcHash(S k) {
		String key = (String) k;
		char[] charKey = key.toCharArray();
		int hash = 0;
		for (int i=0; i<charKey.length; i++){
			hash += charKey[i];
		}
		hash = hash % size;
		return hash;
	}
	
	
	public static void main(String args[]) {
		
		HashTable<String,Integer> h = new HashTable<String,Integer>(1000);
		h.put("afroze", 100);
		h.put("afroze", 25);
		h.put("jessica", 18);
		
		System.out.println(h.get("jessica"));
		System.out.println(h.get("afroze"));
		System.out.println(h.get("aforze"));
		System.out.println(h.get("afroze"));
		
	}

}
