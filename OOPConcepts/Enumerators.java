package OOPConcepts;

enum Car {
	
	lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
	private int price;
   
	Car(int p) {
		price = p;
	}
   
	int getPrice() {
		return price;
	} 
	
	void setPrince(int p) {
		price = p;
	}
}

public class Enumerators {
   
	public static void main(String args[]) {
		
		Car.lamborghini.setPrince(20);
		System.out.println(Car.lamborghini.getPrice());
		
		Car c = Car.audi;
		if (c == Car.audi) System.out.println("yas");

		
//		System.out.println("All car prices:");
//		for (Car c : Car.values()) {
//			System.out.println(c + " costs " + c.getPrice() + " thousand dollars.");
//		}
	}
}