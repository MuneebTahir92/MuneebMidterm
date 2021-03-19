package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String one = "evil";
        String two = "vile";

        if (sameLength(one, two)) {
            System.out.println("These two strings are anagrams");
        } else {
            System.out.println("These two strings are NOT anagrams");
        }

    }

    public static boolean sameLength(String one, String two) {

        if (one.length() != two.length()) {
            return false;
        }

            char arrayOne [] = one.toCharArray();
            char arrayTwo [] = two.toCharArray();

            Arrays.sort(arrayOne);
            Arrays.sort(arrayTwo);

            for (int i = 0; i < one.length(); i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    return false;
                }
            }
            return true;
    }
}
