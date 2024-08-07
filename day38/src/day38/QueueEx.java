package day38;

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();
		// 1.add
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");
		
		System.out.println(q);
		// 2.element
		System.out.println("element: "+q.element());
		 
		// 3.remove
		System.out.println("remove: "+q.remove());
		System.out.println(q);
		
		// 4.offer(e)
		q.offer("peach");
		System.out.println(q);
		
		// 5.peek()
		System.out.println("peek: "+q.peek());
		System.out.println(q);
		
		// 6.poll()
		System.out.println("pool: "+q.poll());
	    System.out.println(q);
	}

}
