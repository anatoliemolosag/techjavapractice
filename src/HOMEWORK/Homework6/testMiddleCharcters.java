package HOMEWORK.Homework6;

import java.util.Scanner;

public class testMiddleCharcters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string");
        String user=input.nextLine();

        int length = user.length()/2;

        if(length%2==0){
            String output = user.substring(1);
            System.out.println(output);
        }else if(length%2!=0){

        String output1 = user.substring(length-1,length+2);
        System.out.println(output1);


    }
}}
