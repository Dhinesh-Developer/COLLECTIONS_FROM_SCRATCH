package com.Dhinesh.Developer;

import java.util.Arrays;

/*
 * Bubble sort => pairs of adjacent are compared , and the elements swapped if they are not in order.
 * 					
 * Quadratic time : O(n^2)
 * small data set = okay-ish
 * large data set =bad
 */
public class BUBBLE_SORT {
	//Ascending Order
 static void bubbleSort(int[] ar) {
	 for(int i=0;i<ar.length-1;i++) {
		 for(int j=0;j<ar.length-1;j++) {
			 if(ar[j] > ar[j+1]) {
				 int temp = ar[j];
				 ar[j] = ar[j+1];
				 ar[j+1] = temp;
			 }
		 }
	 }
 }
 
 // Descending Order 
// static void bubbleSort(int[] ar) {
//	 for(int i=0;i<ar.length-1;i++) {
//		 for(int j=0;j<ar.length-1;j++) {
//			 if(ar[j] < ar[j+1]) {  //only changes in the instead of > put < symbol3.
//				 int temp = ar[j];
//				 ar[j] = ar[j+1];
//				 ar[j+1] = temp;
//			 }
//		 }
//	 }
// }
	public static void main(String[] args) {
		
		int[] ar = {9,1,8,2,7,3,6,4,5};
		for(int i:ar) {
			System.out.print(i+"|");
		}
		System.out.println();
		bubbleSort(ar);
		//Arrays.sort(ar); inbuilt method.
		for(int i:ar) {
			System.out.print(i+"|");
		}
	}
/* output.
 *  9|1|8|2|7|3|6|4|5|
	1|2|3|4|5|6|7|8|9|
 */
}
