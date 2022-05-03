package Loops.For;

public class ForLoops2 {
    public static void main(String[] args) {
        //print each letter from the given string
        //String str = "Today is the best day";
        //print out letter "e "

        String str = "today is the best day";
        str=str.replace(" ","");
        for ( int i = 0 ;i < str.length() ;i++) {
            System.out.println(str.charAt(i));
        }

    }
}
