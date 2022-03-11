package Loops;

import java.util.Scanner;

public class HomePracticeDoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int number;
        do{
            System.out.println("enter a number between 1 - 50 to be checked");
            number= input.nextInt();
        }while (number<1 == number <50);
        System.out.println(number + " is between 1 and 50");
    }}

