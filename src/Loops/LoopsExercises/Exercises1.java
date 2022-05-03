package Loops.LoopsExercises;

import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        //create a program which prints even numbers in increasing order and decreasing order by 100
Scanner input = new Scanner(System.in);
        System.out.println("please enter a number to increase it by 2");
        int number = input.nextInt();
        for (int a = 0; a<=number; a+=2){

            if(a % 2 ==0){
                System.out.print(a+ " ");
            }
        }
        System.out.println("\nPlease enter a number to print in decrease by 2");
        number=input.nextInt();
        for(int b =number ; b>=0; b-=2){

            if(b % 2 !=0){
                System.out.print(b);

            }
        }
    }
}
