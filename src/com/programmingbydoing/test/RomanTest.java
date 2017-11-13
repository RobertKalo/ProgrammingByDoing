package com.programmingbydoing.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.programmingbydoing.main.Roman;

public class RomanTest {

	@Test
	public void test() {
		
//		assertEquals( 1, new Roman( "I" ).toArabic() );
		assertEquals( 5, new Roman( "V" ).toArabic() );
		assertEquals( 10, new Roman( "X" ).toArabic() );
		assertEquals( 6, new Roman( "VI" ).toArabic() );
		assertEquals( 4, new Roman( "IV" ).toArabic() );

	}

}
