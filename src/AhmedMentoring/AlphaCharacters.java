package AhmedMentoring;

public class AlphaCharacters {

    public static void main(String[] args) {


        //Task
        //I want you to print all alphabets
        //all digits
        //all special characters separatly
        String given = "jhdsadhgjs573:sdjhsdvb";

        //where a i going to start?
        //what methods am i going to use?
        //how many minutes i have ? 7 min
        //i have to access each characters
String onlyAlphabets="";
String onlyDigits ="";
String onlySymbols="";
        for(int i= 0; i<given.length();i++){

            if(Character.isAlphabetic(given.charAt(i))){
                onlyAlphabets+=given.charAt(i);

            }
            else if(Character.isDigit(given.charAt(i))){
                onlyDigits += given.charAt(i);

            }else{
                onlySymbols+=given.charAt(i);

            }

        }


        System.out.println(onlyAlphabets);
        System.out.println(onlyDigits);
        System.out.println(onlySymbols);

    }
}
