package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean cond = true;
		assertEquals(true, true);
		assertTrue(cond);
		assertFalse(cond);
	}

}
