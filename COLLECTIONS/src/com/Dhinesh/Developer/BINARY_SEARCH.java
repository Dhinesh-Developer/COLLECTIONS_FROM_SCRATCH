package com.Dhinesh.Developer;

import java.util.Arrays;

/*
 * binary search = search algo that finds the position
 * 					of a target within in the sorted array.
 * 				  Half of the array is eliminated during each "step"
 */
public class BINARY_SEARCH {
	private static int binarySearch(int[] ar,int a) {
		int low = -1;
		int high = ar.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(ar[mid] == a) {
				return mid;
			}
			if(ar[mid] > a) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		int index = binarySearch(ar,6);
		
	//	int in = Arrays.binarySearch(ar, 7); // 6  inbuilt method.
		System.out.println(index);  //5
	}

}
