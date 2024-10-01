package sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {
	
	public static void RecursiveIS(int[] arr ,int i, int n) {
		if (i == n) return;
		int j = i;
		
		while(j>0 && arr[j-1]>arr[j]) {
			int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
		}
		RecursiveIS(arr, i + 1, n);
	}
	
		public static void main(String[] args) {
		int[] arr = {8,7,6,5,4,3,2,1};
		int n = arr.length;
		RecursiveIS(arr,0,n);
		System.out.println(Arrays.toString(arr));
	}

}
