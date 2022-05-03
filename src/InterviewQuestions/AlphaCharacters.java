package InterviewQuestions;

import static javax.print.attribute.standard.MediaSizeName.A;


public class AlphaCharacters {
    public static void main(String[] args) {

        String given = "Anatolie123^*";

        String replced = given.replaceAll("[^A-Za-z]" , "");
        System.out.println(replced.length());

        int count = 0;
        for (int i = 0; i < given.length(); i++) {
            if(Character.isAlphabetic(given.charAt(i))){
                count++;
            }

        }
        System.out.println(count);




    }
}
