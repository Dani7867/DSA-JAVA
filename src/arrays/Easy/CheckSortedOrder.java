package arrays.Easy;

public class CheckSortedOrder {

    public static String checkSortedOrder(int[] arr) {
        if (arr.length < 2) {
            return "Array is too small to determine sorting order.";
        }

        boolean isNonDecreasing = true; // Ascending or equal
        boolean isNonIncreasing = true; // Descending or equal

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isNonDecreasing = false;
            }
            if (arr[i] < arr[i + 1]) {
                isNonIncreasing = false;
            }
        }

        if (isNonDecreasing) {
            return "Array is sorted in non-decreasing order.";
        } else if (isNonIncreasing) {
            return "Array is sorted in non-increasing order.";
        } else {
            return "Array is not sorted.";
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; // Non-decreasing
        int[] arr2 = {5, 4, 3, 2, 1}; // Non-increasing
        int[] arr3 = {1, 3, 2, 4};    // Not sorted

        System.out.println(checkSortedOrder(arr1));
        System.out.println(checkSortedOrder(arr2));
        System.out.println(checkSortedOrder(arr3));
    }
}
