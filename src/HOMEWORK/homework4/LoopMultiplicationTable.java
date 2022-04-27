package HOMEWORK.homework4;

import java.util.Scanner;

public class LoopMultiplicationTable {
    public static void main(String[] args) {

        System.out.println("Please enter an integer number");
        int num = new Scanner(System.in).nextInt();

        // Please don't change anything on the lines above.
        // Print the multiplication table for num variable.

        for( int i =5 ; i==5 ; i++){

            for (int k=1 ; k<=10 ;k++ ){
                int sum = num*k;

                System.out.println(num+" * " + k + " = " + sum);
            }

        }





    }

}
/*
User is asked to enter an integer number using scanner.
Print multiplication table of given number.
Please make sure your output exactly look like given example below.
EXAMPLE:

Input number: 5  // User gives this input number.

5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50

 */