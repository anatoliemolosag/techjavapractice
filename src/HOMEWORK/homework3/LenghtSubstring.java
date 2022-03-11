package HOMEWORK.homework1.homework3;

import java.util.Scanner;

public class LenghtSubstring {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a string value.");
        String string = s.next();
        // Please don't change anything on lines above.
        int lenght=string.length();
        System.out.println(lenght);
        boolean result = lenght%2 ==0;
        System.out.println(result);

        if (result){
              //substring
              String part1 = string.substring(1);
            System.out.println(part1);
        }else {
            //String part2 = string.substring(2 ,string.length()-2);
            String part2 = string.substring(string.length()/2-1 , string.length()/2+1);
            System.out.println(part2);

        }




    }
}
/*
Using scanner user is asked to enter one string value.
If this string length is odd number print middle 3 string from given value.
If the string length is even number print string without first letter.
 (You need to use if statement for this task)
Example 1:
Please enter the String value:
test
The output is:
est

Example 2:
Please enter the String value: Chicago
The output is:
ica
 */


