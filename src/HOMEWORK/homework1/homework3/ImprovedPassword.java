package homework3;

import java.util.Scanner;

public class ImprovedPassword {
    public static void main(String[] args) {
        System.out.println("Enter a password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        // Please don't change anything on lines above


        // checks if password has uppercase letter
        boolean isPasswordUpperCase = password.equals(password.toUpperCase());
// checks if password has lowercase letter
        boolean isPasswordLowerCase = password.equals(password.toLowerCase());
// variable to hold first character of password
        char firstChar = password.charAt(0);
// variable to hold last character of password
        char lastChar = password.charAt(password.length() - 1);
        // checks if first char is letter
        boolean isFirstCharLetter = ((firstChar >= 'A' && firstChar <= 'Z') || (firstChar >= 'a' && firstChar <= 'z'));
// checks if First char is Upper case
        boolean isFirstCharUpper = firstChar == password.toUpperCase().charAt(0);
// checks if Last char is Upper case
        boolean isLastCharUpper = lastChar == password.toUpperCase().charAt(password.length() - 1);
// checks if Last char is letter
        boolean isLastCharLetter = ((lastChar >= 'A' && lastChar <= 'Z') || (lastChar >= 'a' && lastChar <= 'z'));
        if (isPasswordUpperCase || isPasswordLowerCase) {
            System.out.println("Your password is not acceptable");
        } else if (isFirstCharLetter && isFirstCharUpper && !isLastCharLetter) {
            System.out.println("Your password is strong");
        } else if (!isFirstCharUpper && isLastCharUpper) {
            System.out.println("Your password should be improved");
        } else {
            System.out.println("Your password is not valid");



    }
}}
/*
User is asked to enter a password in main class.
We should write a program to check password by following steps

1 - > If the string doesn't have any upper case
      letter or any lower case letter print
      "Your password is not acceptable"

2 - > If the first character of the password is upper case letter and
      the last character of the password is not letter print
      "Your password is strong".

3 - > If first character of the password is lower case letter and
      the last character of the string is upper case print
      "Your password should be improved"

4 - > For all other conditions print
      "Your password is not valid"

For this task you should use if else statement.

This is the hardest task in this week's homework.

Good Luck !


 */
