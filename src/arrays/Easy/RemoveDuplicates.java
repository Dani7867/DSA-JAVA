package arrays.Easy;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        // Index to place the next unique element
        int uniqueIndex = 1;

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is different from the previous, it's unique
            if (arr[i] != arr[i - 1]) {
                arr[uniqueIndex] = arr[i]; // Move it to the next position
                uniqueIndex++;
            }
        }

        return uniqueIndex; // New length of array without duplicates
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int newLength = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

