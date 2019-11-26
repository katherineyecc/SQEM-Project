package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testElementAt {
	
	/**
	 * Returns the element at the provided index.
	 * 
	 * @param where - The position of the element to return or -1 if the item is 
		out of bound.
	 * @return The ordered set element at the given position.
	 
	public int elementAt(int where) {
		1	if ((where < 0) || (where > _last)) {
		2		System.err.println("Out of bound element: " + where);
		3		return -1;
			}
		
		4	return _set[where];
	}
	*/
	
	OrdSet os = null;
	int[] v = new int[] {1,2,3};
	int where1 = -1;
	int where2 = 1;
	
	@Before
	public void before() {
		os = new OrdSet(v);
	}
	
	@Test
	public void testPath1() {
		Assert.assertEquals(-1, os.elementAt(where1));
	}
	
	@Test
	public void testPath2() {
		Assert.assertEquals(2, os.elementAt(where2));
	}

}
