package com.chuchuye.JUnitTest;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testGetSetArray {
	
	/**
	 * @return The ordered set as an array.
	 
	public int[] getSetArray() {
		1	return _set;
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
		int[] actual = os.getSetArray();
		for(int index=0; index<v.length; index++) {
			Assert.assertEquals(v[index], actual[index]);
		}
	}

}
