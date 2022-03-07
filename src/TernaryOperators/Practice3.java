package TernaryOperators;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class Practice3 {

    public static void main(String[] args) {
        String result = 5>6 ? "Saturday" : 6>10 ? "morning" : "afternoon";
        System.out.println("Result is " + result);//afternoon

        String result2 = 5>6 ? "Saturday" : 6>10 ? "morning" : "tech".toUpperCase().contains("CH") ? "David" : "Alex";

        System.out.println("Result 2 is " + result2);//David

        System.out.println( 5>6 ? "Saturday" : 6>10 ? "morning" : "tech".toUpperCase().contains("CL") ? "David" : ( 5*4 +3));

        String result3=  5<=6 ? 8 <= 7 ? "Marry" : 2 == 3 ? "Zack" : "Ahmed" : "Efe";
        System.out.println(result3);


    }
}
