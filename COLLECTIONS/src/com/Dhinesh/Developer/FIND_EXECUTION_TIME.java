package com.Dhinesh.Developer;

import java.util.Scanner;

public class FIND_EXECUTION_TIME {

	public static void main(String[] args) {
		long start = System.nanoTime();
		
		// --------PROGRAM ----------
		
//		Scanner in = new Scanner(System.in);
//		int a =in.nextInt();
//		System.out.println(a);
		//------------END---------
		
		long duration = (System.nanoTime() -start);
		System.out.println(duration+" ms");
	}

}
