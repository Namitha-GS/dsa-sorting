package sorting;

import java.util.*;

public class BubbleSort {
	
	private static void bubbleSort(int[] arr, int size) {
		for(int i=0; i < size-1; i++) {
			for(int j=0; j < size-1-i; j++) {
				if(arr[j] > arr[j+1])
					swap(arr, j, j+1);
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		bubbleSort(arr, size);
		System.out.println(Arrays.toString(arr));
	}

}
