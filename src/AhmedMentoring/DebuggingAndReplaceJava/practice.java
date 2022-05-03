package AhmedMentoring.DebuggingAndReplaceJava;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a sentence of three words");

        String word = input.nextLine();
        String resut ="";
        word=word+ " ";



        boolean flag = true;
        for(int i = 0; i <word.length();i++){

            if(word.charAt(i)== ' ' ) {

//                System.out.println(word.charAt(i));
                flag=true;
            }else if(word.charAt(i)!= ' ' && flag==true){
              resut += word.charAt(i);
             flag=false;
            }
            if(word.charAt(i)==' '){

                char result1= word.charAt(i-1);
                System.out.println(result1);
                flag=true;

            }
        }

        System.out.println(resut);
    }
}
