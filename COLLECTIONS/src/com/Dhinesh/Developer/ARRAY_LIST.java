package com.Dhinesh.Developer;

import java.util.ArrayList;

/*
 * ArrayList => a resizable array.
 * 				Elements can be added and removed after compilation phase.
 * 				store reference data types.
 */
public class ARRAY_LIST {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pizza");
		al.add("hamburger");
		al.add("hotDog");
		
		for(String x:al) {
			System.out.print(x+" ");  //Pizza hamburger hotDog 
			
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");  ///Pizza hamburger hotDog 
		}
		
		
		
		al.set(0, "sushi");  //set the value in the specfic index
		al.remove(2); // get the elements using index
//		al.clear();  /remove all element in the arrayList
		
		
		
		
		
		
		
	
	}

}
