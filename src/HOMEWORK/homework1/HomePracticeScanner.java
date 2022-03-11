package HOMEWORK.homework1;

import java.util.Scanner;

public class HomePracticeScanner {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println(" Please enter first contribution of $ ");
        double firstAmount = scanner.nextDouble();

        System.out.println("Please enter secont contribution");
        double secondAmount = scanner.nextDouble();

        double totalAmount = firstAmount+secondAmount;
        System.out.println("Total amount of money you have is " + totalAmount);

        double requireAmount = 100000;
        boolean approvalResult = (firstAmount+secondAmount) >= requireAmount;

        System.out.println("Are you approved for contribution ? " + approvalResult);

        System.out.println("Do you want to add contribution?");
        double thirdAmount = scanner.nextDouble();
        Boolean approvalResult2= (firstAmount+secondAmount+thirdAmount)>=requireAmount;
        System.out.println("Second attempt to contribution ");
        System.out.println("Are you approved for contribution? " + approvalResult2);









    }
}
