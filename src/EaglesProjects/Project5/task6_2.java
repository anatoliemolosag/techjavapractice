package EaglesProjects.Project5;

import java.util.Scanner;

public class task6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence ");

        String sentence = input.nextLine();
        String newStr = "";
        for (int i =0 ; i<sentence.length();i++){

            if (newStr.indexOf(sentence.charAt(i))==-1) {
             newStr = newStr + sentence.charAt(i);
}
        }
        System.out.println(newStr);

        }

    }

