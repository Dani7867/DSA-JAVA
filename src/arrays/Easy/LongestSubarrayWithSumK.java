package arrays.Easy;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int[] arr, int K) {
        // Map to store (prefixSum, index)
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the running sum
            currentSum += arr[i];

            // Check if the current sum equals K
            if (currentSum == K) {
                maxLength = i + 1;  // Full subarray from 0 to i
            }

            // Check if there exists a prefix sum that we can subtract to get sum K
            if (prefixSumMap.containsKey(currentSum - K)) {
                int previousIndex = prefixSumMap.get(currentSum - K);
                maxLength = Math.max(maxLength, i - previousIndex);
            }

            // Store the current prefix sum in the map if it doesn't already exist
            // We want the earliest occurrence of a prefix sum
            if (!prefixSumMap.containsKey(currentSum)) {
                prefixSumMap.put(currentSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int K = 3;
        System.out.println("Length of longest subarray with sum " + K + ": " + longestSubarrayWithSumK(arr, K));

        int[] arr2 = {-2, -1, 2, 1};
        int K2 = 1;
        System.out.println("Length of longest subarray with sum " + K2 + ": " + longestSubarrayWithSumK(arr2, K2));
    }
}
