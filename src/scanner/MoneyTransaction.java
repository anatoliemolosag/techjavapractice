package scanner;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 200;

        System.out.println("Please enter first paycheck amount");
        double firstCheck = input.nextDouble();


        System.out.println("Please enter second paycheck amount");
        double secondCheck = input.nextDouble();

        System.out.println("Please enter third paycheck amount");
        double thirdCheck = input.nextDouble();

        balance += (firstCheck + secondCheck + thirdCheck);

        System.out.println(balance);

        System.out.println("what is the phone price");
        double phone$ = input.nextDouble();

        System.out.println("what is the headphone price");
        double headphone$ = input.nextDouble();

        balance = balance- (phone$+headphone$);

        System.out.println("Your final balance is " + balance);
    }
}
