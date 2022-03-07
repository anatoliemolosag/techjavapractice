package homework1;

import java.util.Scanner;

public class HomePracticeMoneyTransaction2 {




        public static void main(String[] args) {
            // here is wrong all int should change to double, cz its money
            int account = 200;
            Scanner sc = new Scanner(System.in);

            System.out.println("Whats amount of your 1st check?");
            int firstCheck = sc.nextInt();
            int balance = account + firstCheck;
            System.out.println("Your balance is " + balance);

            System.out.println("Whats amount of your 2nd check?");
            int secondCheck = sc.nextInt();
            balance +=secondCheck;
            System.out.println("Your balance is " + balance);

            System.out.println("Whats amount of your 3d check?");
            int thirdCheck = sc.nextInt();
            balance += thirdCheck;
            System.out.println("Your balance is " + balance);

            System.out.println("How much is your phone cost?");
            int phone = sc.nextInt();
            balance -= phone;
            System.out.println("Your balance is " + balance);

            System.out.println("How much is your headphone cost?");
            int headphone = sc.nextInt();
            balance -= headphone;
            System.out.println("Your balance is " + balance);

    }
}
