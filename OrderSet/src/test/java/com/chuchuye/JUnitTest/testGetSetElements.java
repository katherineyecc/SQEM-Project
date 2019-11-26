package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testGetSetElements {
	
	/**
	 * public int[] getSetElements() {
		1	int size = getActualSize();
	    2	int[] elems = new int[size];
	    3	for(int i = 0; i < size; i++){
	    4		elems[i] = _set[i];
	    5	}
	    6	return elems;
	}
	 */
	
	OrdSet os = null;
	int[] v1 = new int[] {1,2,3};
	int[] v2 = new int[0];
	
	@Test
	public void testPath1() {
		os = new OrdSet(v1);
		int[] elems = os.getSetElements();
		for(int index=0; index<elems.length; index++) {
			Assert.assertEquals(v1[index], elems[index]);
		}
	}
	
	@Test
	public void testPath2() {
		os = new OrdSet(v2);
		int[] elems = os.getSetElements();
		for(int index=0; index<elems.length; index++) {
			Assert.assertEquals(v2[index], elems[index]);
		}
	}
}
