package Loops;

import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        // take a string value from user and print out each letter sepparated by comma , for given string

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a letter");

        String letter = input.nextLine();

//        System.out.println(letter.charAt(0));
//        System.out.println(letter.charAt(1));
//        System.out.println(letter.charAt(2));
//        System.out.println(letter.charAt(letter.length()-1));

       int index = 0;

        while (index < letter.length()){
            System.out.print(letter.charAt(index) + ", ");
            index++;
        }
    }
}
