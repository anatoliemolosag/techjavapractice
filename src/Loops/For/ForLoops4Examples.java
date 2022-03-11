package Loops.For;

import java.util.Scanner;

public class ForLoops4 {
    public static void main(String[] args) {
        //print each letter from given string

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letters");

        String letter = input.nextLine();

        letter=letter.replace(" ","");
        for( int i =0  ; i < letter.length()   ; i++  ){
            System.out.println(i);//0,1,2,3,4
        }

        //===============================================
        //print out letters 'e'
        for(int i =0; i<letter.length()  ;i++ ){
            if(letter.charAt(i)=='e'){
                System.out.println(letter.charAt(i));//printing all letters 'e' from the string //result e
            }
        }
    //count and print number of letter 't' and 'T'
        //there are ...letter's 't' in the given string

        String t =

    }
}
