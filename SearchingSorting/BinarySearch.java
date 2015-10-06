package SearchingSorting;

public class BinarySearch {
    
    public static int search(int key, int [] arr, int lo, int hi) {
        // possible key indices in [lo, hi)
        if (hi < lo) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < arr[mid]) return search(key, arr, lo, mid-1);
        else if (key > arr[mid]) return search(key, arr, mid+1, hi);
        else return mid;
    }


    // whitelist, exception filter
    public static void main(String[] args) {
        int [] arr = {1, 3, 3};
        
        System.out.println("Index: " + search(1, arr, 0, arr.length));
    }
}