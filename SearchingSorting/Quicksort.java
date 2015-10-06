package SearchingSorting;

public class Quicksort  {
	private int [] arr;

	public void sort(int[] values) {
		arr = values;
		quicksort(0, arr.length-1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = arr[low + (high-low)/2];

		// Divide into two lists
		while (i <= j) {
			// Find the first element in the array that is > the pivot element starting from LOW index
			// So that all the numbers to the left of pivot are smaller than the pivot
			while (arr[i] < pivot) { i++; }
			// Find the first element in the array that is < the pivot element starting from HIGH index
			// So that all the numbers to the right of the pivot are greater than the pivot
			while (arr[j] > pivot) { j--; }

			// If we have found a values in the left list which is larger than
			// the pivot element and if we have found a value in the right list
			// which is smaller than the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}

		// Once the iterators i & j overlap
		// Recursively call quick sort to sort along the pivot through the subarrays
		if (low < j) quicksort(low, j);
		if (i < high) quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main (String [] args) {
		int [] numbers = {6, 5, 1, 3, 2, 9, 8, 4, 7}; 
		Quicksort sorter = new Quicksort();
		sorter.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
