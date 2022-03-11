package Loops;

public class ForLoops3 {
    public static void main(String[] args) {
        //String str = "Today is the best day";
        //print out letter "e "

        String str = "today is the best day";

        for ( int i = 0 ;i < str.length() ;i++) {
            if (str.charAt(i)=='e' ){
                System.out.println(str.charAt(i));
            }
        }
    }
}
