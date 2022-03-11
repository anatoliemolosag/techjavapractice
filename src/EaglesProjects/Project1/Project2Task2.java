package EaglesProject;

import java.util.Scanner;

public class Project2Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print out your total amount of dollars ");
        double amount = input.nextDouble();

       int balance =(int)(amount*100);



        int quarters = balance / 25;
        int remaining2 = balance %25;

        int dimes = remaining2 / 10;
        int remaining3 = remaining2 % 10;

        int nickels = remaining3 / 5;
        int pennies = remaining3 % 5;

        System.out.println(balance );
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);
        System.out.println(pennies);

    }}





        /*
              Scanner input = new Scanner(System.in);


        System.out.print("Enter current money");
        currentMoney= input.nextInt();
        totalCents= currentMoney * 100;

        Dollars= totalCents/100;
        remaining1= Dollars % 100;

        Quarters = remaining1/25;
        remaining2= Quarters % 25;

        Dimes= remaining2/10;
        remaining3= Dimes % 10;

        Nickels= remaining3/5;
        Pennies= Nickels % 5;

        System.out.print(+Dollars +Quarters +Dimes +Nickels +Pennies);

           */




