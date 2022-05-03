package Loops;

import java.util.Scanner;

public class DoWhile3StarTree {
    public static void main(String[] args) {
        /*
        ask user to give you an integer number and make a start tree for that many lines
        *
        **
        ***
        ****
        *****
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = input.nextInt();
        String str = "";

        do {
            str=str+"*";
            System.out.println(str);
            num--;
        }while(num>0);


    }
}
