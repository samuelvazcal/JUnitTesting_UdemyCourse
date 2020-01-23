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
		
		//Asserts that two objects are equal
		//AACD => CD ACD=> CD CDEF=>CDEF CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//There are two arguments, where:
		//expected (the first one), actual (the second value)
	}
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions3() {
		assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions4() {
		assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicFalseScenario() {
		//assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		//assertFalse checks if the actual value is false
		//assertFalse("The condition failed!", helper.areFirstAndLastTwoCharactersTheSame it will
		//show the message if the assert fails
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicTrueScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	

}
