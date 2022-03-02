package IFStatement;

import java.util.Scanner;

public class ElseTask1 {
    //ask user to enter his/her zipcode , and find out
    //if zipcode is a even number or odd number
    //if it is even :" your zipcode is even number"
    //if it's odd : " your zipcode is odd number"
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your zipcode");
        int zipcode = input.nextInt();

        if (zipcode % 2 == 0) {
            System.out.println("Youre zipcode is even number");
        }
        else{
            System.out.println("Your zipcode is odd number");
        }


    }
}