package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testAdd {
	
	/**
	 * Adds an item to the set. Since this is a set, the element is only 
	 * added if it is unique. An attempt to add a new element while the set
	 * is full causes a set resize. When no resizes are allowed, an 
	 * overflow exception is raised.
	 * 
	 * @param n - The element to add to the ordered set. 
	 
	public void add(int n) throws ArithmeticException{
		1	if (_overflow) 
		2		throw new ArithmeticException();
			// if it is already in the set we return.
		3	if (this.contains(n)) 
		4		return;
			
		5	if (_last+1 >= _set_size) {
		6		this.resizeArray();
		7		if (_overflow) {
		8			throw new ArithmeticException();
				}
			}
			
		9	int i = make_a_free_slot(n);
		10	_set[i] = n;
		11	updateLast();
	}
	*/
	
	OrdSet os = null;
	int[] v1 = new int[] {1,2,3,4,5,6,7,8,9,10};
	int[] v2 = new int[] {1,2,3};
	int[] v3 = new int[] {1,2,3,4,5,6,7,8,9};
	int[] v4 = new int[] {1,2,3};
	int[] v5 = new int[] {1,2};
	int n2 = 2;
	int n3 = 10;
	int n4 = 4;
	int n5 = 3;
	
	@Test(expected = ArithmeticException.class)
	public void testPath1() throws ArithmeticException {
		os = new OrdSet(v1);
		os.add(n2);
	}
	
	@Test
	public void testPath2() {
		os = new OrdSet(v2);
		os.add(n2);
		int[] actual = os.getSetArray();
		for(int index=0; index<v2.length; index++) {
			Assert.assertEquals(v2[index], actual[index]);
		}
	}
	
	@Test(expected = ArithmeticException.class)
	public void testPath3() throws ArithmeticException {
		os = new OrdSet(v3);
		os.add(n3);
	}
	
	@Test
	public void testPath4() {
		os = new OrdSet(v4);
		os.add(n4);
		int[] actual = os.getSetArray();
		for(int index=0; index<v4.length; index++) {
			Assert.assertEquals(v4[index], actual[index]);
		}
	}
	
	@Test
	public void testPath5() {
		os = new OrdSet(v5);
		os.add(n5);
		int[] actual = os.getSetArray();
		for(int index=0; index<v5.length; index++) {
			Assert.assertEquals(v5[index], actual[index]);
		}
	}

}
