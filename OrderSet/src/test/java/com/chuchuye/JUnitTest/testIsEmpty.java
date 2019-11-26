package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testIsEmpty {
	
	/**
	 * @return True if the ordered set is empty and false otherwise.
	 
	public boolean isEmpty() {
		1	if (_last < 0) 
		2		return true;
		3	return false;
	}
	*/
	
	OrdSet os = null;
	
	@Test
	public void testPath1() {
		os = new OrdSet();
		Assert.assertEquals(true, os.isEmpty());
	}
	
	@Test
	public void testPath2() {
		int[] v = new int[] {1};
		os = new OrdSet(v);
		Assert.assertEquals(false, os.isEmpty());
	}

}
