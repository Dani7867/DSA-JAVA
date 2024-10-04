package arrays.Easy;

public class LinearSearch {

    // Method to perform linear search on an array
    public static void linearSearch(int[] arr, int searchElement) {
        // Initialize index counter
        int index = 0;

        // Iterate through the array using enhanced for loop
        for (int element : arr) {
            if (element == searchElement) {
                System.out.println(searchElement + " found at index " + index);
                return; // Exit the method once the element is found
            }
            index++;
        }

        // If element is not found
        System.out.println(searchElement + " is not present in the array.");
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {5, 4, 3, 2, 1};
        int searchElement = 5;

        // Call linear search method
        linearSearch(arr, searchElement);
    }
}

