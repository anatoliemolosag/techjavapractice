package EaglesProjects.Project5;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence that is not separated by space and each word starts with upper case.");


        String sentences = input.nextLine();
        String str ="";

        for (int i = 0; i < sentences.length(); i++) {
            char c = sentences.charAt(i);
            if (Character.isUpperCase(c)) {
                str=str +" ";

            }
          str=str+c;
        }
        System.out.println(str.trim());

    }
}
