package HOMEWORK.Homework5;

import java.util.Scanner;

public class MirrorEdges_prof {
    public static void main(String[] args) {



        Scanner input =new Scanner(System.in);
        System.out.println("enter a string value");
        String str = input.nextLine();


        String mirrorEdge = "";
        for(int i=0, k=str.length()-1; i<str.length();i++,k--){

            if(str.charAt(i)==str.charAt(k)){
                    mirrorEdge+=str.charAt(i);
                }


        }
        System.out.println(mirrorEdge);

    }
}
/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order.

For example, the string "abXYZba" has the mirror end "ab". -> Because ab is in the begining also at the end.

Examples:

Input : abca Output: a

Input : aba Output: aba

Input : eerqwertyree Output: eer
 */
