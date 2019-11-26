package com.chuchuye.JUnitTest;

import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

import org.junit.Assert;

public class testIsOverflow {
	
	/**
	 * @return The overflow flag
	 
	public boolean isOverflow() {
		1	return _overflow;
	}
	*/
	
	OrdSet os = null;
	
	@Before
	public void before() {
		os = new OrdSet();
	}
	
	@Test
	public void testPath1() {
		Assert.assertEquals(false, os.isOverflow());
	}

}
