package string;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {


        String myName = "David";
        System.out.println(myName);

        // creating a new scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your last name ");

        String lastName = input.nextLine();// this line is letting user to enter any text value

        System.out.println("ai fute-o pe rusoaica " + lastName + "?");

        String Confirm = input.nextLine();

        System.out.println(" Congratulation Toni if " + Confirm + ", de cate ori ai fute-o?");

        int multe = input.nextInt();

        System.out.println("te ajuta si comin " +multe+ "felicitari");



    }
}
