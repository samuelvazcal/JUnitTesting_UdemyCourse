package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions() {
		//Creating an instance of my particular method to be tested

		//Calling the first method to be tested
		//actual is where the value from --- helper.truncateAInFirst2Positions("AACD") ---  is saved 
		
		//AACD => CD ACD=> CD CDEF=>CDEF CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//There are two arguments, where:
		//expected (the first one), actual (the second value)
	}
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

}
