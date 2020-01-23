package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	//Any method with @BeforeClass annotation should be a static method
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	//Something that needs to be executed before every test
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}
	
	//Code that needs to be executed after every test
	@After
	public void teardown() {
		System.out.println("After test");	
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
