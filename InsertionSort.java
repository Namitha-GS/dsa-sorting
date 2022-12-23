package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	private static void insertionSort(int[] arr, int size) {
		int value, index;
		for(int i=1; i<size; i++) {
			value = arr[i];
			index = i;
			while(index > 0 && arr[index-1] > value) {
				arr[index] = arr[index-1];
				index--;
			}
			arr[index] = value;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array elements:");
		for(int i=0; i<size; i++) 
			arr[i] = sc.nextInt();
		sc.close();
		insertionSort(arr, size);
		System.out.println(Arrays.toString(arr));
	}

}
