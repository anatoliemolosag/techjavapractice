package HOMEWORK.homework1.homework2;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter song name");
        String songName = scanner.nextLine();

        //get first character
        System.out.println("first charater");
        char first = songName.charAt(0);
        System.out.println(first);


        //get last charater
        System.out.println("last character");
        char second = songName.charAt(songName.length()-1);
        System.out.println(second);


        //3. Print the length of the given song name.
        System.out.println("lenght ");
        int count = songName.length();
        System.out.println(count);

//4. Print the index number of "k" in this song name.
        System.out.println("the index of number k");
        int count1 = songName.indexOf("k");
        System.out.println(count1);


        //5. Print the char from an index number of 3.
        System.out.println("index number of 3");
        char index = songName.charAt(3);
        System.out.println(index);

        //6. Print the song name in upper case.
        System.out.println("Song with UpperCase");
        songName= songName.toUpperCase();
        System.out.println(songName);

       //7. Print the song name in lower case.
        System.out.println("song with lowerCase");
        songName = songName.toLowerCase();
        System.out.println(songName);








// Please do not change anything on lines above.
//The value of the song name has already been assigned using scanner.
//
//1. Print the first char of given song name.
//2. Print the last char of given song name.
//3. Print the length of the given song name.
//4. Print the index number of "k" in this song name.
//5. Print the char from an index number of 3.
//6. Print the song name in upper case.
//7. Print the song name in lower case.
//
//Please do all the printing in the same order listed above and do not add any additional information when printing.
//Example:
//Input: Mockingbird
//Output:
//M
//d
//10
//3
//k
//MOCKINGBIRD
//mockingbird
    }
}

