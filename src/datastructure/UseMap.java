package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		List<String> toyotaModels = new ArrayList<String>();
		toyotaModels.add("camry");
		toyotaModels.add("corolla");
		toyotaModels.add("sienna");

		List<String> hondaModels = new ArrayList<String>();
		hondaModels.add("accord");
		hondaModels.add("civic");
		hondaModels.add("odyssey");

		Map<String, List<String>> cars = new HashMap<String, List<String>>();
		cars.put("Toyota Models", toyotaModels);
		cars.put("Honda Models", hondaModels);

		ListIterator<String, List<String>> it = cars.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(Map.Entry<String, List<String>> entry: cars.entrySet()){
			System.out.println(entry.getKey() + " ----> " + entry.getValue());
		}





	}

}
