package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	private static final int N = 11;
	private static final int BOUNDARY = 10;
	private static Random random = new Random();
	private static int[] array;

	public static void main(String[] args) {

		makeArray();
		sortArray();
	}

	private static void sortArray() {

		int i = 1;
		while (i < N) {
			if (array[i] < array[i - 1]) {
				int temp = array[i];
				int j = i;
				do {
					j--;
					array[j + 1] = array[j];
				} while (j > 0 && array[j - 1] > temp);
				array[j] = temp;
				System.out.println(Arrays.toString(array));
			}
			i++;
		}

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
