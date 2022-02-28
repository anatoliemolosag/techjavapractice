package IFStatement;

import java.util.Scanner;

public class IFTask2 {
    public static void main(String[] args) {


        /*ask user to give you

        -number between 0-12
        -string as "am" or "pm"

        when the string is 'am' print out "good morning " , it is <number> am"

        when the string is 'pm' good afternoon" , it is number <number> pm"
 */

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a between 0 and 12");

        int hour = input.nextInt();
        System.out.println("Please enter if is 'am' or 'pm'");
        input.nextLine();
        String amPm = input.nextLine();

        if( amPm.equalsIgnoreCase("am")){

            System.out.println("Good Morning. Is is "+hour+"am");
        }

        if (amPm.equalsIgnoreCase("pm")){
            System.out.println("Good afternoon. It is " + hour + "pm");
        }

    }

}
