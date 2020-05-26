package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
	
	@BeforeClass
	void before() {
		System.out.println("Before");
	}
	
	@AfterClass
	void after() {
		System.out.println("after");
	}
	
	MyMath myMath = new MyMath();
	@Test
	void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}

	@Test
	void sum_with1numbers() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}
}
