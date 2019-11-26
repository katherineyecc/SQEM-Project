package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testOrdSet1 {
	
	/**
	 * Create an empty instance of OrdSet with default values and
	 * a size based on the proposed size.
	 *  
	 * @param size - The proposed size
	 
	public OrdSet (int size) {
		1	_set_size = defSetSize(size);
		2	_set = new int[_set_size];
		3	_last = -1;
		4	_resized_times = 0;
		5	_overflow = false;
		
	}
	*/
	
	OrdSet os = null;
	int size = 1;
	
	@Before
	public void before() {
		os = new OrdSet(size);
	}
	
	@Test
	public void testPath1() {
		Assert.assertEquals(3, os.getSetSize());
		Assert.assertEquals(0, os.getActualSize());
		Assert.assertEquals(-1, os.getSetLast());
		Assert.assertEquals(0, os.getResizedTimes());
		Assert.assertEquals(false, os.isOverflow());
	}

}
