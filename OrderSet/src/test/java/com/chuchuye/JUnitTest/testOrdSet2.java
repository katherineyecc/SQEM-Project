package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testOrdSet2 {
	
	/**
	 * Create by copy from an array of values. The ordered set size
	 * will be defined based on the length of the parameter array v; 
	 * if the length of v exceeds max_set_size, only the first values in
	 * the array up to max_set_size will be considered and the set  
	 * would have a size of max_set_size 
	 * 
	 * @param v - The array of values to copy from into the ordered set.
	 
	public OrdSet(int[] v) {
		1	this(v.length);
		2	initSetArray(v);
	}
	*/
	
	OrdSet os = null;
	int[] v = new int[] {1,2,3};
	
	@Before
	public void before() {
		os = new OrdSet(v);
	}
	
	@Test
	public void testPath1() {
		Assert.assertEquals(3, os.getSetSize());
		Assert.assertEquals(3, os.getActualSize());
		Assert.assertEquals(2, os.getSetLast());
		Assert.assertEquals(0, os.getResizedTimes());
		Assert.assertEquals(false, os.isOverflow());
		int[] setArray = os.getSetArray();
		for(int index=0; index<setArray.length; index++) {
			Assert.assertEquals(v[index], setArray[index]);
		}
	}

}
