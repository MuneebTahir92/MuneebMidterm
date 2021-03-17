package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<String> list = new ArrayList<String>();

		list.add("muneeb");
		list.add("ali");
		list.add("chetan");
		list.add("uddin");
		list.add("ahmed");
		list.add("barry");
		list.add("monkey");
		list.remove("monkey");

		Iterator<String> it = list.listIterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(String names:list){
			System.out.println(names);
		}




	

	}

}
