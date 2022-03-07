package ReplitTasks;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please create a new and valid password.");
        String password = scanner.nextLine();
        // Please don't change anything on lines above.
        // Please find out whether or not the password is valid.
        boolean isUpper = password.toLowerCase() != password;
        boolean isLower = password.toUpperCase() != password;
        System.out.println(isLower&&isUpper);

    }}
/*The value of the password has already been assigned using scanner.

We asked the user to create a new and valid password.
The valid password must contain at least one upper case and at least one lower case letter.
Print true when the password is valid, if not print false.

Example:

Input: password
Output: false

Input: Password
Output: true





 */