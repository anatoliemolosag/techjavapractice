package InterviewQuestions;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,6,9,8,10};

        String a = "anna";
        String reversA="";
        for (int i = a.length()-1; i>=0 ; i--) {

            reversA+=a.charAt(i);



        }
        if(a.equals(reversA)){
            System.out.println("is a palindrome");
        }else {
            System.out.println("is not a palindrome");
        }

        System.out.println(reversA);



    }
}
