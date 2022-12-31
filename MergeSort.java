package sorting;

import java.util.Arrays;

public class MergeSort {
	
	private static void mergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	
	private static void merge(int[] arr, int start, int mid, int end) {
		
		int temp[] = new int[end-start+1];		
		int i=start, j=mid+1;
		int k=0;
		
		while(i<=mid && j<=end) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;
			} else {
				temp[k] = arr[j];
				j++;
				k++;
			}
		}
		
		// for remaining elements from 1st half
		while(i<=mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}
		
		// for remaining elements from 2nd half
		while(j<=end) {
			temp[k] = arr[j];
			j++;
			k++;
		}
		
		// now copy temp array elements to main array
		k=0;
		for(int p=start; p<=end; p++) {
			arr[p] = temp[k++];
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 20, 45, 30, 25, 10, 28, 40};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
