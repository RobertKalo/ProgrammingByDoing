package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	private static final int N = 11;
	private static final int BOUNDARY = 10;
	private static Random random = new Random();
	private static int[] array;

	public static void main(String[] args) {

		makeArray();
		sortArray();
	}

	private static void sortArray() {

		int minIndex;
		int temp;
		int i = 0;

		while (i < N - 1) {
			minIndex = i;

			int j = i + 1;
			while (j < N) {
				if (array[j] < array[minIndex])
					minIndex = j;
				j++;
			}
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			i++;
		}

		System.out.println("Sorted array:\n" + Arrays.toString(array));

	}

	private static void makeArray() {

		array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUNDARY);
		}

		System.out.println("Original random array: \n" + Arrays.toString(array));
	}

}
