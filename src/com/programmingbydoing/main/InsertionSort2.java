package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort2 {

	private static final int N = 11;
	private static final int BOUNDARY = 10;
	private static Random random = new Random();
	private static int[] array;

	public static void main(String[] args) {

		makeArray();
		sortArray();
	}

	private static void sortArray() {

		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				int temp = array[i];
				int j;
				for (j = i-1; j > 0 && array[j - 1] > temp; j--) {
					array[j+1]=array[j];
				}
				array[j]=temp;
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
