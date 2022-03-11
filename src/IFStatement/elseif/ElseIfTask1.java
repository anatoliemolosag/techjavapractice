package IFStatement;

import java.util.Scanner;

public class ElseIfTask1 {
    public static void main(String[] args) {


        /*ask user to give you a whole number
        if the number is greater than zero " it is zero "
        if the number is less than zero " it is negative number"
        if the number is zero " it is zero"
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number");

        int number = input.nextInt();

        if(number>0){
            System.out.println("it's a positive");

        }

        else if (number<0){
            System.out.println("it's a negative");
        }
        else if (number==0){
            System.out.println("it is zero");
        }

    }
}
