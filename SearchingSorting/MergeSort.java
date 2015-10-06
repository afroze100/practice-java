package SearchingSorting;

import java.util.Arrays;

public class MergeSort {
	
	
	public static void mergeSort(int[] unsortedArray, int left, int right) {
		if (right > left) {
			int mid = (left + right)/2;
			mergeSort(unsortedArray, left, mid);
			mergeSort(unsortedArray, mid+1, right);
			
			merge(unsortedArray, left, mid, right);
		}
	}
	
	
	public static void merge(int[] unsortedArray, int left, int mid, int right) {
		int[] helper = new int[unsortedArray.length];
		for (int i=left; i<=right; i++) {
			helper[i] = unsortedArray[i];
		}
		
		int l = left;
		int r = mid+1;
		int p = left;
		while(l <= mid && r <= right) {
			if (helper[l] <= helper[r]) {
				unsortedArray[p] = helper[l];
				l++;
				p++;
			}
			else {
				unsortedArray[p] = helper[r];
				r++;
				p++;
			}
		}
		
		while(l <= mid) {
			unsortedArray[p] = helper[l];
			l++;
			p++;
		}
	}
	
	
	public static void mergeSort(int[] unsortedArray) {
		int length = unsortedArray.length;
		mergeSort(unsortedArray, 0, length-1);
	}

	
	public static void main(String[] args) {

		System.out.println("hello world");
		
		int[] unsortedArray = {1,3,13,-1,6,0,10,20,13,-12};
		mergeSort(unsortedArray);
		
		System.out.println(Arrays.toString(unsortedArray));
	}

}
