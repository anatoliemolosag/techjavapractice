package Switch;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        ask user for favorite fruit

        check if you have user's fruit available

        --> strawberry , kiwi , orange , pinnaple , apple

        if you have user's favorite fruit, print we have your favorit fruit <fruit>,

        or enjoy othewise print 'Sorry we do not have <fruit>' in our store


       */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your favorite fruit");
        String fruit = input.nextLine().toLowerCase();

        switch (fruit){
            case "strawberry":
                System.out.println("we have your favorit fruit " + fruit + " enjoy");
                break;
            case "pinnaple":
                System.out.println("we have your favorit fruit " + fruit + " enjoy");
            case "fruit":
                System.out.println("we have your favorit fruit " + fruit + " enjoy");
            case "apple":
                System.out.println("we have your favorit fruit " + fruit + " enjoy");
            case "kiwi":
                System.out.println("we have your favorit fruit " + fruit + " enjoy");




            default:
                System.out.println("Sorry we dont have your favorit fruit");

        }


    }
}
