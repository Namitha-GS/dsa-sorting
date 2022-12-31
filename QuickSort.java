package sorting;

import java.util.Arrays;

public class QuickSort {
	
	private static void quickSort(int[] arr, int start, int end) {
		if(start < end) {
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex-1);
			quickSort(arr, pIndex+1, end);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pIndex = start;
		int pivot = arr[end];
		for(int i=start; i<end; i++) {
			if(arr[i] < pivot) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, end, pIndex);
		return pIndex;
	}
	
	private static void swap(int []arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {10, 3, 20, 50, 25};
		quickSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
	}

}
