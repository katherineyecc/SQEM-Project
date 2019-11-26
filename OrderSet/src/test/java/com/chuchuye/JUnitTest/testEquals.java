package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testEquals {
	
	/**
	 * Compares two ordered sets for equality.
	 * @param x - The ordered set to check for equality.
	 * @return 0 if the sets are equal (have the same elements, 
	 * 		   1 if they are the same size, but not equal,
	 * 		   and the difference in size otherwise.
	 
	public int equals(OrdSet x) {
		1	int k,n;
		
		2	if (x.getSetLast() != _last) {
		3		return (_last - x.getSetLast());
			}
		
		4	if (isEmpty() && x.isEmpty()) 
		5		return 0;
		
		6	for(k = 0, n = 0; n < (x.getSetLast() + 1); n++) {
		7		k = x.elementAt(n);
		8		if (k != _set[n]) {
		9			return 1;
				}
			}
		
		10	return 0;
	}
	*/
	
	OrdSet os = null;
	OrdSet x = null;
	int[] v1 = new int[] {1,2,3,4};
	int[] x1 = new int[] {1,2,3};
	int[] v2 = new int[0];
	int[] x2 = new int[0];
	int[] v3 = new int[] {1,2,3,4};
	int[] x3 = new int[0];
	int[] v4 = new int[] {2,3,4,5};
	int[] x4 = new int[] {1,2,3};
	int[] v5 = new int[] {1};
	int[] x5 = new int[] {1};
	
	@Test
	public void testPath1() {
		os = new OrdSet(v1);
		x = new OrdSet(x1);
		Assert.assertEquals(v1.length-x1.length, os.equals(x));
	}
	
	@Test
	public void testPath2() {
		os = new OrdSet(v2);
		x = new OrdSet(x2);
		Assert.assertEquals(0, os.equals(x));
	}
	
	@Test
	public void testPath4() {
		os = new OrdSet(v4);
		x = new OrdSet(x4);
		Assert.assertEquals(1, os.equals(x));
	}
	
	@Test
	public void testPath5() {
		os = new OrdSet(v5);
		x = new OrdSet(x5);
		Assert.assertEquals(0, os.equals(x));
	}

}
