package HomeTry;

import java.util.Scanner;

public class FirstLetterLastLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter word/words");
String character= "My dream is to became a pilot";
        String word = input.nextLine();
        String firstLetter = "";
        String lastLetter = "";
        String firstLetterIndex="";
        String lastLetterIndex ="";

        int sumFirst=0;
        int sumLast=0;


        firstLetter=firstLetter+word.charAt(0);
        firstLetterIndex=firstLetterIndex+word.indexOf(word.charAt(0))+" ";

        String substringWord = word.substring(word.indexOf(' ',5),word.length());
        System.out.println("substring -->"+substringWord);//substring -->pilot



        for(int i=0;i<word.length();i++){

            if(word.charAt(i)==' '){//found the spaces
                firstLetter=firstLetter+word.charAt(i+1);
                lastLetter=lastLetter+word.charAt(i-1);
                firstLetterIndex=firstLetterIndex+(i+1)+" ";
                lastLetterIndex=lastLetterIndex+(i-1)+" ";
                sumFirst+=(i+1);
                sumLast+=(i-1);






            }
        }

        lastLetter=lastLetter+word.charAt(word.length()-1);
        lastLetterIndex=lastLetterIndex+(word.length()-1);
        sumLast+=word.length()-1;

        System.out.println("the first letters -->"+firstLetter);//the first letters -->iaap
        System.out.println("the last letters -->"+lastLetter);//the last letters -->imat
        System.out.println("first letter index -->"+firstLetterIndex);
        System.out.println("last letter index -->"+lastLetterIndex);
        System.out.println("first letter index sum -->"+sumFirst);
        System.out.println("last letter index sum -->"+sumLast);
    }
}
//