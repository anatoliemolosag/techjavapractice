package AhmedMentoring.DebuggingAndReplaceJava;

import java.util.Arrays;

public class ArraysSplitInterInterviewQuestion {


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

    public static void main(String[] args) {
        String str ="Hello java is so cool";
        String[] words=str.split(" ");
       // System.out.println(Arrays.toString(words));//[Hello, java, is, so, cool]//5


        for(int i=0;i< words.length;i++){
           String reverse="";
            for (int k=words[i].length()-1;k>=0;k--){

                reverse+=words[i].charAt(k);

            }
            System.out.println(reverse+" , ");
        }

    }



}
