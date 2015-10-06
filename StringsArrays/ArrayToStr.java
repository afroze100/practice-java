package StringsArrays;

public class ArrayToStr {
	
	public static String numArrayToStr (int[] numArray) {
		
		if (numArray.length == 0) {
			return null;
		}
		
		StringBuilder numStr = new StringBuilder();
		
		numStr.append(Integer.toString(numArray[0]));
		for (int i=1; i<numArray.length; i++ ) {
			numStr.append(", " + Integer.toString(numArray[i]));
		}
		
		return numStr.toString();
	}
	
	
	
	public static String gapNumArrayToStr (int[] sortedArray) {
	// numArray between 0-99
	// numArray is sorted with all unique elements
	// return compressed string format of array contents
		
		if (sortedArray.length == 0) {
			return "0-99";
		}
		
		StringBuilder numStr = new StringBuilder();
		
		for (int i=1; i<sortedArray.length; i++) {
			
			int prev = sortedArray[i-1];
			int next = sortedArray[i];
			
			if (i==1) {
				if (prev > 1) {
					numStr.append("0-" + Integer.toString(prev-1));
				}
				else if (prev != 0) {
					numStr.append("0");
				}
			}
			
			if (next - prev == 2) {
				numStr.append("," +  Integer.toString(next-1));
			}
			else if  (next - prev > 2) {
				numStr.append("," +  Integer.toString(prev+1) + "-" + Integer.toString(next-1));
			}
			
			if (i==sortedArray.length-1) {
				if (next < 98) {
					numStr.append("," +  Integer.toString(next+1) + "-99");
				}
				else if (next != 99) {
					numStr.append(",99");
				}
			}
		}
		
		
		
		return numStr.toString();
	}
	
	
	
	public static void main (String[] args) {
		int[] numArray = {0,3,5,9,10,15,60};
		
		String numStr = ArrayToStr.gapNumArrayToStr(numArray);
		//String numStr = ArrayToStr.numArrayToStr(numArray);
		System.out.println(numStr);
		
	}
}
