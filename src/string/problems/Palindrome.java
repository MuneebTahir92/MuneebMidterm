package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String test = "mom";
        String uturn = "";
        boolean yesOrNo = true;

        for(int i = test.length() - 1; i >= 0; i--){
            uturn += test.charAt(i);
        }

        for(int i = 0; i<test.length(); i++){
            if(test.charAt(i) != uturn.charAt(i)){
                yesOrNo = false;
            }
        }

        System.out.println("Is the test String a Palindrome?");

        if(yesOrNo){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
