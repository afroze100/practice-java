package CompositionAndInheritence;

public class Fruit {
	String colour;
	int size;
	
	Fruit() {
		this.colour = "unknown";
		this.size = -1;
	}
	
	Fruit(String colour, int size) {
		this.colour = colour;
		this.size = size;
	}
	
	void display() {
		System.out.printf("colour: %s, size: %d\n", colour, size);
	}
}
