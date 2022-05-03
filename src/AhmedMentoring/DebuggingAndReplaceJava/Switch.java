package AhmedMentoring.DebuggingAndReplaceJava;

import java.util.Scanner;

public class Switch {

    /*
    POSSIBLE INTERVIEW QUESTIONS

    It is not likely to have a directly questions about switch

    QUESTIONS: AHMET , in what condition should i use switch or if conditions?

    NOTE: Whenever you have limited options , use switch statements


     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int options = input.nextInt();


        switch (options){
            case 1:
                System.out.println("you are talking to Ahmed");
                break;

            case 2:
                System.out.println("you are talking to Mehmet");
                break;

            case 3 :
                System.out.println("you are talking to Beck");
                break;

            case 4:
                System.out.println("you are talking to Rima");
                break;

            case 5:
                System.out.println("you are talking to Ana");
                break;


        }
    }


}
