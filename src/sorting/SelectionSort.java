package sorting;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {13, 46, 24, 52, 20, 9};
		
			for(int i = 0 ; i<array.length - 1 ; i++) {
			int mini = i;
			for(int j = i + 1 ; j<array.length;j++) {
				if(array[j] < array[mini]) {
					mini = j;
				}
			}
			int temp = array[mini];
			array[mini] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
}}