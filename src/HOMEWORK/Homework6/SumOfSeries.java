package HOMEWORK.Homework6;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int userNumber= input.nextInt();

        int sum = 0;

        int j = 1;
        for (int i = 0; i < userNumber ; i++)
        {
            sum = sum + j;
            j = (j * 10) + 1;
            System.out.println(j);
        }
        System.out.println(sum);
    }
}
/*
Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
Here the number n is coming from user.
Therefore, if the user gives number 3
you should find sum of 1 + 11 + 111.
Please, look at the example below, carefully.


Test Data :
Input the number of terms : 5
Expected Output:
12345  (Because the sum of 1 + 11 + 111 + 1111 + 11111= 12345)
 */
