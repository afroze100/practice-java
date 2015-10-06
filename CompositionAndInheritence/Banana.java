package CompositionAndInheritence;

public class Banana extends Fruit{
	
	void eat() {
		System.out.println("eating banana");
	}
	
//	Banana (String colour, int size) {
//		super(colour, size);
//	}
	
	
	public static void main (String args[]) {
		
		Banana b = new Banana();
		//Banana b = new Banana("yellow", 3);
		b.display();
		b.eat();
	}
	
	

}
