package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class CountingSort2 {
	private static final int N = 100;
	private static final int BOUNDARY = 101;
	private static Random random = new Random();
	private static int[] array;
	private static int max, min;
	private static long start;

	public static void main(String[] args) {

		makeArray();

		start = System.nanoTime();

		maxMin();
		countingSort();
	}

	private static void maxMin() {

		min = array[0];
		max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			} else if (array[i] > max) {
				max = array[i];
			}

		}
	}

	private static void countingSort() {
		int[] counts = new int[max - min + 1]; // this will hold all possible
												// values, from low to high
		for (int x : array)
			counts[x - min]++; // - low so the lowest possible value is always 0

		for (int i = 1; i < counts.length; i++) {
			counts[i] += counts[i - 1];
		}

		int j = 0;
		for (int i = 0; i < max - min + 1; i++)
			while (j < counts[i])
				array[j++] = i + min;

		System.out.println(System.nanoTime() - start + " ns");
		System.out.println("Sorted array:\n" + Arrays.toString(array));
	}

	private static void makeArray() {

		array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUNDARY);
		}

		System.out.println("Original random array:\n" + Arrays.toString(array) + "\n");
	}

}
