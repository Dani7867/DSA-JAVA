package arrays.Easy;

public class LongestSubarraySum {
    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int start = 0, end = 0, curr_sum = 0, maxLength = 0;

        while (end < arr.length) {
            // Add the current element to the window's sum
            curr_sum += arr[end];

            // If the sum exceeds k, move the start pointer to reduce the sum
            while (curr_sum > k && start <= end) {
                curr_sum -= arr[start];
                start++;
            }

            // If we find a subarray with sum equal to k, update the maxLength
            if (curr_sum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }

            // Move the end pointer to explore further elements
            end++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;
        System.out.println("Length of the longest subarray: " + longestSubarrayWithSumK(arr, k)); // Output: 2
    }
}
