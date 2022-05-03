package Loops;

public class Palindrime {
    public static void main(String[] args) {
        /*
        check if given string is palindrome or not
        <--ana--> palindrome string
        <--1234321-->palindrome numbers
         */
        String text = "ana";
        String reversed ="";
        for(int i = text.length()-1; i >=0 ; i--){
            reversed=reversed+text.charAt(i);
            //System.out.println(reversed);
        }
            if(text.equals(reversed)){
                System.out.println(text + " is a palindrom");
            }else{
                System.out.println(text+" is not a palindrome");
            }


        }

    }

