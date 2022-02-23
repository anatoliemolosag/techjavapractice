package string;

import java.util.Scanner;

public class ScannerPractice1 {

    public static void main(String[] args) {
        //you want to take age of user and tell user that she/he was ... years old 10 years ago


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");

        int age = scanner.nextInt();
        System.out.println("your current age is: "+ age);
        System.out.println("Your age was " + ( age - 10 ) + ", 10 years ago ");

    }
}
