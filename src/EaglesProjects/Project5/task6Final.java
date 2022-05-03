package EaglesProjects.Project5;

import java.util.Scanner;

public class task6Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str1 = "";
        String str = scanner.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            boolean valid = true;
            for (int k = i - 1; k > 0; k--) {
                if ((str.charAt(i) == str.charAt(k)) && (str.charAt(i) != ' '))
                    valid = false;
            }
            if (valid)
                str1 = str.charAt(i) + str1;
        }
        if (str1.charAt(0) == ' ')
            str1 = str1.substring(1);
        if (str.charAt(str.length() - 1) == ' ')
            str1 = str1.substring(0, str1.length() - 2);
        System.out.println(str1);
    }
}


