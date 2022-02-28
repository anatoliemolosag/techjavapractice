package string;

public class MethodeChaining {

    public static void main(String[] args) {

        int number = 4;

        String str = "Sunday";

        //chain
     char ch1=   str.toUpperCase().concat(" is Sunny").substring(str.indexOf("d")).charAt(11);
        System.out.println(ch1);

        short lenght = (short) (str.concat("is getting tough").length());
        System.out.println(lenght);
        System.out.println(str.length());

        /* Task : " Zero to Hero"
        -change zero to one
        -make string upperCase
        -remove all spaces
        -get only first 3 letters
        -check the lenght of final part of string and show it
         */


        String text = "     Zero to Hero   ";
        int result = text.replace("Zero", "One").toUpperCase().trim().replace(" ","").substring(0,3).length();
        System.out.println(result);




    }
}
