package EaglesProject;

import java.util.Scanner;

public class Project2Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Print enter 6 digit number");


        int number = input.nextInt();



        int digit1 = number %10;


        number = number/10;
        int digit2 = number%10;


        number = number/10;
        int digit3 =number%10;


        number = number/10;
        int digit4 =number%10;


        number = number/10;
        int digit5 =number%10;

        number = number/10;
        int digit6 = number%10;

        System.out.println(digit6+digit5+digit4+digit3+digit2+digit1);
        System.out.println(digit6*digit5*digit4*digit3*digit2*digit1);


    }
}
