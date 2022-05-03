package EaglesProjects.Project5;

import java.util.Scanner;

public class task3PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = input.nextInt();

        boolean notPrime = false;

        if (number >= 2){
            for (int i = 2; i<number; i++){
                if(number%i==0){
                    System.out.println("not prime");
                    notPrime = true;
                    break;
                }

            } if (!notPrime){
                System.out.println("it's prime");
            }
        }else System.out.println("not prime");



    }
}
