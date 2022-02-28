package string;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter string value");

        String text = scanner.nextLine();

        System.out.println(text.charAt(0));//find and shor first char

        System.out.println(text.charAt(6));//find and show last char

        System.out.println(text.indexOf('c'));//find and show index of letter c

        System.out.println(text.indexOf('x'));//find and show index 'x'

        System.out.println(text.charAt(text.length()/2));//find and show middle char from the fiven string









    }
}
