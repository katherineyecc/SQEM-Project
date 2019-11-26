package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testGetResizedTimes {
	
	/**
	 * @return The times the array has been resized
	 
	public int getResizedTimes() {
		1	return _resized_times;
	}
	*/
	
	OrdSet os = null;
	
	@Before
	public void before() {
		os = new OrdSet();
	}
	
	@Test
	public void testPath1() {
		Assert.assertEquals(0, os.getResizedTimes());
	}

}
