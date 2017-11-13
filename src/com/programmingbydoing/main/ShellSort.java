package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {

	private static final int N = 1000;
	private static final int BOUNDARY = 1000;
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

		// int leap = N / 2 - 1;
		// while (leap >= 1) {
		// int k = leap + 1;
		// while (k < 2 * leap) {
		// int i = k;
		// while (i < N) {
		// int j = i - leap;
		// int temp = array[i];
		// while (j > 0 && array[j] > temp) {
		// array[j + leap] = array[j];
		// j -= leap;
		// }
		// array[j + leap] = temp;
		// i+=leap;
		// }
		// }
		// leap = (leap + 1) / 2 - 1;
		// }

		for (int gap = N / 2; gap > 0; gap /= 2) {
			// The first gap elements a[0..gap-1] are already
			// in gapped order keep adding one more element
			// until the entire array is gap sorted
			for (int i = gap; i < N; i += 1) {
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temp and make a hole at
				// position i
				int temp = array[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
					array[j] = array[j - gap];

				// put temp (the original a[i]) in its correct
				// location
				array[j] = temp;
			}
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
