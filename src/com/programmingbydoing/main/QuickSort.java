package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	private static final int N = 1000;
	private static final int BOUNDARY = 10;
	private static Random random = new Random();
	private static int[] array;

	public static void main(String[] args) {

		makeArray();
		sortArray();
	}

	private static void sortArray() {

		if (array == null || array.length == 0) {
			System.out.println("Array size is too small to sort.");
			return;
		}

		quickSort(0, array.length - 1);

		System.out.println("Sorted array:\n" + Arrays.toString(array));

	}

	private static void quickSort(int low, int high) {

		System.out.println("\nSorting ...");
		int i = low;
		int j = high;
		int pivot = array[low + (high - low) / 2];
		System.out.println("\nPivot: " + pivot);

		while (i <= j) {

			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}

		System.out.println(Arrays.toString(array));

		if (low < j) {
			quickSort(low, j);
		}
		if (high > i) {
			quickSort(i, high);
		}

	}

	private static void makeArray() {

		array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUNDARY);
		}

		System.out.println("Original random array:\n" + Arrays.toString(array));
	}

}
