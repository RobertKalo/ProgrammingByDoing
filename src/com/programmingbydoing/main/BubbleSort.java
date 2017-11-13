package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	private int N = 5;
	private int BOUNDARY = 5;
	private int[] array;
	private Random random = new Random();

	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.makeArray();
		bubbleSort.sortArray();

	}

	private void sortArray() {

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

		array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUNDARY);
		}

		System.out.println("Original: " + Arrays.toString(array));

	}

}
