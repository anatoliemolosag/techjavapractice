package Loops;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        /*
        ask user to give you 2 integer numbers
        -find the sum of numbers between those tho given numbers
        num1=6,num2 =9 , 6+7+8+9=30
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = input.nextInt();
        System.out.println("Please enter second number");
        int num2 = input.nextInt();
        int sum = 0;

        do{
            sum=sum+num1;
            num1++;
        }while(num1<=num2);
        System.out.println(sum);

        }

    }

