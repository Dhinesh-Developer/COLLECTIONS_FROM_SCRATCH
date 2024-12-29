package com.Dhinesh.Developer;
/*
 * interpolation search => improvement over binary search best used for "uniformly" distributed
 * 							"guesses" where a value might be based on calculated probe results.
 * 							if the probe incorrect , Search area is narrowed , and a new probe id calculated
 * 
 *  						average case: O(log(log(n)))
 *  		`				worst case : O(n) [values increase exponentially]
 */
public class INTERPOLATION_SEARCH {
	private static int interpolationSearch(int[] ar,int val) {
		int high = ar.length-1;
		int low = 0;
		while(val >= ar[low] && val <= ar[high] && low<=high) {
			int probe = low+ (high-low) * (val - ar[low]) / (ar[high] -ar[low]); //formula
			
			System.out.println("Probe: "+probe);
			if(ar[probe] == val) {
				return probe;
			}else if(ar[probe] < val) {
				low = probe+1;
			}else {
				high = probe-1;	
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		//int[] ar = {1,2,3,4,5,6,7,8,9};
		int[] ar = {1,2,4,8,16,32,64,128,256,512,1024};
		int index = interpolationSearch(ar,256);
		if(index != -1) {
			System.out.println("Elements found at index: "+index);
		}else {
			System.out.println("Element not found "+index);
		}
	}
/*
 * output = Probe: 7
Elements found at index: 7
 */
}
