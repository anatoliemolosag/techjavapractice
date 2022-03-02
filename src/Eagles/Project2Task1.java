package Eagles;

import java.util.Scanner;

public class Project2Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your amount of quartes");
        double quarter = input.nextDouble();

        System.out.println("Please enter your amount of Dimes");
        double dimes = input.nextDouble();

        System.out.println("Please enter your amount of Nickels");
        double nickles = input.nextDouble();

        System.out.println("Please enter your amount of Pennies");
        double Pennies = input.nextDouble();

        double quarterToDollar = .25;
        double dimesToDolar = .10;
        double nickelToDollar = .05 ;
        double penniesToDolar = .01;

        double totalAmount = (quarter*quarterToDollar)+ (dimes*dimesToDolar) + (nickles*nickelToDollar) + (Pennies*penniesToDolar);
        System.out.println(totalAmount+"$ TotalAmount ");


    }

}
