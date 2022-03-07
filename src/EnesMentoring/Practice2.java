package EnesMentoring;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String password = input.nextLine().trim();

        boolean isLowerCase = !password.equals(password.toUpperCase());
        boolean isUpperCase = !password.equals(password.toLowerCase());

        boolean isPassword = isLowerCase&&isUpperCase;

        System.out.println();

        //abcDE---ABCDE

    }
}
