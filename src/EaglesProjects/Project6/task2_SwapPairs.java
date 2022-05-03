package EaglesProjects.Project6;

import java.util.Arrays;
import java.util.Scanner;

public class task2_SwapPairs {
    public static void main(String[] args) {

        /*
        /**
         * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
         * Your method should switch the order of the first two values,
         * then switch the order of the next two, switch the order of the next two, and so on.
         *
         * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
         * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
         *
         * Method that takes String[]
         *
         * prints switched pairs array
         */

        Scanner input = new Scanner(System.in);
        System.out.println("how many string do you want to enter?");
        int userNumber = input.nextInt();

        String[] array = new String[userNumber];
       // System.out.println("Please enter a word");
        input.nextLine();
        for(int i = 0 ; i<array.length;i++){
            System.out.println("Please enter a word");
            String userWord = input.nextLine();
            array[i]=userWord;
            System.out.println(Arrays.toString(array));
        }

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[2 * i];
            array[2 * i] = array[2 * i + 1];
            array[2 * i + 1] = temp;
        }
        System.out.println(Arrays.toString(array));


    }
}
