package EaglesProjects.Project5;

import java.util.Scanner;

public class task7Final {
    public static void main(String[] args) {


    Scanner scr = new Scanner(System.in);
        System.out.println("Please enter a string:");
    String str = scr.nextLine();
        for (int i = 0; i < str.length(); i++) {
        if ((str.charAt(i) >= 65) && (str.charAt(i) <= 90)) {
            System.out.print(" " + str.charAt(i));
        } else {
            System.out.print(str.charAt(i));
        }
    }
}
}

