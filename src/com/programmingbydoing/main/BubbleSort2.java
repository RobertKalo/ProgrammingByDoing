package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort2 {

	private static int		N			= 20;
	private static int		BOUNDARY	= 15;
	private static Random	random		= new Random();
	private static int[]	array;

	public static void main( String[] args ) {

		makeArray();
		doBubbleSort();

	}

	private static void doBubbleSort() {

		boolean swapped = false;
		int j = 0;
		int temp = 0;

		do {
			int i = 1;
			while ( i < N - j ) {
				if ( array[i - 1] > array[i] ) {
					temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					swapped = true;
					System.out.println( Arrays.toString( array ) );
				}
				i++;
			}
			j++;
		} while ( j < N && swapped );

	}

	private static void makeArray() {

		array = new int[N];
		for ( int i = 0; i < array.length; i++ ) {
			array[i] = random.nextInt( BOUNDARY );

		}

	}
}
