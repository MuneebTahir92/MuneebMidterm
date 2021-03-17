package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();
		queue.add("muneeb");
		queue.add("ali");
		queue.add("chetan");
		queue.add("uddin");
		queue.add("ahmed");
		queue.add("barry");
		queue.add("monkey");

		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.peek());

		for(String names:queue){
			System.out.println(names);
		}

		Iterator it = queue.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
