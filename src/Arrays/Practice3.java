package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what is the amount of money you want to store?");

        int amount = input.nextInt();

        int money[]= new int[amount];

        for (int i=0; i<amount ;i++){
            System.out.println("please enter the amount ");
            amount=input.nextInt();
            money[i]=amount;

        }
        System.out.println(Arrays.toString(money));
    }
}
