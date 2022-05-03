package Arrays;

import java.util.Arrays;
import java.util.Locale;

public class task3 {
    public static void main(String[] args) {
        /*

        String[] studentNames = {"Alex" , "David" , "John" , "Marry", "Ana"};
        outcome : alex@gmail.com, david@gmail.com ...
        After you create email addresses , store them in the email array

        */
        String[] studentNames = {"Alex" , "David" , "John" , "Marry", "Ana"};

        String[] eMail = new String[studentNames.length];
        int index =0 ;
        for(String name : studentNames){
            System.out.println(name.toLowerCase().concat("@gmail.com"));

            eMail[index] = name.toLowerCase().concat("@gmail.com");
            index++;

        }
        System.out.println(Arrays.toString(eMail));


    }
}
