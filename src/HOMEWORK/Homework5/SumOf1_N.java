package HOMEWORK.Homework5;

import java.util.Scanner;

public class SumOf1_N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of terms of series :");
         int n= input.nextInt();


            double sum = 0.0;
            for ( double i = 1; i <= n; i++) {
                sum = sum + 1 / i;

            }
        System.out.println(sum);


        /*
        Write a program to calculate the sum of following series where n is input by user.
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
Please just print out the result.


Please look at the examples below carefully
EXAMPLES
Input  : 2
Output : 1.5  -> Because 1+1/2 =1.5

Input : 4
Output: 2.083333333333333 -> Because 1+1/2+/1/3+1/4 = 2.083333333333333

NOTE: Please use double variable.

         */
    }
}
