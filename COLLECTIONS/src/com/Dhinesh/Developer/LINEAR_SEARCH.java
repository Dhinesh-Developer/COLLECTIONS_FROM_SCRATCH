package com.Dhinesh.Developer;
/*
 * Linear Search = Iterate through a collection one element one element at a time.
 *   run Time Complexity =O(n)
 *    
 *    DisAdvantages: slow for large data  set.
 *    
 *    advantages:
 *    	1. Fast for searches of small to medium data sets.
 *    	2.Does not need to sorted.
 *    	3.Useful for data Structures that do not have random access.(Linked List).
 */
public class LINEAR_SEARCH {
	
	private static int linearSearch(int[] ar, int index) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i] == index) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[] ar= {9,1,8,2,7,3,6,4,5};
		
		int index = linearSearch(ar,3);
		if(index != -1) {
			System.out.println("Element found at the index "+index);
		}else {
			System.out.println("Element not found");
		}
		// output = Element found at the index 5
	}

}
