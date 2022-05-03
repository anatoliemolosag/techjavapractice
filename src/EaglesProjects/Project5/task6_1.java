package EaglesProjects.Project5;

import java.util.Scanner;

public class task6_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence ");

        String sentence = input.nextLine();
        String Str = "";

        for(int i =0 ; i<sentence.length();i++){
            char ch = sentence.charAt(i);

            if(Str.indexOf(ch)==-1){
                Str=Str+ch;
            }
        }
        System.out.println(Str);
    }
}
