package EnesMentoring.Apps;


import java.text.DecimalFormat;
import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {


         String[] product = {"Milk", "Bread", "Butter", "Chocolate", "Nutella",};

        double[] price =   {2.99, 3.99, 5.99, 7.99, 6.99};

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

         Scanner input = new Scanner(System.in);

         System.out.println("**********************************");
         System.out.println("");
         System.out.println("Welcome to Batch12 Vending Machine");
         System.out.println("");
         System.out.println("**********************************");
         System.out.println("");

        System.out.println("Please choose an item");
         String item = input.nextLine().trim().toLowerCase();

        boolean flag = false;

        for (int i = 0; i < product.length; i++) {

        if (item.equals(product[i].trim().toLowerCase())) {
            flag = true;
         System.out.println("Price for " + product[i] + " is $" + price[i]);

           System.out.println("Do you want to buy it. Yes/No");
           String yesOrNo = input.nextLine().trim().toLowerCase();

          if (yesOrNo.toLowerCase().trim().equals("yes")) {

           System.out.println("Please enter the money");
           double money = input.nextDouble();

           if (money >= price[i]) {
               money -= price[i];
             System.out.println(product[i] + " has been purchased");
             System.out.println("Your change is " + decimalFormat.format(money)+"$");
              System.out.println("Have a great day");
           } else {
                System.out.println(money + " is not enough for purchase");
             }

           } else {
               System.out.println("No item purchased");
                  System.out.println("Have a great day");
           }

         }

            }

         if (!flag) {
              System.out.println("Please enter valid item");
          }

    }
}
