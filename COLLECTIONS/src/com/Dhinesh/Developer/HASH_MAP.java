package com.Dhinesh.Developer;

import java.util.HashMap;

/*
 * HASHMAP => implement the MAp interface (need import)
 * 			  HashMap is similar to ArrayList , but with Key-Value pairs.
 * 			  Stores objects, need to use Wrapper class.	
 * 			  ex : (name,email) ,(username,UserId),(country,capital)
 */
public class HASH_MAP {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap();
		hm.put("america", "Washington");
		hm.put("India", "Delhi");
		hm.put("China", "Beijing");
		hm.put("Russia", "Moscow");
		
	/*
	 * //	System.out.println(hm);//{China=Beijing, america=Washington, India=Delhi, Russia=Moscow}
		
		System.out.println(hm.remove("USA")); //usa will remove
		System.out.println(hm.get("India")); // display the value.
		
		//hm.clear();
		
		System.out.println(hm.size());
		
		System.out.println(hm.replace("USA", "Detroit"));  //vales changed
		System.out.println(hm.containsKey("England")); //false
		
		while(!hm.isEmpty()) {
			System.out.print(hm.get(hm));
		}
		
	 */
		for(String i:hm.keySet()) {
			System.out.print(i+" ");
			System.out.println(hm.get(i));
		}
		
		
	}

}
