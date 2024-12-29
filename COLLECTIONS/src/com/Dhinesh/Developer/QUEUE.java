package com.Dhinesh.Developer;

import java.util.LinkedList;
import java.util.Queue;

/*
 * QUEUE => FIFO data structure . First -in first out (ex.A line of people)
 * 			A collection designed for holding elements prior to processing
 * 			Linear data Structure.
 * 
 * 			add => enqueue , offer()
 * 			remove => dequeue, poll()
 * 
 * uses of queue.
 * 			
 * 		1.Keyboard Buffer(letters should appear on the screen in the order they are present)
 * 		2.Printer Queue (print should be completed in order)
 * 		3.used in linkedLists, PriorityQueue, Breadth-first search
 */
public class QUEUE {

	public static void main(String[] args) {
		
	//	Queue<String> q = new Queue<String>();  //cannot initiate the Queue ,because it is interface
		
		Queue<String> q = new LinkedList<String>();
		
		q.offer("raj");
		q.offer("ram");
		q.offer("ravi");
		q.offer("ragu");
		
		System.out.println(q.peek()); //raj
		System.out.println(q);  //[raj, ram, ravi, ragu]
		
		q.poll();
		System.out.println(q);  //[ram, ravi, ragu]
		
		// if the element not present in the queue
		q.element(); // NoSuchElementException
		q.poll();  // []  empty list.
		
		System.out.println(q.isEmpty());  //false.
		
		System.out.println(q.contains("raj"));  //false
		System.out.println(q.contains("ram"));  //true
		
		
 	}

}
