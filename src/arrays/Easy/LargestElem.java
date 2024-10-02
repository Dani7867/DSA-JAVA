package arrays.Easy;
// Problem Statement: Given an array, we have to find the largest element in the array.
public class LargestElem {

	public static void main(String[] args) {
		int[] arr = {8,9,9,10,11,10,5,7,9};
		int max = 0 ;
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
