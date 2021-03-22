package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static int factorial(int i) {
        if(i == 1){
            return 1;
        }else{
            return i * factorial(i - 1);
        }
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */


        System.out.println(factorial(5));
    }




}
