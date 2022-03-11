package IFStatement;

import java.util.Scanner;

public class IFTask1 {

    public static void main(String[] args) {
        /* get a number between 1 to 7 from user
        if the number is :
        1-> print out "It is Monday"
        2->           "It is Tuesday"
        ....
        7->            "It is Sunday"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1-7");

        int number = input.nextInt();

        if(number==1){
            System.out.println("It is monday");
        }

        if(number==2){
            System.out.println("It is Tuesday");
        }
        if(number==3){
            System.out.println("It is Wednesday");
        }
        if(number==4){
            System.out.println("It is Thursday");
        }
        if(number==5){
            System.out.println("It is Friday");
        }
        if(number==6){
            System.out.println("It is Saturday");
        }
        if(number==7){
            System.out.println("It is Sunday");
        }
        //if user enters other whole number , inform user that " There is no matching day for your entry

if (number <= 0 || number >=8){
    System.out.println("There is no matching day for your entry");
}
/*ask user to give you

        -number between 0-12
        -string as "am" or "pm"

        when the string is 'am' print out "good morning " , it is <number> am"

        when the string is 'pm' good afternoon" , it is number <number> pm"
 */








    }
}

