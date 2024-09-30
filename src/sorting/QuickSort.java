package sorting;

import java.util.Arrays;

//Java program for QuickSort algorithm
public class QuickSort {

 // Function to perform the QuickSort algorithm
 public static void quickSort(int[] array, int low, int high) {
     if (low < high) {
         // Find the partition index
         int pi = partition(array, low, high);
         
         // Recursively sort elements before and after partition
         quickSort(array, low, pi - 1);  // Left of pivot
         quickSort(array, pi + 1, high); // Right of pivot
     }
 }

 // Partition function to place the pivot element at the correct position
 private static int partition(int[] array, int low, int high) {
     int pivot = array[high];  // Pivot element
     int i = (low - 1);  // Index of the smaller element
     
     for (int j = low; j < high; j++) {
         // If current element is smaller than or equal to the pivot
         if (array[j] <= pivot) {
             i++;
             
             // Swap array[i] and array[j]
             int temp = array[i];
             array[i] = array[j];
             array[j] = temp;
         }
     }

     // Swap array[i + 1] and array[high] (or pivot)
     int temp = array[i + 1];
     array[i + 1] = array[high];
     array[high] = temp;

     return i + 1;  // Return the partition index
 }



 // Main method to test QuickSort
 public static void main(String[] args) {
     int[] array = {13, 1, 24, 52, 20, 9};
     int n = array.length;
     
     System.out.println("Original array:");
     System.out.println(Arrays.toString(array));
     
     quickSort(array, 0, n - 1);
     
     System.out.println("Sorted array:");
     System.out.println(Arrays.toString(array));
 }
}

