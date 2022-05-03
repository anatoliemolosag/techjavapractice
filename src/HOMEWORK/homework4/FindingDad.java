package HOMEWORK.homework4;

import java.util.Scanner;

public class FindingDad {
    public static void main(String[] args) {
        System.out.println("Enter a string value");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
// Please don't change anything on the lines above.

        if(str.contains("d")){
            System.out.println("dad");
        }


    }
}
/*
Using scanner the user is asked to provide the string value.
Print "dad" if the given string contains the "dad", BUT where the middle
 'a' char can be any char. Otherwise please do not print anything.

Please look at examples below CAREFULLY.
Example:
Input the year: testdadtest
Output dad
Input the year: testd7dtest
Output dad
Input the year: testdodtest
Output :dad
Input the year: testDudtest
Output :dad
input : ttttdlllld
Output :
 */
