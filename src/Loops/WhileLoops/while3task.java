package Loops;

import java.util.Scanner;

public class while3task {
    public static void main(String[] args) {
        //get a number from user and find the of given number
        //10 --> 1,2,3,4,5
        //print those divisors
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int divisor =1;

        while(divisor<=number){
            if(number % divisor == 0){
                System.out.println(divisor + " is a divisor " + number);
            }
            divisor++;}
        }
    }

