package com.programmingbydoing.main;

public class NotAdjacentSum {

	public static void main( String[] args ) {

		int arr[] = { 5, 5, 10, 40, 50, 35 };

		System.out.println( findMaxSum( arr ) );

	}

	private static int findMaxSum( int[] arr ) {

		int incl = arr[0];
		int excl = 0;
		int excl_new;
		int i;

		for ( i = 1; i < arr.length; i++ ) {
			excl_new = ( incl > excl ) ? incl : excl;

			incl = excl + arr[i];
			excl = excl_new;
		}
		return ( ( incl > excl ) ? incl : excl );
	}
}