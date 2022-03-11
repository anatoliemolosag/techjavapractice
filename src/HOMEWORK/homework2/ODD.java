package HOMEWORK.homework1.homework2;

import java.util.Scanner;

public class ODD {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a string value.");
            String string = sc.nextLine();

            String result = string.replace(" " , "");
            System.out.println(result);
            string=result;
            double lenght =  string.length();
            System.out.println(lenght);
            boolean result1  = lenght%2 !=0;
            System.out.println(result1);




            // Please do not change anything on lines above.
            //The value of the string has already been assigned using the scanner.
            //
            //Please remove all the spaces (" ") from the given string. After removing the spaces from the string,
            //if the string's length is odd print true, otherwise print false.
            //
            //Example:
            //Input : I love coding
            //Output: true
            //
            //Input : one two
            //Output: false


    }
}
