package sorting;

import java.util.Arrays;

public class HeapSort {
	
	private static void heapSort(int[] arr, int size) {
		buildHeap(arr, size);
		
		while(size > 0) {
			swap(arr, 0, size);
			size--;
			heapify(arr, 0, size);
		}
	}
	
	private static void buildHeap(int []arr, int size) {
		for(int i=size/2; i>=0; i--) {
			heapify(arr, i, size);
		}
	}
	
	private static void heapify(int[] arr, int index, int size) {
		int left = 2*index + 1;
		int right = left + 1;
		
		int max = index;
		
		if(left<=size && arr[left] > arr[max])
			max = left;
		
		if(right<=size && arr[right] > arr[max])
			max = right;
		
		if(index != max) {
			int temp = arr[max];
			arr[max] = arr[index];
			arr[index] = temp;
			
			heapify(arr, max, size);
		}		
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {10, 30, 20, 50, 60, 40, 80};
		int size = arr.length-1;
		heapSort(arr, size);
		System.out.println(Arrays.toString(arr));
	}

}
