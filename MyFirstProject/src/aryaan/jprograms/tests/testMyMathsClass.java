package aryaan.jprograms.tests;

import static org.junit.Assert.*;
import static org.junit.Assert.*;  
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import aryaan.jprograms.MyMathsClass;

public class testMyMathsClass {
	
	MyMathsClass testMathsObject=new MyMathsClass();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	
	
	@Test
	public void testaddTwo1() {
		assertEquals(20,testMathsObject.addTwo(5,15));
		
	}
	@Test
	public void testaddTwo2() {
			assertEquals(15,testMathsObject.addTwo(5,10));
	}
	@Test
	public void testaddTwo3() {
			assertEquals(0,testMathsObject.addTwo(5,2147483647));
	}

		
	
}
