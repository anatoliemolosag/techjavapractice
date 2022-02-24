package scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        // next()

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter where do you live");

        String city = sc.next();//when yiu use next() , it will take only single word from the user entry , till first space

        System.out.println("You are living in "+city);

        System.out.println("I am loosing some part of the city name , please enter again");

        sc = new Scanner(System.in);
        //sc.nextLine()
        city = sc.nextLine();

        System.out.println("you are living in " +city+ " correct?");

        System.out.println("What is your zip code?");

        int zipcode = sc.nextInt();
        System.out.println("zip code is " + zipcode);

        //take single character from string
        sc.nextLine();
        System.out.println("please enter your first name ");

        char firstLetter = sc.nextLine().charAt(0);

        System.out.println("your first initial " + firstLetter);
        System.out.println("Please enter your first name again");

        char secondLetter = sc.nextLine().charAt(1);

        System.out.println("your second initial " + secondLetter);







    }
}
