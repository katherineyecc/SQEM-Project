package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testGetSetLast {
	
	/**
	 * @return The index of the last element in the ordered set.
	 
	public int getSetLast() {
		return _last;
	}
	*/
	
	OrdSet os = null;
	
	@Before
	public void before() {
		os = new OrdSet();
	}
	
	@Test
	public void testPath1() {
		Assert.assertEquals(-1, os.getSetLast());
	}

}
