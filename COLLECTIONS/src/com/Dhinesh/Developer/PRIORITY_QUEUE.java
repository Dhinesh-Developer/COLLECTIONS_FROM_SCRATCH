package com.Dhinesh.Developer;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 *  Priority Queue => A FIFO structure that serves elements
 *  					with the highest priorities first
 *  					before elements with lower priority.
 */
public class PRIORITY_QUEUE {

	public static void main(String[] args) {
		
		/*
		 * Queue<Double> q = new LinkedList<>();  //default in insertion order.
		q.offer(3.0);
		q.offer(2.5);
		q.offer(1.5);
		q.offer(4.5);
		q.offer(6.9);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		 */
		
		/*
		 * Queue<Double> q = new PriorityQueue<>();  // default in ascending order.
		q.offer(3.0);
		q.offer(2.5);
		q.offer(1.5);
		q.offer(4.5);
		q.offer(6.9);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		 */
		
		Queue<Double> q = new PriorityQueue<>(Collections.reverseOrder());  // default in ascending order.
		q.offer(3.0);
		q.offer(2.5);
		q.offer(1.5);
		q.offer(4.5);
		q.offer(6.9);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
