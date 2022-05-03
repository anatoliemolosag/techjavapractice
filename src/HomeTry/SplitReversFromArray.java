package HomeTry;

import java.util.Arrays;
import java.util.Scanner;

public class SplitReversFromArray {
    public static void main(String[] args) {
         /*
    TASK
    String str ="Hello java is so cool";

    1-i want you to reverse this all words

   output :olleH
   avaj
   si
   os
   looc
   Tips : use nested loops
   Tips : use split methods(String Array)

     */
        Scanner input =new Scanner(System.in);
        System.out.println("how many words do you want to enter");

        int numbers = input.nextInt();

        String[] array = new String[numbers];

        String reverse=" ";

        input.nextLine();
        for(int i=0; i< array.length;i++){
            System.out.println("please enter a word");
            String word = input.nextLine();
            array[i]=word;
            reverse="";
            for(int k=array[i].length()-1;k>=0;k--){
                reverse+=array[i].charAt(k);
            }

            System.out.println(reverse);
        }
        System.out.println(Arrays.toString(array));

    }
}
