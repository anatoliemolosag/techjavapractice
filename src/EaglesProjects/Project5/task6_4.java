package EaglesProjects.Project5;

import java.util.Scanner;

public class task6_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence ");
        String s = sc.next();
        String str = "";
        char c;
        for(int i = 0; i < s.length(); i++)
        {
            c = s.charAt(i);
            str = str + c;
            s = s.replace(c, ' ');
            if(i == s.length() - 1)
            {
                System.out.println(str.replaceAll(" \\s ", ""));
            }
        }
    }
}
