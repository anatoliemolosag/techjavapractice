package EaglesProjects.Project5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int num = scn.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}