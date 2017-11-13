package com.programmingbydoing.main;

public class Roman {

	private String	romanNumber;
	private int		value;

	public Roman(String romanNumber) {
		this.romanNumber = romanNumber;
	}

	public enum RomanSymbol {

		I( 1 ), V( 5 ), X( 10 ), L( 50 ), C( 100 ), D( 500 ), M( 1000 );

		private final int value;

		private RomanSymbol(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public int calculateIntEquivalent( int lastArabicNumber, int totalArabicResult ) {
			if ( lastArabicNumber > this.value ) {
				return totalArabicResult - this.value;
			} else {
				return totalArabicResult + this.value;
			}
		}
	}

	public int toArabic() {
		// TODO Auto-generated method stub
		// String.valueOf( romanNumber );

		int n = romanNumber.length();
		for ( int i = 0; i < n - 1; i++ ) {
			String symbol = "" + romanNumber.charAt( i );
			int intValue = RomanSymbol.valueOf( symbol ).getValue();

//			value = RomanSymbol.valueOf( symbol ).calculateIntEquivalent( intValue, 0 );
			value = RomanSymbol.valueOf( symbol ).calculateIntEquivalent( intValue, value );
		}

		String lastSymbol = "" + romanNumber.charAt( n - 1 );
		value += RomanSymbol.valueOf( lastSymbol ).getValue();
		return value;
	}
}
