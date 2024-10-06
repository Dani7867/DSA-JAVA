package arrays.Easy;

import java.util.HashSet;
import java.util.Arrays;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 5, 3};

        // Find the union of the two arrays
        int[] unionArray = findUnion(a1, a2);

        // Print the result
        System.out.println("Union of a1 and a2: " + Arrays.toString(unionArray));
    }

    public static int[] findUnion(int[] a1, int[] a2) {
        // Use HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add elements of a1 to the set
        for (int num : a1) {
            set.add(num);
        }

        // Add elements of a2 to the set
        for (int num : a2) {
            set.add(num);
        }

        // Convert the set to an array and return
        int[] unionArray = new int[set.size()];
        int i = 0;
        for (int num : set) {
            unionArray[i++] = num;
        }

        return unionArray;
    }
}

