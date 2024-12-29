package com.Dhinesh.Developer;
/*
 * insertion sort => after comparing to the left
 * 					 shift elements to the right to make room to insert a value.
 * 				
 * 					Quadratic time O(n^2)
 * 					small data sets = decent
 * 					large data sets = BAD
 * 					
 * 					less steps than bubble sort.
 * 					best case is O(n) compared to selection to selection sort O(n^2);
 */
public class INSERTION_SORT {

	public static void main(String[] args) {
		int[] ar = {9,1,8,2,7,3,6,5,4};
		for(int x:ar) {
			System.out.print(x+" ");
		}
		System.out.println();
		insertionSort(ar);
		
		for(int x:ar) {
			System.out.print(x+" ");
		}
	}

	private static void insertionSort(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			int temp =ar[i];
			int j = i-1;
			while(j >= 0 && ar[j] > temp) {
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = temp;
		}
	}
/*
 * output
 *  9 1 8 2 7 3 6 5 4 
	1 2 3 4 5 6 7 8 9 
 */
}
