package HOMEWORK.homework4;

import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 = s.next();

        System.out.println("Enter string 2");
        String str2 = s.next();
        // Please don't change anything on the lines above.

        int lengthStr1 = str1.length();
        int lengthstr2 = str2.length();
        if (lengthStr1 == lengthstr2) {
            System.out.println(str1.concat(str2));
        }
        if (lengthStr1 < lengthstr2) {
            int difLenth1 = (lengthstr2 - lengthStr1);
            String newStr2 = str2.substring(0, lengthStr1);
            System.out.println(str1.concat(newStr2));
        }
        if (lengthStr1 > lengthstr2) {
            int difLenth2 = (lengthStr1 - lengthstr2);
            String newStr1 = str1.substring(0, lengthstr2);
            System.out.println(newStr1.concat(str2));
        }



    }
}
/*
User will enter two string values using scanner.
If both string length is same, concatenate them together. Then, print the result.
If both string length is not same, omit the last chars from the longer string so it will be the same
length as the shorter string. After making both strings the same length,
concatenate them and print the result.

EXAMPLE-1:
String 1: "Cell"
String 2: "Phone"
Output: "CellPhon"
EXAMPLE-2:
String 1: "Cable"
String 2: "Mic"
Output: "CabMic"


 */
