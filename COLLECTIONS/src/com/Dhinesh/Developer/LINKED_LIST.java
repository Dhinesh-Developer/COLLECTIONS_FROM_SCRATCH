package com.Dhinesh.Developer;

import java.util.LinkedList;

/* extends the AbstractSequentialList   implements List<E> ,Deque<E> ,cloneable,java.io.Serializable.
 * LINKED_LIST => Represent in the Node ,Each Node contains the address and the data.
 * 				  Time complexity => O(1) 
 * 
 * 
 * linkedList => stores Nodes in 2 parts(data+address)
 * 					Nodes are in the non-consecutive memory locations
 * 					Elements are linked using pointers.
 * 
 * 					Single Linked List.
 * 					[data | Address] -> [data | address] -> [data | address]
 * 
 * 					Doubly Linked List.
 * 					[address | data | address] <-> [address | data | address]
 * 
 * 
 * 			Advantages. 
 * 			1.Dynamic data structure (allocations needed memory while running.
 * 			2.Insertion and deletion of Nodes is easy .O(1)
 * 			3.No/Low memory waste.
 */
public class LINKED_LIST {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<String>();
		/*
		 * ll.push("A");
		ll.push("B");
		ll.push("C");
		ll.push("D");
		
		while(!ll.isEmpty()) {
			System.out.print(ll.pop()+" "); //D C B A 
		}
		 */
		
		ll.offer("A");
		ll.offer("B");
		ll.offer("C");
		ll.offer("D");
		
		while(!ll.isEmpty()) {
			System.out.print(ll.pop()+" "); //A B C D
		}
		
		
//		ll.add(4,"E");
//		System.out.print(ll);
		
		System.out.println(ll.indexOf("A")); //-1
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		ll.addFirst("O");
		ll.addLast("G");
		
		String first = ll.removeFirst();
		String last = ll.removeLast();
		
		while(!ll.isEmpty()) {
			System.out.print(ll.pop()+" ");
		}
		
		ll.add("Ram");
		ll.add("raj");
		ll.add("ravi");
		
		System.out.println(ll);  //[Ram, raj, ravi]
		
		ll.remove();
		System.out.println(ll);  //[raj, ravi]
		
		ll.peek();
		System.out.println(ll.peek());  //raj
		
		while(!ll.isEmpty()) {
			System.out.print(ll.remove()+" ");
		}
	}

}
