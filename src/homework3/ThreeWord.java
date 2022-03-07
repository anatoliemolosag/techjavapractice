package homework3;

import java.util.Scanner;

public class ThreeWord {
    public static void main(String[] args) {
        System.out.println("Please enter a string with three words.");
        String threeWords = new Scanner(System.in).nextLine();
        // Please don't change anything on lines above.

        String firstWord = threeWords.substring(0, (threeWords.indexOf(" "))).concat(" ");
        String secondWord = threeWords.substring((threeWords.indexOf(" ") + 1), (threeWords.indexOf(" ",(threeWords.indexOf(" ") + 1)))).concat(" ");
        String thirdWord =  threeWords.substring((threeWords.indexOf(" ", ((threeWords.indexOf(" ")) + 1)))+1).concat(" ");

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println((firstWord.charAt(0)+"" )+ (secondWord.charAt(0)) + (thirdWord.charAt(0)));
        System.out.println(firstWord.charAt(firstWord.length() - 2)+"" + (secondWord.charAt(secondWord.length() - 2))
                + (thirdWord.charAt(thirdWord.length() - 2)));

        if (firstWord.length()==secondWord.length()&&secondWord.length()==thirdWord.length()){
            System.out.println("true");
        }else {
            System.out.println("false");

        }

    }
}
/*
Scanner object is created in main class and user is asked input one string value with three words .

1- Find the first word, second word, and third word from the string and create three different string variables for them.
2- Print first word, second word and third word from the threeWords string in order.
2- Print the first char of those three string together.
3- Print the last char of each string together.
4- Print true if each of the word length is equaled to each other.

EXAMPLE:
Input : We Love Java
OUTPUT:
We -> First word
Love -> Second word
Java -> Third word
WLJ  -> Initials of words
eea  -> Last letters of words.
false   ->(since every word in string doesn't have the same value.)
 */
