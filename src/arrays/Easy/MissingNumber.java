package arrays.Easy;

public class MissingNumber {
    public static int missingNumber(int[] a, int N) {
        int xor1 = 0, xor2 = 0;

        // XOR all array elements
        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); // XOR from 1 to N-1
        }

        // XOR the last number (N) to complete the range from 1 to N
        xor1 = xor1 ^ N;

        // XORing xor1 and xor2 will give the missing number
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] a = {1, 2, 4, 5}; 

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
