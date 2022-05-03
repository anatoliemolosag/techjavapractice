package EaglesProjects.Project5;

import java.util.Scanner;

public class Task1ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence");

        String user = input.nextLine();

        String reversed ="";

        for(int i= user.length()-1; i>=0;i--){
            reversed=reversed+user.charAt(i);

        }
        System.out.println(reversed);
    }
}
