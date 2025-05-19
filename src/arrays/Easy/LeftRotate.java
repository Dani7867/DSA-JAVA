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

// public class Main {
//   public static void swap(int[] arr, int a, int b, int k) {
//     for (int i = 0; i < k; i++) {
//       int temp = arr[a + i];
//       arr[a + i] = arr[b + i];
//       arr[b + i] = temp;
//     }
//   }
//   public static void BlockSwap(int[] arr, int i, int k, int n) {
//     if (k == 0 || k == n)
//       return;
//     // If first part and second part are of same size
//     if (k == n - k) {
//       swap(arr, i, n - k + i, k);
//       return;
//     }
//     // If first part of array is of smaller size
//     else if (k < n - k) {
//       swap(arr, i, n - k + i, k);
//       BlockSwap(arr, i, k, n - k); // second part of array is taken now
//     }
//     // If second part of array is of smaller size
//     else {
//       swap(arr, i, k, n - k);
//       BlockSwap(arr, n - k + i, 2 * k - n, k);
//     }
//   }
//   public static void main(String args[]) {
//     int[] arr = {1,2,3,4,5,6,7};
//     int n = 7;
//     int k = 2;
//     BlockSwap(arr, 0, k, n);
//     System.out.println("After Rotating the array ");
//     for (int i = 0; i < n; i++)
//       System.out.print(arr[i] + " ");
//   }
// }
