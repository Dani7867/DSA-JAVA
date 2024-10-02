package arrays.Easy;

public class SecondSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        
        // Edge case: If there are fewer than 2 elements
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Initialize variables for smallest, second smallest, largest, and second largest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int n : arr) {
            // Update smallest and second smallest
            if (n < smallest) {
                secondSmallest = smallest;
                smallest = n;
            } else if (n < secondSmallest && n != smallest) {
                secondSmallest = n;
            }

            // Update largest and second largest
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n != largest) {
                secondLargest = n;
            }
        }

        // Check if we found valid second smallest and second largest elements
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Smallest: " + secondSmallest + " Second Largest: " + secondLargest);
        }
    }
}
