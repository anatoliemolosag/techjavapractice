package EaglesProjects.Project5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10");
        int number = input.nextInt();


        for(int i =1; i<=number ; i++){

            for(int j=1;j<=i;j++ ){

                System.out.print(i);

            }

            System.out.println();

        }
    }
}
