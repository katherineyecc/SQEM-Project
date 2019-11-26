package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testContains_ordset {
	
	/**
	 * Checks if this ordered set contains the ordered set given by x,
	 * all elements in x are elements in this.
	 * @param x - The ordered set to check for.
	 * @return true if x is a subset of this ordered set, and false otherwise.
	 
	public boolean contains (OrdSet x) {
		1	int k, n;
			
		2	for(n = 0, k = 0; n < (x.getSetLast() + 1); n++) {
		3		k = x.elementAt(n);
		4		if (binSearch(_set, _last+1, k) < 0) {
		5			return false;
				}
			}
			
		6	return true;
	}
	*/
	
	OrdSet os = null;
	OrdSet x = null;
	int[] v = new int[] {1,2,3};
	int[] x1 = new int[] {4};
	int[] x2 = new int[] {1};
	boolean result;
	
	@Before
	public void before() {
		os = new OrdSet(v);
	}
	
	@Test
	public void testPath1() {
		x = new OrdSet(x1);
		result = os.contains(x);
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testPath2() {
		x = new OrdSet(x2);
		result = os.contains(x);
		Assert.assertEquals(true, result);
	}

}
