package string;

import java.util.Scanner;

public class StringMethodsTask2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your information as in following format:F-Jenny Brown--1999");
        String data = input.nextLine();
        //  -check if the input string starts with F
        System.out.println(data.startsWith("F"));


        //  -check if the input string starts with M
        System.out.println(data.startsWith("M"));

        //  -check if the input string contains your name
        //data.contains("ANATOLIE");//or you can do it in SOUT
        System.out.println(data.contains("Anatolie"));

        //  -check if the input string ending with birth year
        System.out.println(data.endsWith("1990"));

        char lastChar = data.charAt(data.length()-1);
        boolean isDigits = lastChar >='0' && lastChar <='9' ;
        System.out.println(isDigits);















        //F - Jenny Brown -- 1999
        //
        //  -check if the input string starts with F
        //  -check if the input string starts with M
        //  -check if the input string contains your name
        //  -check if the input string ending with birth year



    }
}
