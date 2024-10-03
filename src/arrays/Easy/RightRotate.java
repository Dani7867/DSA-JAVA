package arrays.Easy;

import java.util.Arrays;

public class RightRotate {

    public static void rightRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d is larger than array size
        
        // Store the last d elements in a temporary array
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[n - d + i];
        }
        
        // Shift the remaining elements to the right
        for (int i = n - 1; i >= d; i--) {
            arr[i] = arr[i - d];
        }
        
        // Move the last d elements from temp to the front
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; // Number of positions to rotate

        rightRotate(arr, d);

        System.out.println(Arrays.toString(arr));
    }
}
