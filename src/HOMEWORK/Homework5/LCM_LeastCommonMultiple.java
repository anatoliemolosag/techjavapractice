package HOMEWORK.Homework5;

import java.util.Scanner;

public class LCM_LeastCommonMultiple {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number 1");
        int number1 = s.nextInt();
        System.out.println("Enter the number 2");
        int number2 = s.nextInt();
        // number1 and number2 are given above. Please find LCM for these two numbers.

        int lcm;
                lcm=(number1>number2) ? number1 : number2;

        while(true) {
            if( lcm % number1 == 0 && lcm % number2 == 0 ) {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }





        /*
        Please find the LCM(least common multiple) of two given integers.

        NOTE:  The LCM of two integers is the smallest positive integer
        that is perfectly divisible by both the numbers (without a remainder).
        Please look at example carefully.
                EXAMPLES:
        Input 1: 72
        Input 2: 120
        Output : 360

        Input 1: 24
        Input 2: 60
        Output : 120
         */
    }
}
