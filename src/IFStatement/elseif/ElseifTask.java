package IFStatement;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {

        //when when you order 100$ or more, you will get 20% discount , if order is less that 100 , you will get 5% discount
        //calculate the final payment for each case and print
        Scanner input = new Scanner(System.in);
        System.out.println(" amount of order ?");
        double amount = input.nextDouble();

       // double order = 200;
        //double discount1 = amount*.20;
        //double discount2 = amount.05;

        if(amount >= 100){

            System.out.println(" Your payment " + (amount*.80));

        }
        else{
            System.out.println("Yout payment " + (amount *.95));

        }
    }
}
