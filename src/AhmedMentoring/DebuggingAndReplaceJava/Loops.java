package AhmedMentoring.DebuggingAndReplaceJava;

import java.util.Scanner;

public class Loops {

    /*
    Possible interview questions
    10many technical questions they requare to use loops solve the questions

   LOOPS: Is a way to iterate (circle) the elements (values/variables) one by one .
   in other words --> is a cicle of repetitive actions

   TYPES OF LOOPS:
   Do While
   While // --> reverse numbers while(number!=0)
   For**
   For Each*****Automation

   Do While -- > it executes the code 1 time no matter what

     */

    public static void main(String[] args) {

//        int input;
//        do{
//            Scanner scan =new Scanner(System.in);
//            System.out.println("1-Continue\n2-Exit");
//            input=scan.nextInt();
//
//
//
//        }while(input!=2);


       /*TASK 1:
        Ask a user to  input a word and revers it

        */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a word");
//        String word = input.nextLine();
//        String reverse = "";
//        for (int i = word.length()-1 ; i>0;i--)
//            reverse=reverse+word.charAt(i);
//        System.out.println(reverse);
//

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter numbers");
//        int number = input.nextInt();
//
//        String reverse = "";
//        int sum =1;
//        while(number!=0) {
//            int lastDigit=number%10;//5
//            number= number/10;
//            sum=sum*lastDigit;
//            reverse=reverse+lastDigit;
//            System.out.println("remainder"+lastDigit);
//        }
//
//        System.out.println(reverse);
//        System.out.println("sum "+sum);



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

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence from 3 words");

        String sentence = input.nextLine();
        String result = "";


        boolean flag = true;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)==' '){
                flag = true;


            }else if(sentence.charAt(i)!= ' '&& flag==true ){
                result=result+sentence.charAt(i);
                flag=false;

            }

            }

        System.out.println(result);


        System.out.println("*************************************");


        sentence = sentence + " ";
        for(int i = 0; i<sentence.length();i++){
            if(sentence.charAt(i)==' '){

                System.out.println(sentence.charAt(i-1)+ " " );
            }
        }



    }
}
