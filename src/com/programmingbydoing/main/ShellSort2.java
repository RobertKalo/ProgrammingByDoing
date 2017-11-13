package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class ShellSort2 {

	private static final int N = 20;
	private static final int BOUNDARY = 20;
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

		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int temp = array[i];
				int j;
				for (j = i; j >= gap && array[j - gap] > temp; j-=gap) {
					array[j] = array[j - gap];
				}
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
