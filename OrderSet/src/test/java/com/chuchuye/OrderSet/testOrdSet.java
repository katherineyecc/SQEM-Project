package com.chuchuye.OrderSet;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testOrdSet {
	
	private OrdSet os;
	int result;
	
	@Test(expected = ArithmeticException.class)
	public void testAddPath1() throws ArithmeticException {
		int[] v1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		int n2 = 2;
		os = new OrdSet(v1);
		os.add(n2);
	}
	
	@Test
	public void testAddPath2() {
		int[] v2 = new int[] {1,2,3};
		int n2 = 2;
		os = new OrdSet(v2);
		os.add(n2);
		int[] actual = os.getSetArray();
		for(int index=0; index<v2.length; index++) {
			Assert.assertEquals(v2[index], actual[index]);
		}
	}
	
	@Test(expected = ArithmeticException.class)
	public void testAddPath3() throws ArithmeticException {
		int[] v3 = new int[] {1,2,3,4,5,6,7,8,9};
		int n3 = 10;
		os = new OrdSet(v3);
		os.add(n3);
	}
	
	@Test
	public void testAddPath4() {
		int[] v4 = new int[] {1,2,3};
		int n4 = 4;
		os = new OrdSet(v4);
		os.add(n4);
		int[] actual = os.getSetArray();
		for(int index=0; index<v4.length; index++) {
			Assert.assertEquals(v4[index], actual[index]);
		}
	}
	
	@Test
	public void testAddPath5() {
		int[] v5 = new int[] {1,2};
		int n5 = 3;
		os = new OrdSet(v5);
		os.add(n5);
		int[] actual = os.getSetArray();
		for(int index=0; index<v5.length; index++) {
			Assert.assertEquals(v5[index], actual[index]);
		}
	}
	
	@Test
	public void testBinSearchPath1() {
		int[] v = new int[] {1,2,3};
		os = new OrdSet(v);
		int[] a1 = new int[] {};
		int x2 = 4;
		result = os.binSearch(a1, a1.length, x2);
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testBinSearchPath2() {
		int[] v = new int[] {1,2,3};
		os = new OrdSet(v);
		int[] a2 = new int[] {1,2,3};
		int x2 = 4;
		result = os.binSearch(a2, a2.length, x2);
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testBinSearchPath3() {
		int[] v = new int[] {1,2,3};
		os = new OrdSet(v);
		int[] a3 = new int[] {1,2};
		int x3 = 2;
		result = os.binSearch(a3, a3.length, x3);
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void testBinSearchPath4() {
		int[] v = new int[] {1,2,3};
		os = new OrdSet(v);
		int[] a4 = new int[] {1,2};
		int x4 = 3;
		result = os.binSearch(a4, a4.length, x4);
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testContainsIntPath1() {
		boolean result1;
		int[] v = new int[] {1,2,3};
		int n = 2;
		os = new OrdSet(v);
		result1 = os.contains(n);
		Assert.assertEquals(true, result1);
	}
	
	@Test
	public void testContainsOrdSetPath1() {
		OrdSet x = null;
		int[] v = new int[] {1,2,3};
		int[] x1 = new int[] {4};
		boolean result1;
		os = new OrdSet(v);
		x = new OrdSet(x1);
		result1 = os.contains(x);
		Assert.assertEquals(false, result1);
	}
	
	@Test
	public void testContainsOrdSetPath2() {
		OrdSet x = null;
		int[] v = new int[] {1,2,3};
		int[] x2 = new int[] {1};
		boolean result1;
		os = new OrdSet(v);
		x = new OrdSet(x2);
		result1 = os.contains(x);
		Assert.assertEquals(true, result1);
	}
	
	@Test
	public void testElementAtPath1() {
		int[] v = new int[] {1,2,3};
		int where1 = -1;
		os = new OrdSet(v);
		Assert.assertEquals(-1, os.elementAt(where1));
	}
	
	@Test
	public void testElementAtPath2() {
		int[] v = new int[] {1,2,3};
		int where2 = 1;
		os = new OrdSet(v);
		Assert.assertEquals(2, os.elementAt(where2));
	}
	
	@Test
	public void testEqualsPath1() {
		OrdSet x = null;
		int[] v1 = new int[] {1,2,3,4};
		int[] x1 = new int[] {1,2,3};
		os = new OrdSet(v1);
		x = new OrdSet(x1);
		Assert.assertEquals(v1.length-x1.length, os.equals(x));
	}
	
	@Test
	public void testEqualsPath2() {
		OrdSet x = null;
		int[] v2 = new int[0];
		int[] x2 = new int[0];
		os = new OrdSet(v2);
		x = new OrdSet(x2);
		Assert.assertEquals(0, os.equals(x));
	}
	
	@Test
	public void testEqualsPath4() {
		OrdSet x = null;
		int[] v4 = new int[] {2,3,4,5};
		int[] x4 = new int[] {1,2,3};
		os = new OrdSet(v4);
		x = new OrdSet(x4);
		Assert.assertEquals(1, os.equals(x));
	}
	
	@Test
	public void testEqualsPath5() {
		OrdSet x = null;
		int[] v5 = new int[] {1};
		int[] x5 = new int[] {1};
		os = new OrdSet(v5);
		x = new OrdSet(x5);
		Assert.assertEquals(0, os.equals(x));
	}
	
	@Test
	public void testGetActualSizePath1() {
		os = new OrdSet();
		Assert.assertEquals(0, os.getActualSize());
	}
	
	@Test
	public void testGetResizedTimesPath1() {
		os = new OrdSet();
		Assert.assertEquals(0, os.getResizedTimes());
	}
	
	@Test
	public void testGetSetArrayPath1() {
		int[] v = new int[] {1,2,3};
		os = new OrdSet(v);
		int[] actual = os.getSetArray();
		for(int index=0; index<v.length; index++) {
			Assert.assertEquals(v[index], actual[index]);
		}
	}
	
	@Test
	public void testGetSetElementsPath1() {
		int[] v1 = new int[] {1,2,3};
		os = new OrdSet(v1);
		int[] elems = os.getSetElements();
		for(int index=0; index<elems.length; index++) {
			Assert.assertEquals(v1[index], elems[index]);
		}
	}
	
	@Test
	public void testGetSetElementsPath2() {
		int[] v2 = new int[0];
		os = new OrdSet(v2);
		int[] elems = os.getSetElements();
		for(int index=0; index<elems.length; index++) {
			Assert.assertEquals(v2[index], elems[index]);
		}
	}
	
	@Test
	public void testGetSetLastPath1() {
		os = new OrdSet();
		Assert.assertEquals(-1, os.getSetLast());
	}
	
	@Test
	public void testGetSetSizePath1() {
		os = new OrdSet();
		Assert.assertEquals(0, os.getSetSize());
	}
	
	@Test
	public void testIsEmptyPath1() {
		os = new OrdSet();
		Assert.assertEquals(true, os.isEmpty());
	}
	
	@Test
	public void testIsEmptyPath2() {
		int[] v = new int[] {1};
		os = new OrdSet(v);
		Assert.assertEquals(false, os.isEmpty());
	}
	
	@Test
	public void testIsOverflowPath1() {
		os = new OrdSet();
		Assert.assertEquals(false, os.isOverflow());
	}
	
	@Test
	public void testOrdSet1Path1() {
		int size = 1;
		os = new OrdSet(size);
		Assert.assertEquals(3, os.getSetSize());
		Assert.assertEquals(0, os.getActualSize());
		Assert.assertEquals(-1, os.getSetLast());
		Assert.assertEquals(0, os.getResizedTimes());
		Assert.assertEquals(false, os.isOverflow());
	}
	
	@Test
	public void testOrdSet2Path1() {
		int[] v = new int[] {1,2,3};
		os = new OrdSet(v);
		Assert.assertEquals(3, os.getSetSize());
		Assert.assertEquals(3, os.getActualSize());
		Assert.assertEquals(2, os.getSetLast());
		Assert.assertEquals(0, os.getResizedTimes());
		Assert.assertEquals(false, os.isOverflow());
		int[] setArray = os.getSetArray();
		for(int index=0; index<setArray.length; index++) {
			Assert.assertEquals(v[index], setArray[index]);
		}
	}
	
	@Test(expected = ArithmeticException.class)
	public void testRemovePath1() throws ArithmeticException {
		int[] v = new int[] {1,2,3};
		int val1 = 1;
		os = new OrdSet(v);
		os.set_overflow(true);
		os.remove(val1);
	}
	
	@Test
	public void testRemovePath2() {
		int[] v = new int[] {1,2,3};
		int val2 = 4;
		boolean result1;
		os = new OrdSet(v);
		result1 = os.remove(val2);
		Assert.assertEquals(false, result1);
	}
	
	@Test
	public void testRemovePath3() {
		int[] v = new int[] {1,2,3};
		int val3 = 2;
		boolean result1;
		os = new OrdSet(v);
		result1 = os.remove(val3);
		Assert.assertEquals(true, result1);
	}
	
	@Test
	public void testToStringPath1() {
		int[] v = new int[] {1,2,3};
		os = new OrdSet(v);
		String s = "1 2 3 ";
		Assert.assertEquals(s, os.toString());
	}
	
	@Test
	public void testToStringPath2() {
		int[] v = new int[] {};
		os = new OrdSet(v);
		String s = "";
		Assert.assertEquals(s, os.toString());
	}
	
	@Test
	public void testUnionPath1() {
		OrdSet set = null;
		OrdSet result = null;
		int[] s1 = new int[] {};
		int[] x1 = new int[] {};
		os = new OrdSet(s1);
		set = new OrdSet(x1);
		result = os.union(set);
		Assert.assertEquals(0, result.getActualSize());
	}
	
	@Test
	public void testUnionPath2() throws ArithmeticException {
		OrdSet set = null;
		OrdSet result = null;
		int[] s2 = new int[] {1,2,3,4,5,6,7};
		int[] x2 = new int[] {8,9,10};
		os = new OrdSet(s2);
		set = new OrdSet(x2);
		result = os.union(set);
		Assert.assertEquals(true, result.isOverflow());
	}
	
	@Test
	public void testUnionPath3() {
		OrdSet set = null;
		OrdSet result = null;
		int[] expected = new int[] {1,2,3,4};
		int[] s3 = new int[] {2,3,4};
		int[] x3 = new int[] {1};
		os = new OrdSet(s3);
		set = new OrdSet(x3);
		result = os.union(set);
		for(int index=0; index<expected.length; index++) {
			Assert.assertEquals(expected[index], result.getSetArray()[index]);
		}
	}
	
	@Test
	public void testUnionPath4() {
		OrdSet set = null;
		OrdSet result = null;
		int[] expected = new int[] {1,2,3};
		int[] s4 = new int[] {1,2,3};
		int[] x4 = new int[] {1};
		os = new OrdSet(s4);
		set = new OrdSet(x4);
		result = os.union(set);
		for(int index=0; index<expected.length; index++) {
			Assert.assertEquals(expected[index], result.getSetArray()[index]);
		}
	}
	
	@Test
	public void testUnionPath5() {
		OrdSet set = null;
		OrdSet result = null;
		int[] expected = new int[] {1,2,3,4};
		int[] s5 = new int[] {1,3,4};
		int[] x5 = new int[] {2};
		os = new OrdSet(s5);
		set = new OrdSet(x5);
		result = os.union(set);
		for(int index=0; index<expected.length; index++) {
			Assert.assertEquals(expected[index], result.getSetArray()[index]);
		}
	}
	
	@After
	public void tearDown() {
		os = null;
	}

}
