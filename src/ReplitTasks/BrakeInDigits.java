package ReplitTasks;

import java.util.Scanner;

public class BrakeInDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // You have already given 5 digit integer number below
        // You should print out individual digits from this variable below.
        // You should not create any other variable named fiveDigitNumber



        int number = input.nextInt();


        int digit1 = number %10;


        number = number/10;
        int digit2 = number%10;


        number = number/10;
        int digit3 =number%10;


        number = number/10;
        int digit4 =number%10;


        number = number/10;
        int digit5 =number%10;

        System.out.println(digit5);
        System.out.println(digit4);
        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit1);


    }
}
/*You should create a function in the main class that converts given five digit integer in to individual digits.
The values for all 2 test will automatically be inserted on the line beginning 'int fiveDigitNumber = (value).
For this exercise convert the given five digit number to individual digits from beginning to end  with a single universal
equation for all tests.
// There has to be 5 print outs total for every digit from beginning to end.
For example:
Test Data Input five non-negative digits: 54321
Expected output is : 5
                     4
                     3
                     2
                     1

Test Data Input five non-negative digits: 45678
       Expected output is : 4
                            5
                            6
                            7
                            8

 */
