package AhmedMentoring.DebuggingAndReplaceJava;

import java.util.Scanner;

public class LoopsFirstAndLastLetter {
    public static void main(String[] args) {

        //using scanner ask user to enter one string value with three words
        //print first letter of each word
        //print last letter of each word
        //print the sum last letter of each word's index number
        //print the sum first letter of each word's index number


        //clue : I would use if condition for char at and ' '
        //clue : you have to have a logic of separating first word

        //Example ; " Java String test"
        //output: JST
        //output: agt
        //output:31015
        //output:28
        //output :17
        //output:agt
        //output: print last letter of each word

        //Where am i going to start?
        Scanner scan =new Scanner(System.in);
        System.out.println("Please provide 3 words");
        String words = scan.nextLine();
        //how can i print out the first letter of each word in a professional style?
        //Java String Test
        //How can access the spaces?
        //I ha have a string method to acces each of character (ChartAt).If i use charAt with loops i can
        //access this first letters
        String firstLetters = "";
        String lastLetters ="";
        String firstLetterIndex = "";
        String lastLetterIndex ="";
        int firstLetterSum = 0 ;
        int lastLetterSum= 0;


        firstLetters+= words.charAt(0);
        firstLetterIndex+=words.indexOf(words.charAt(0))+" ";
        System.out.println(firstLetters);//J

        for(int i=0;i<words.length();i++){
            if(words.charAt(i)==' '){
                firstLetters+=words.charAt(i+1);
                lastLetters+=words.charAt(i-1);
                firstLetterIndex=firstLetterIndex+(i+1)+" ";
                lastLetterIndex+=(i-1)+ " ";
                firstLetterSum+=(i+1);
                lastLetterSum+=(i-1);
            }
        }

        lastLetters+=words.charAt(words.length()-1);
        lastLetterIndex+=words.length()-1;
        lastLetterSum+=words.length()-1;
        System.out.println(firstLetters);//jst
        System.out.println(lastLetters);//agt
        System.out.println(firstLetterIndex);//0,5,12
        System.out.println(lastLetterIndex);//3,10,15
        System.out.println(firstLetterSum);//17
        System.out.println(lastLetterSum);//28

    }
}
