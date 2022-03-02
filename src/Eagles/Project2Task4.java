package Eagles;

import java.util.Scanner;

public class Project2Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 digit number ");

        int number= input.nextInt();

        int digit1 = number %10;


        number = number/10;
        int digit2 = number%10;


        number = number/10;
        int digit3 =number%10;


        number = number/10;
        int digit4 =number%10;


        number = number/10;
        int digit5 =number%10;

        System.out.println(""+digit1+""+digit2+""+digit3+""+digit4+""+digit5);






    }
}
