package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testGetActualSize {
	
	/**
	 * @return The actual size of the ordered set (the actual number of elements 
     * in the ordered set)
	 
	public int getActualSize() {
		1	return _last + 1;
	}
	*/
	
	OrdSet os = null;
	
	@Before
	public void before() {
		os = new OrdSet();
	}
	
	@Test
	public void testPath1() {
		Assert.assertEquals(0, os.getActualSize());
	}

}
