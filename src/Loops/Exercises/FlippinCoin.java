package Loops;

import java.util.Random;
import java.util.Scanner;

public class FlippinCoin {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner input = new Scanner(System.in);
        String answer ="" ;

        do {
            int randomNumber = random.nextInt(2);
            String flip = randomNumber == 0 ? "Head" : "Tail";
            System.out.println("Game is started make a guess Head/Tail");
            String guess = input.next();
            if(flip.equalsIgnoreCase(guess)){
                System.out.println("You are lucky");
            }else {
                System.out.println("Sorry!It was not correct guess!");
            }
            System.out.println("do you want to play again ? yes/no");
            answer = input.next();

        }while(answer.equalsIgnoreCase("yes"));
        System.out.println("it's ok , see you next time");






    }
}

