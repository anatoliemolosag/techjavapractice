package Loops;


import java.util.Scanner;

public class LoopExercise4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("please enter a number");
        int b = input.nextInt();
        int a = 0 ;

        if (a<b){
        for( a =0 ; a< b ; a++){
            System.out.print(a + ", "  );

        }

    }else {
            System.out.print("your number doesn't match");
        }
  }
}
