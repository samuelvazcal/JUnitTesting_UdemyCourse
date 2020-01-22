package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		//Creating an instance of my particular method to be tested
		StringHelper helper = new StringHelper();
		//Calling the first method to be tested
		//actual is where the value from --- helper.truncateAInFirst2Positions("AACD") ---  is saved 
		
		//AACD => CD ACD=> CD CDEF=>CDEF CDAA => CDAA

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		//There are two arguments, where:
		//expected (the first one), actual (the second value)
	}
	//expected:<ABC[]> but was:<ABC[D]>
	

}
