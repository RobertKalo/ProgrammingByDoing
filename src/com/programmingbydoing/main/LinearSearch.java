package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {

	private static int N = 20;
	private static int BOUNDARY = 15;
	private static int[] array;
	private static Random random = new Random();
	private static int searchFor;

	public static void main(String[] args) {

		searchFor = random.nextInt(BOUNDARY);
		System.out.println(searchFor);
		makeArray();
		doSearch();

	}

	private static void doSearch() {
		
		int counter=0;
		for (int i = 0; i < array.length; i++) {

			if (array[i]==searchFor) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	private static void makeArray() {

		array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(BOUNDARY);
		}
		System.out.println(Arrays.toString(array));
	}

}
