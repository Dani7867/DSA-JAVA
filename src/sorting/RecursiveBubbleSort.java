package sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
	
	public static void RecursiveBS(int[] arr , int n) {
		if (n == 1) return;	
		for(int j  = 0 ; j<=n-2 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		RecursiveBS(arr , n-1);
		
	}
	public static void main(String[] args) {
		int[] arr = {8,7,6,5,4,3,2,1};
		int n = arr.length;
		RecursiveBS(arr ,n);
		
		System.out.println(Arrays.toString(arr));
	}

}

//Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.
