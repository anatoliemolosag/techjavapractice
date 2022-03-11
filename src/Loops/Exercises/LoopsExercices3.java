package Loops;

import java.util.Scanner;

public class LoopsExercices3 {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);

        int a = 0;
        int b = input.nextInt();
        if (a<=b){
        while (a<= b) {
            System.out.print(a + " , ");a+=2;

        }

    }else System.out.println("your number doesn't match");
}}
