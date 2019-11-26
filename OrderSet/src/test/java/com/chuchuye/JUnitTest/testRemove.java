package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testRemove {
	
	/**
	 * Removes an element from the set. The element to remove is given 
	 * by the val parameter.
	 * 
	 * @param val - The value of the element to remove from the set.
	 * @return true if the value was found and removed, and false otherwise.
	 
	public boolean remove (int val) throws ArithmeticException{
		1	if (_overflow) 
		2		throw new ArithmeticException();
		3	int where = binSearch(_set, _last + 1, val);
		4	if (where >= 0) {
		5		int k;
		6		for (k = where; k < _last; k++) {
		7			_set[k] = _set[k+1];
				}
		8		_last --;
		9		return true;
			} else {
		10		return false;
			}
	}
	*/
	
	OrdSet os = null;
	int[] v = new int[] {1,2,3};
	int val1 = 1;
	int val2 = 4;
	int val3 = 2;
	boolean result;
	
	@Before
	public void before() {
		os = new OrdSet(v);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testPath1() throws ArithmeticException {
		os.set_overflow(true);
		os.remove(val1);
	}
	
	@Test
	public void testPath2() {
		result = os.remove(val2);
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testPath3() {
		result = os.remove(val3);
		Assert.assertEquals(true, result);
	}

}
