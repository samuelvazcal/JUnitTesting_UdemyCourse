package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	//Testing the Arrays class
	//Arrays.sort
	@Test
	public void testArraySort_RandomArray() {
		int [] numbers = {12,3,4,1};
		int [] expected = {1,3,4,12};
		Arrays.sort(numbers);
		//assertEquals fails because it compares objects and not their values
		//assertEquals(expected, numbers);
		//for comparison values you should use assertArrayEquals
		assertArrayEquals(expected, numbers);
	}
	
	//Test method for a particular case where an exception (NULL) is expected, at the beginning
	//failed showing a NullPointerExceptionError, but now with the try catch block is possible to
	//test an exception
	@Test
	public void testArraySort_NullArray() {
		int [] numbers = null;
		try {
			Arrays.sort(numbers);
		} catch (NullPointerException e) {
			//Success
		}
	}
	
	//Another way to implement a test for an expecting specific exception
	//Remember, if you are expecting an exception, but there is not a exception it's a failure
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray_BetterWay() {
		int [] numbers = null;
		Arrays.sort(numbers);
	}
	
	//Testing performance in JUnit test, on a loop of 1 million of cycles within 1000 mS
	//Special testing for very strict performance requirements
	@Test(timeout=1000)
	public void testSort_Performance() {
		int array[] = {12,23,4};
		for(int i=1;i<=1000000;i++)
		{
			array[0]=i;
			Arrays.sort(array);

		}
		
	}
	
	

}
