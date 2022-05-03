package EaglesProjects.Project5;

import java.util.Scanner;

public class task6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence ");

        String s = input.nextLine();

        String result="";
        for (int i=0 ;i<s.length();i++) {
            char ch = s.charAt(i);
            if (!result.contains("" +ch)) {
                result+=""+ch;
            }


        }
        System.out.println(result);
    }

}
