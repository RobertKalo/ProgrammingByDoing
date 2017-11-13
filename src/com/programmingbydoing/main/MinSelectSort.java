package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class MinSelectSort {

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

		for (int j = 0; j < array.length; j++) {
			minIndex=j;
			for (int i = j; i < array.length; i++) {
				if (array[i] < array[minIndex]) {
					minIndex = i;
				}
			}
			if (minIndex!=j) {
				temp = array[j];
				array[j]=array[minIndex];
				array[minIndex]=temp;
			}
		}
		System.out.println("Sorted array:\n"+Arrays.toString(array));

	}


	private static void makeArray() {

		array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUNDARY);
		}

		System.out.println("Original random array: \n" + Arrays.toString(array));
	}

}
