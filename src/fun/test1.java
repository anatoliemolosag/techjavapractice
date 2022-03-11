package fun;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Is Anna busy?true/false");
        boolean anaAnswer = input.nextBoolean();

        if(anaAnswer){
            System.out.println("Why Anna doesn't reply to mess?");
            System.out.println("Anna require to answer to questions provided by the colleague");
            System.out.println("Is Anna going to make time for her classmate in the future?true/false?");

            if (anaAnswer== input.nextBoolean()){


                System.out.println("Glad to hear that !!!");
                System.out.println("Remember , we have an agreement!!!");

            }else{
                System.out.println("I'm sorry,you have to adjust your schedule and include in schedule little time for friends");
                System.out.println("Have a nice day!");
            }
        }else{
            System.out.println("I'm sorry");
            System.out.println("Anna needs to make time for people  who have questions for her!");
            System.out.println("Please adjust your schedule");

        }


    }
}
