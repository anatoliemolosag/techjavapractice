package AhmedMentoring.DebuggingAndReplaceJava;

public class IfStatementsTernary {

    public static void main(String[] args) {

        /*
        possible interview questions
        1.Many technical question have if statements conditions for solutions

        &&:
        True && true   --> true
        true && false  --> false
        false && true  --> false
         */

        boolean result = (5+7==12);
        System.out.println(result);

        int cat =20;
        int dog = 10;
        int rabbit = 5;

        if(cat>dog&&rabbit>dog||cat<rabbit){
            System.out.println("i love animals");
        }else {
            System.out.println("i feed animals");
        }

    String result1 =cat>dog&&rabbit>dog||cat<rabbit ? " i love animals" : "i feed animals";
        //String result2 = (cat>dog)? "yes" :123 ;
        System.out.println(cat>dog ? "yes": 123);
        System.out.println(result1);
        //System.out.println(result2);

    }
}
