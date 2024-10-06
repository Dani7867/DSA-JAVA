package arrays.Easy;

public class LongestOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1}; // Example binary array
        int currentCount = 0; // Counter for the current streak of 1s
        int maxCount = 0; // Maximum length of contiguous 1s

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++; // Increment the count for 1s
            } else {
                currentCount = 0; // Reset the count when a 0 is encountered
            }
            // Update the maximum count if currentCount is greater
            maxCount = Math.max(maxCount, currentCount);
        }

        System.out.println("The length of the longest contiguous subarray of 1s is: " + maxCount);
    }
}

