package Switch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        ask user to give us  numbers between 1-7

        when the number is 1 : > Monday
        when the number is 2 : > Tuesday
        .....

        when the number is 3 : > Sunday
        */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number between 1-7");
        byte number= input.nextByte();
        final byte num = 8;


        switch (number){
            case num:
                System.out.println("extra day");


            case 1 :
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("there is no mathching number");
                break;


                ///data type for switch ---> int , byte , short , char , String






        }



    }
}
