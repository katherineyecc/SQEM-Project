package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testContains_int {
	
	/**
	 * Checks if the ordered set contains the indicated value.
	 * @param n - The value to check for in the ordered set.
	 * @return True if a match is found and false otherwise.
	 
	public boolean contains(int n) {
		1	return binSearch(_set, _last+1, n) >= 0;
	}
	*/
	
	OrdSet os = null;
	int[] v = new int[] {1,2,3};
	int n = 2;
	
	@Before
	public void before() {
		os = new OrdSet(v);
	}
	
	@Test
	public void testPath1() {
		boolean result;
		result = os.contains(n);
		Assert.assertEquals(true, result);
	}

} 
