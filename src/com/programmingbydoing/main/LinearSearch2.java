package com.programmingbydoing.main;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch2 {

	private static int		N			= 20;
	private static int		BOUNDARY	= 15;
	private static int[]	array;
	private static Random	random		= new Random();
	private static int		searchFor;

	public static void main( String[] args ) {

		searchFor = random.nextInt( BOUNDARY );
		System.out.println( "Search for: "+searchFor );
		makeArray();
		doSearch();

	}

	private static void doSearch() {
		int i = 0;
		int result = -1;
		do {
			i++;
		} while ( array[i] != searchFor && i < N );
		if ( i < N ) {
			result = i;
		}
		System.out.println( "" + result );
	}

	private static void makeArray() {

		array = new int[N];
		for ( int i = 0; i < array.length; i++ ) {
			array[i] = random.nextInt( BOUNDARY );
		}
		System.out.println( Arrays.toString( array ) );
	}

}
