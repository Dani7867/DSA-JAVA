package arrays.Easy;

public class SingleNumber {
    public static int findSingle(int[] arr) {
        int result = 0;

        // XOR all elements of the array
        for (int num : arr) {
            result ^= num;  // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 2, 4, 1};
        int singleNumber = findSingle(arr);
        System.out.println("The single number is: " + singleNumber);
    }
}
