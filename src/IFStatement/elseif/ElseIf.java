package IFStatement;

import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args) {
        /*
        Let user to pick a number between 0-20
        if the number is between 0 and 5 --> print your range is 0 to 5
        if the number is between 6 and 10 --> print your range is 6 to 10
        if the number is between 11 and 15 --> print your range is 11 to 15
        if the number is between 16 and 20 --> print your range is 16 to 20
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between o-20");
        int num = input.nextInt();

        if(num >= 0 && num <=5){
            System.out.println("your range is 0-5");
        }

        else if(num >=6 && num <=10){
            System.out.println("your range is 6-10");
        }

        else if(num >=11 && num <=15){
            System.out.println("your range is 11-15");
        }

        else if(num >=16 && num <=20){
            System.out.println("your range is 16-20");
        }
        else {
            System.out.println("your number is not in the range");
        }
    }

}
