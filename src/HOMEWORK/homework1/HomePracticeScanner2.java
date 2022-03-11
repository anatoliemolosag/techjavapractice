package HOMEWORK.homework1;

import java.util.Scanner;

public class HomePracticeScanner2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name");

        char firstName  = scanner.nextLine().charAt(0);

        System.out.println("your first  initioal is " + firstName);


        System.out.println("Please enter your last name" );
        char lastname = scanner.nextLine().charAt(0);


        System.out.println("Your first initial of your last name is " + lastname);





    }
}
