package HOMEWORK.homework4;

import java.util.Scanner;

public class BlueOrRead {
    public static void main(String[] args) {
        System.out.println("Enter a string value");
        String str = new Scanner(System.in).next();
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("r") && str.contains("e")&&str.contains("d")) {
                System.out.println("red");break;

            }
            if (str.contains("b")&& str.contains("l") &&str.contains("u")&&str.contains("e")) {
                System.out.println("blue");break;

            }else{
                System.out.println();
            }
        }


    }}

