package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testGetSetSize {
	
	/**
	 * @return The current maximum size of the ordered set (the current allowed 
	 * number of elements before resizing).
	 
	public int getSetSize() {
		1	return _set_size;
	}
	*/
	
	OrdSet os = null;
	
	@Before
	public void before() {
		os = new OrdSet();
	}
	
	@Test
	public void testPath1() {
		Assert.assertEquals(0, os.getSetSize());
	}

}
