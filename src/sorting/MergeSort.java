package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
	
	public static void Merge(int array[], int low,int mid , int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		
		while(left <= mid && right <= high) {
			if(array[left]<=array[right]) {
				temp.add(array[left]);
				left++;
			}else {
                temp.add(array[right]);
                right++;
            }
		}
		
		while(left<=mid) {
			temp.add(array[left]);
			left++;
		}
		
		while(right<=high) {
			temp.add(array[right]);
			right++;
		}
		
		for (int i = low; i <= high; i++) {
            array[i] = temp.get(i - low);
        }
	}
	
  public static void Merges(int array[],int low,int high) 
    {
    	if(low>=high) return;
    	int mid = (low+high)/2;
    	Merges(array,low,mid);
    	Merges(array,mid+1,high);
    	Merge(array,low,mid,high);
    }
    	
    
	public static void main(String[] args) {
		int array[]={4,2,1,6,7};
		int low = 0;
		int high = array.length - 1;
		Merges(array,low,high);
		System.out.println(Arrays.toString(array));
	}

}
