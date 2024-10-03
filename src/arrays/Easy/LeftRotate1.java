package arrays.Easy;

import java.util.Arrays;

public class LeftRotate1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Store the first element of the array
        int first = arr[0];
        
        // Shift all elements to the left by one position
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        // Move the first element to the last position
        arr[arr.length - 1] = first;
        
        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }
}
