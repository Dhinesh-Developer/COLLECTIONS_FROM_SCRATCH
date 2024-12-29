package com.Dhinesh.Developer;
/*
 * stack = LIFO data structure . LAsst in last out
 *         stores object into a sort of "vertical tower"
 *         push() -> to add to the top
 *         pop() -> to remove from the top.
 *         peek() -> returns the peek element
 *         Empty() -> returns the boolean -> true/false
 *         search() ->  returns the index position
 *         
 *         
 * uses of stack?
 * 		1. undo/ redo features in text editors
 * 		2.moving back/forward through browser history
 * 		3.backtracking algo (maze, file directories)
 * 		4.calling functions(call stack)        
 */

import java.util.Stack;

public class STACK {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		System.out.println(s.empty()); //true
		s.push("Minecraft");
		s.push("Shyrin");
		s.push("DOOM");
		s.push("BorderLands");
		
		for(String x: s) {
			System.out.print(x+" "); //Minecraft Shyrin DOOM BorderLands 
		}
		System.out.println();
		
		s.pop();  // if the stack is empty , then we try to pop the element -> then EmptyStackException.
		System.out.println(s);  //[Minecraft, Shyrin, DOOM]
		
		String myFavGame = s.pop();
		System.out.println(myFavGame);  //DOOM
		
		System.out.println(s.peek());  //Shyrin
		
		
		System.out.println(s.search("Minecraft"));  //2   like top to bottom search
		
		
//		for(int i=0;i<100000;i++) {  //out of memory error.
//			s.push("Fallout76");
//		}
	}

}
