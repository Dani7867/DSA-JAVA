package arrays.Easy;

import java.util.Arrays;

public class LeftRotate {

    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d is larger than array size
        
        // Store the first d elements in a temporary array
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
        // Shift the remaining elements to the left
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        
        // Move the d elements from temp to the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; // Number of positions to rotate

        leftRotate(arr, d);

        System.out.println(Arrays.toString(arr));
    }
}
