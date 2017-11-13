package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class QuickSort2 {

	private static final int N = 100000;
	private static final int BOUNDARY = 10000;
	private static final Random random = new Random();
	private static int[] array;

	public static void main(String[] args) {

		makeArray();
		sortArray();

	}

	private static void sortArray() {

		if (array == null || array.length == 0) {
			System.out.println("Array size is too small to sort.");
		}
		ThreadedQuick quick1 = new ThreadedQuick(array, 0, array.length - 1);
		quick1.quickSort(0, array.length - 1);
		System.out.println("Sorted array:\n" + Arrays.toString(array));

	}

	private static void makeArray() {

		array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUNDARY);
		}

		System.out.println("Original random array:\n" + Arrays.toString(array));
	}

}
