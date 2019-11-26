package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testToString {
	
	/**
	 * 
	 * @return The string representation of this ordered set, where each integer 
	 * in the set is separated from the next one by a space character..
	 * 
	 * public String toString() {
		1	String output = "";
		2	int k = 0;
		
		3	for (k = 0; k <= _last; k++)
		4		output += "" + _set[k] + " ";
		
		5	return output;
	}
	 */
	
	OrdSet ostest = null;
	
	@Before
	public void before() {
		
	}
	
	@Test
	public void testPath1() {
		int[] v = new int[] {1,2,3};
		ostest = new OrdSet(v);
		String s = "1 2 3 ";
		Assert.assertEquals(s, ostest.toString());
	}
	
	@Test
	public void testPath2() {
		int[] v = new int[] {};
		ostest = new OrdSet(v);
		String s = "";
		Assert.assertEquals(s, ostest.toString());
	}

}
