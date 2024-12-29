package com.Dhinesh.Developer;
/*
 * Hash Table => A data structure that stores the unique keys to value ex.<Integer,String>
 * 					Each key/value pair is known as Entry.
 * 					FAST insertion,;look up,deletion of keys/value pairs.
 * 					Not ideal for small data sets, great with large data sets.
 * 
 * Hashing => takes a key and computes an integer (formula will very based on key & data type)
 * 		      In a HashTable , we use the hash % capacity to calculate an index number
 * 
 * bucket => an indexed storage location for one or more Entries.
 * 			can store multiple Entries in case of a collision (linked similarly a linked list.)	
 */ 
import java.util.Hashtable;

public class HASH_TABLE {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>(10);
		ht.put(101, "spongebob");
		ht.put(123, "patrix");
		ht.put(321, "sandy");
		ht.put(555, "squidward");
		ht.put(777, "gary");
		
		System.out.println(ht.get(101)); //spongebob
		
		for(Integer key: ht.keySet()) {
			System.out.println(key+ "\t" +ht.get(key));
		}
		
		ht.remove(777);
		
		
		for(Integer key: ht.keySet()) {
			System.out.println(key.hashCode() % 10 + "\t" + key +"\t" +ht.get(key));
		}
		
		
		
		Hashtable<String, String> h = new Hashtable<>(10);
		h.put("101", "spongebob");
		h.put("123", "patrix");
		h.put("321", "sandy");
		h.put("555", "squidward");
		h.put("555", "gary");
		
		for(Integer key: ht.keySet()) {
			System.out.println(key.hashCode() % 10 + "\t" + key +"\t" +ht.get(key));
		}
		
	}
/*
777	gary
555	squidward
123	patrix
321	sandy
101	spongebob
 * 
 * 
 * 
 * foe int , string
5	555	squidward
3	123	patrix
1	321	sandy
1	101	spongebob

// for String,String
5	555	squidward
3	123	patrix
1	321	sandy
1	101	spongebob
 */
}
