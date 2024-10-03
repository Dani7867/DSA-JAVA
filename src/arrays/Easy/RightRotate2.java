package arrays.Easy;

import java.util.Arrays;

public class RightRotate2 {
	  public static void Reverse(int[] arr, int start, int end) {
		    while (start <= end) {
		      int temp = arr[start];
		      arr[start] = arr[end];
		      arr[end] = temp;
		      start++;
		      end--;
		    }
		  }
	  
	  public static void Rotateeletoright(int[] arr, int n, int k) {
		    // Reverse first n-k elements
		    Reverse(arr, 0, n - k - 1);
		    // Reverse last k elements
		    Reverse(arr, n - k, n - 1);
		    // Reverse whole array
		    Reverse(arr, 0, n - 1);
		  }
	  
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		int d = 2;
		Rotateeletoright(arr, n, d);
		System.out.println(Arrays.toString(arr));
	}
}
