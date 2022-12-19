package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	private static void selectionSort(int[] arr, int size) {
		for(int i=0; i < size-1; i++) {
			for(int j=i+1; j < size; j++) {
				if(arr[i] > arr[j])
					swap(arr, i, j);
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {180, 165, 150, 170, 145};
		int size = arr.length;
		selectionSort(arr, size);
		System.out.println(Arrays.toString(arr));
	}

}
