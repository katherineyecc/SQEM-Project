package com.chuchuye.JUnitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.chuchuye.OrderSet.OrdSet;

public class testBinSearch {
	
	/**
	 * Performs a binary search on the provided array for the element x.
	 * A binary search is a search algorithm for finding a particular value 
	 * in a list of data. Binary search assumes the data is sorted. The 
	 * search begins by examining the value in the center of the list; 
	 * because the values are sorted, it then knows whether the value occurs 
	 * before or after the center value, and searches through the correct 
	 * half in the same way.
	 * 
	 * @param a - The array to search.
	 * @param size - The size of the array being searched.
	 * @param x - The value to search the array for.
	 * @return The index of the value if it is found, and -1 otherwise.
	 
	public int binSearch(int[] a, int size, int x) {
		1	int i=0;
		2	int j=size-1;
		3	int m=0;
			
			//The array is of size 0
		4	if (j<0) 
		5		return -1; 
			
			//All elements in the array are of smaller value than the searched value x
		6	if (a[j] < x)  
		7		return -1; 
	
			//Applying the search algorithm by first examining the value of the center
		8	while(i<j){
		9		m= (i+j)/2;
				
				//Changing the indexes of search to choose the appropriate half of the array 
				//to search in
		10		if (x>a[m]) {
		11			i=m+1;
		12		} else { 
		13			j=m;
				}
			}
	 
			//if the value is found, return its index
		14	if (x == a[i]) 
		15		return i;
			
			//if the value is not found, return -1
		16	return -1;
	}
	*/
	
	OrdSet os = null;
	int[] v = new int[] {1,2,3};
	int[] a1 = new int[] {};
	int[] a2 = new int[] {1,2,3};
	int[] a3 = new int[] {1,2};
	int[] a4 = new int[] {1,2};
	int x2 = 4;
	int x3 = 2;
	int x4 = 3;
	int result;
	
	@Before
	public void before() {
		os = new OrdSet(v);
	}
	
	@Test
	public void testPath1() {
		result = os.binSearch(a1, a1.length, x2);
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testPath2() {
		result = os.binSearch(a2, a2.length, x2);
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testPath3() {
		result = os.binSearch(a3, a3.length, x3);
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void testPath4() {
		result = os.binSearch(a4, a4.length, x4);
		Assert.assertEquals(-1, result);
	}

}
