package com.programmingbydoing.main;

import java.util.Random;

public class CountingSort {

	private static final int N = 1000;
	private static final int BOUNDARY = 1000;
	private static Random random = new Random();
	private static int[] array;
	private static long start;

	public static void main(String[] args) {

		makeArray();
		start=System.nanoTime();
		sortArray();
	}

	private static void sortArray() {

		int[] util = new int[N];
		for (int i = 0; i < util.length; i++) {
			util[i] = 0;
		}

		/* Ez itt nem az igazi, szóval ez nem egy klasszikus counting sort*/
		for (int i = 0; i < util.length - 1; i++) {
			for (int j = i + 1; j < util.length; j++) {
				if (array[i] > array[j]) {
					util[i] += 1;
				} else {
					util[j] += 1;
				}
			}
		}
		
		
		int[] resultArray = new int[N];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[util[i]] = array[i];
		}

		System.out.println(System.nanoTime()-start);
//		System.out.println("Sorted array:\n" + Arrays.toString(resultArray));

	}

	private static void makeArray() {

		array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUNDARY);
		}

//		System.out.println("Original random array:\n" + Arrays.toString(array));
	}

}
