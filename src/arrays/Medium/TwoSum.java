package arrays.Medium;

import java.util.HashSet;

public class TwoSum {
    
    // Function to check if a pair exists with the given sum
    public static boolean hasPairWithSum(int[] arr, int targetSum) {
        // Create a HashSet to store the elements we've seen so far
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        // Iterate through the array
        for (int num : arr) {
            // Check if the complement (targetSum - num) exists in the set
            int complement = targetSum - num;
            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true; // A pair is found
            }
            // Add the current number to the set
            seenNumbers.add(num);
        }
        // No pair with the given sum found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int targetSum = 17;
        
        if (hasPairWithSum(arr, targetSum)) {
            System.out.println("Pair exists with the given sum.");
        } else {
            System.out.println("No pair exists with the given sum.");
        }
    }
}

