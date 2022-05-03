package AhmedMentoring.DebuggingAndReplaceJava;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence from 3 words");

        String sentence = input.nextLine();
        String result = "";
        boolean flag =true;
        for(int i =0 ; i<sentence.length(); i++){
            if(sentence.charAt(i) ==' '){
                flag =true;

            }else if(sentence.charAt(i)!=' ' && flag ==true) {
                result += sentence.charAt(i);
                flag = false;
                sentence=sentence+" ";
            } if(sentence.charAt(i)==' '){
                System.out.println(sentence.charAt(i-1));

            }
        }
        System.out.println(result);








    }



}
