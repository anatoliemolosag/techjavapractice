package HOMEWORK.Homework6;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int number = 0;
        int separateDigit = 0;
        int total = 0;

        number = num;
        while (number != 0)
        {
            separateDigit = number % 10;
            number /= 10;
            total = total + separateDigit * separateDigit * separateDigit;

        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
    }

/*
Write a Java program to check whether a given number is an armstrong number or not.
NOTE:
An Armstrong number, also known as narcissistic number, is a number that is equal to the sum of the cubes of its own digits.
For example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0
Look at examples below carefully.

Test Data :
Input a number: 153
Expected Output :153 is an Armstrong number

Input a number: 230
Expected Output : 230 is not an Armstrong number

 */