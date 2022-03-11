package Loops;

import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        /*
        get a number from user
        -create a multiplication table from 1 to 10 fo that number
         ex: 3 --> 3*1 =3
         3*2 = 6
         3*3=9
         ...
         3*10=30

         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");

        int number = input.nextInt();
        int a = 1 ;

        while(a<11){
            System.out.println(number + "*" + a + "=" + number *a);
            a++;
        }






    }
}
