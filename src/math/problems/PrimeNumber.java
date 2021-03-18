package math.problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		List<Integer> list = new ArrayList<>();

		for(int c = 2; c < 1000000; c++){
			list = primeNumbers(c);
		}
		for(int d = 0; d < list.size(); d++){
			System.out.println(list.get(d));
		}

	}

	public static List<Integer> primeNumbers(int number) {
		List<Integer> prime = new ArrayList<>();

		for(int b = 2; b<number; b++){
			if(yesOrNo(b)){
				prime.add(b);
			}
		}
		return prime;
	}

	public static boolean yesOrNo(int number){
		for(int a = 2; a < number; a++){
			if(number % a == 0){
				return false;
			}
		}
		return true;
	}

}
