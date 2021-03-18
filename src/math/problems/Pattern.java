package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 */

		for(int a = 100; a >= 90; a--){
			System.out.print(a + " ");
		}

		for(int b = 88; b >= 70; b -= 2){
			System.out.print(b + " ");
		}

		for(int c = 67; c >= 40; c -= 3){
			System.out.print(c + " ");
		}

		for(int d = 36; d >= 0; d -= 4){
			System.out.print(d + " ");
		}
		


	}
}
