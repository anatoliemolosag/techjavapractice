package Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class LastBiggestSort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to sort?  ");


        int storeNumbers = input.nextInt();
        int[] storing = new int[storeNumbers];
        int i ;




        for (i=0 ; i<storing.length;i++){
            System.out.println("Please enter a number");
            int numbers=input.nextInt();
            storing[i]= numbers;


        }



        Arrays.sort(storing);

        System.out.println(Arrays.toString(storing));

        int biggerNumber = storing[storeNumbers-1];
        int secondBiggerNumber =storing[storeNumbers-2];
        System.out.println(biggerNumber+" is the biggest number in store");
        System.out.println(secondBiggerNumber+ " is the second bigger number");


    }
}
