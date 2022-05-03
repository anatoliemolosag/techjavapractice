package HOMEWORK.Homework6;

import java.util.Scanner;

public class ReplaceWithA {
    public static void main(String[] args) {


        System.out.println("Enter a string value");
        Scanner s = new Scanner(System.in);

        String str = s.next();

        String a= "a";
        for(int i=1;i<=str.length();i++){

            System.out.println(a+str.substring(i));
            a=a+"a";

    }

}}
/*
Using the scanner user is asked to provide a string value.
Then replace all the char of the String with 'a' using loop and PRINT IN EVERY STEP.
Look at example below carefully

For example:
Input: Success
Output:
"auccess"
"aaccess"
“aaacess”
"aaaaess"
"aaaaass"
"aaaaaas"
"aaaaaaa"
“aaaaaaa”
 */
