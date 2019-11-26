package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testUnion {
	
	/**
	 * Union of two sets implementation with cost n1+n2 and linear with the size., 
	 * returns an instance of OrdSet that is the union of
	 *  "this" instance 
	 * and s2
	 * 
	 * @param s2 The second set to perform the union on.
	 * @return The union of the two sets, "this" and s2.
	 * @throws ArithmeticException 
	 
	public OrdSet union(OrdSet s2) {
		1	int[] set1 = this.getSetArray();
		2	int[] set2 = s2.getSetArray();
			
		3	int size1 = this.getSetLast() + 1;
		4	int size2 = s2.getSetLast() + 1;
			
		5	OrdSet set = new OrdSet(size1 + size2);
			
		6	int lb1 = 0, lb2 = 0, pos = 0;
			try {
		7		while (lb1 < size1 && lb2 < size2) {
		8			if (set1[lb1] < set2[lb2]) {
		9				set.add(set1[lb1]);
		10				pos = pos + 1;
		11				lb1 = lb1 + 1;
		12			} else if (set2[lb2] < set1[lb1]) {
		13				set.add(set2[lb2]);
		14				pos = pos + 1;
		15				lb2 = lb2 + 1;
		16			} else if (set1[lb1] == set2[lb2]) {
		17				set.add(set2[lb2]);
		18				pos = pos + 1;
		19				lb1 = lb1 + 1;
		20				lb2 = lb2 + 1;
					} else {
		21				System.exit(1);
					}
				}
			
		22		while (lb1 < size1) {
		23			set.add(set1[lb1]);
		24			pos = pos + 1;
		25			lb1 = lb1 + 1;
				}
			
		26		while (lb2 < size2) {
		27			set.add(set2[lb2]);
		28			pos = pos + 1;
		29			lb2 = lb2 + 1;
				}
			
				// set the last element index.
		30		set._last = pos - 1;
			} catch (ArithmeticException e) {
		31		System.out.println("The union caused an overflow; the union size exceeds the maximum set size");
			}
		32	return set;
	}
	*/

	OrdSet os = null;
	OrdSet set = null;
	OrdSet result = null;
	int[] s1 = new int[] {};
	int[] x1 = new int[] {};
	int[] s2 = new int[] {1,2,3,4,5,6,7};
	int[] x2 = new int[] {8,9,10};
	int[] s3 = new int[] {2,3,4};
	int[] x3 = new int[] {1};
	int[] s4 = new int[] {1,2,3};
	int[] x4 = new int[] {1};
	int[] s5 = new int[] {1,3,4};
	int[] x5 = new int[] {2};
	
	@Test
	public void testPath1() {
		os = new OrdSet(s1);
		set = new OrdSet(x1);
		result = os.union(set);
		Assert.assertEquals(0, result.getActualSize());
	}
	
	@Test
	public void testPath2() throws ArithmeticException {
		os = new OrdSet(s2);
		set = new OrdSet(x2);
		result = os.union(set);
		Assert.assertEquals(true, result.isOverflow());
	}
	
	@Test
	public void testPath3() {
		int[] expected = new int[] {1,2,3,4};
		os = new OrdSet(s3);
		set = new OrdSet(x3);
		result = os.union(set);
		for(int index=0; index<expected.length; index++) {
			Assert.assertEquals(expected[index], result.getSetArray()[index]);
		}
	}
	
	@Test
	public void testPath4() {
		int[] expected = new int[] {1,2,3};
		os = new OrdSet(s4);
		set = new OrdSet(x4);
		result = os.union(set);
		for(int index=0; index<expected.length; index++) {
			Assert.assertEquals(expected[index], result.getSetArray()[index]);
		}
	}
	
	@Test
	public void testPath5() {
		int[] expected = new int[] {1,2,3,4};
		os = new OrdSet(s5);
		set = new OrdSet(x5);
		result = os.union(set);
		for(int index=0; index<expected.length; index++) {
			Assert.assertEquals(expected[index], result.getSetArray()[index]);
		}
	}
}
