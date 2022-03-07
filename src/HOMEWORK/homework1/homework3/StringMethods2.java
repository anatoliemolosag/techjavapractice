package homework3;

import java.util.Scanner;

public class StringMethods2 {

    public static void main(String[] args) {
// Please do all coding here
        Scanner user =new Scanner(System.in);
        System.out.println("Enter a random word");
        String randomWord = user.nextLine(); // -> User enters a random word.

        System.out.println("Enter number of letter that word consists of");
        int numberOfLetters = user.nextInt();  // -> User tries to enter number of letters that word consists of.
        int lenght = randomWord.length();
        System.out.println(lenght);
        //int cosist = randomWord.contains(;

        System.out.println(" The number is " + numberOfLetters);

        System.out.println("Enter a letter that you want to learn its index");
        String enteredLetter = user.next(); // -> User enters a letter to learn its index.


        if (numberOfLetters == (randomWord.length())) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (randomWord.contains(enteredLetter)){
            System.out.println(randomWord.indexOf(enteredLetter));
        }else {
            System.out.println(randomWord.indexOf(enteredLetter));
        }


        // Please don't change anything on lines above.
}}

/*
1. Go to the Main class.
2. We have already created a scanner object inside the main method.
3. We asked the user to enter a random word.
4. Then we asked the user to input the number of letters that word consists of.
5. Lastly we asked user for a letter that they want to learn its index.
6. Your code should print true if the user entered a right number of letters in the word.Print false if the wrong number is entered.
7. Your code should print the index of the entered letter, if the word doesn’t contain the letter then the code should print -1.
8. Please look at two example outputs below to understand how your code should work.
Please follow the order when you are printing.

EXAMPLE OUTPUT:
Enter a random word
Techtorial -> this line represents user's input
Enter number of letter that word consists
10 -> this line represents user's input
true
Enter a letter that you want to find an index
a -> this line represents user's input
8

SECOND EXAMPLE OUTPUT:

Enter a random word
Java
Enter number of letter that word consists
6
false
Enter a letter that you want to find an index
v
2

 */