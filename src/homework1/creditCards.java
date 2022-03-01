package homework1;

import java.util.Scanner;

public class creditCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("what is your first credit card limit");
        double firstCC = input.nextDouble();

        System.out.println("what is your second credit card limit");
        double secondCC = input.nextDouble();

        System.out.println("what is iphone price?");

        double iphone$ = input.nextDouble();

        double totalCC = firstCC + secondCC;

        System.out.println("your total amount of money is " + totalCC);

        double moneyRemain = totalCC - iphone$;

        System.out.println("your iphone price is " + iphone$);
        System.out.println("your balance is " + moneyRemain);

        boolean afford = iphone$ <= totalCC;

        System.out.println("can you afford this iphone ?" + afford);






    }
}
