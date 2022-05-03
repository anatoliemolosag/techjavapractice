package Loops.Exercises;

import java.util.Scanner;

public class StarTask {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.println("Do you want a row of stars ? (y/n)?");
            String YesNo = input.nextLine();
            System.out.println("Please enter a number");
            int number = input.nextInt();
            int n =0 ;

            while (n<number){
                System.out.print(" * ");
                n++;

            }

    }
}
