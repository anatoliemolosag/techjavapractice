package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.SocketException;
import java.util.Scanner;

public class Practice2 {


    public static void main(String[] args) throws FileNotFoundException, SocketException, InterruptedException {


        FileInputStream file = null;
        file = new FileInputStream("Test");

        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());

        //task print everything from the file not just first line

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        int money = 100;
        int car$ = 200;


//            if (money < car$) {
//                throw new NumberFormatException("You don't have enough money to buy car");
//            }


            System.out.println("This is the end");


        Thread.sleep(5000);

        System.out.println("Final was FINAL");










    }
}