package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	private static final int N = 40;
	private static final int BOUNDARY = 20;
	private int searchFor;
	private int[] array;
	private Random random = new Random();

	public static void main(String[] args) {

		BinarySearch bSearch = new BinarySearch();
		bSearch.searchFor = bSearch.random.nextInt(BOUNDARY);
		System.out.println("Searching for number " + bSearch.searchFor + "\n");
		bSearch.makeArray();
		bSearch.sortArray();
		int result = bSearch.doSearch();

		System.out.println((result == -1) ? "\nThe number is not in the array" : "\nThe index is: " + result);

	}

	private int doSearch() {

		System.out.println("\nSearching...");
		int low = 0;
		int high = N - 1;
		int mid = -1;
		int midVal;

		while (low <= high) {
			mid = (low + high) >>> 1;
			midVal = array[mid];

			if (midVal < searchFor)
				low = mid + 1;
			else if (midVal > searchFor)
				high = mid - 1;
			else {
				return mid;
			}
		}
		return -1;

	}

	private void sortArray() {

		System.out.println("\nSorting...");
		boolean swapped = false;
		int j = 0;
		int temp;

		do {
			int i = 1;
			while (i < N - j) {
				if (array[i - 1] > array[i]) {
					temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					swapped = true;
				}
				i++;
			}
			j++;
		} while (j < N && swapped);

		System.out.println("Sorted: " + Arrays.toString(array));
	}

	private void makeArray() {

		System.out.println("Making test array...");
		array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUNDARY);
		}

		System.out.println("Original: " + Arrays.toString(array));

	}

}
