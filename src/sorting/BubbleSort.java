package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void Bubble_Sort(int array[]) {
		int swapcount = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1]=temp; 
					swapcount ++;
				}
			}
		if(swapcount == 0) {
			break;
		}
		System.out.println("runs");
		}
	}
	
	
	public static void main(String[] args) {
		int[] array =  {13, 46, 24, 52, 20, 9};
		Bubble_Sort(array);
		System.out.println(Arrays.toString(array));
		

	}

}
