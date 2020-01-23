package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 * Applying Parameterized tests
 * @author Samuel_Vazquez
 *
 */
//1. Defining a parameterized test
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	//AACD => CD ACD=> CD CDEF=>CDEF CDAA => CDAA
	StringHelper helper = new StringHelper();
	
	//3. Time to use the parameters defined in step 2, using them as constructor arguments.
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input=input;
		this.expectedOutput=expectedOutput;
	}
	
	//2. Defining a public method and also using a @Parameters annotation. There should be only one set of conditions for a test
	//In this method we are going to define our parameters: "CD, AACD, CD ACD". I created an array of parameters
	//This method is expecting a collection, not an array, that's why we need to convert an array into a collection
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][]={ {"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
	}
	
	//4. Now, it's necessary to change our old parameters.  
	//CD -> expectedOutput AACD -> input, and so on...
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

	

}
