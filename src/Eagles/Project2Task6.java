package Eagles;

import java.util.Scanner;

public class Project2Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please entrer a sentece of three words");
        String word = input.nextLine();




        int word1 = word.indexOf(" ")-1;
        System.out.println(word1);

       // int word2 =word.indexOf(word.indexOf(" ")-1);
        //System.out.println(word2);

        int word2 =word.indexOf(' ',word.indexOf(" ")+1)-1;
        System.out.println(word2);

//milk butter oil pan
        //int word4=word.indexOf(" ", word.charAt(word2+2))-1;
        //System.out.println(word4);
        //int word3 =word.indexOf(' ',word.indexOf(" ",word2)+2)-1;
        //System.out.println(word3);

        int word3 = word.length()-1;
        System.out.println(word3);

        System.out.println(word1+word2+word3);




        //String word1

        //System.out.println(word1);



    }
}
/*Using the scanner asks the user to enter one sentence with three words and print the
index number of each word's last character and then print the sum of each index number that you found.

For Example:
Input:
"Importance of Human" --> it can be any three-word sentence.
Output:
9 --> index number of 'e'
12 --> index number of 'f'
18 --> index number of 'n'
The sum: 39

 */