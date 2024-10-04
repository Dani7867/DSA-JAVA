package arrays.Easy;

import java.util.Arrays;
//  task is to move all the zeros in the array to the end of the array and 
//  move non-negative integers to the front by maintaining their order.
import java.util.Arrays;

public class ZeroMover {

    // Method to move all zeros in the array to the end while keeping the order of non-zero elements
    public static int[] moveZerosToEnd(int[] arr, int n) {
        // Initialize j to store the first occurrence of zero
        int firstZeroIndex = -1;
        
        // Find the first occurrence of zero in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                firstZeroIndex = i;
                break;
            }
        }

        // If there are no zeros, return the original array
        if (firstZeroIndex == -1) return arr;

        // Move non-zero elements to the left by swapping them with the first zero
        for (int i = firstZeroIndex + 1; i < n; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the zero at firstZeroIndex
                int temp = arr[i];
                arr[i] = arr[firstZeroIndex];
                arr[firstZeroIndex] = temp;
                firstZeroIndex++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Example array with zeros
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        
        // Get the length of the array
        int n = arr.length;

        // Move zeros to the end
        int[] result = moveZerosToEnd(arr, n);

        // Print the modified array
        System.out.println(Arrays.toString(result));
    }
}
