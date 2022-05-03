package EaglesProjects.Project5;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence ");

        String sentence = input.nextLine();
        String str = "";

        for(int i = 0 ; i<sentence.length(); i++){
            Boolean found=false;
            for(int k =0; k<str.length();k++){
                if(sentence.charAt(i)==str.charAt(k)){
                    found=true;
                    break;
                }
            }
        if(found==false){
            str=str.concat(String.valueOf(sentence.charAt(i)));
        }

        }
        System.out.println(str);
    }
}
