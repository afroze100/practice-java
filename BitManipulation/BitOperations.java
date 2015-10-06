package BitManipulation;

public class BitOperations {
	
	
	public static boolean getBit(int num, int i) {
		int mask = (num & i << 1);
		return (mask != 0);
	}
	
	
	public static int setBit(int num, int i) {
		int mask = 1 << i;
		return num | mask;
	}
	
	
	public static int clearBit(int num, int i) {
		int mask = ~(1 << i);
		return num & mask;
	}
	
	
	public static int updateBit(int num, int i, boolean v) {
		int mask = clearBit(num, i);
		int x = (v) ? 1 : 0;
		return mask | x << i;
	}
	
	
	public static void main(String args[]) {
		int x = 34;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
		int y = updateBit(x, 1, false);
		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));
	}
	
}
