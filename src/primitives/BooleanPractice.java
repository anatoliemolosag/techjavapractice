package primitives;

public class BooleanPractice {

    public static void main(String[] args) {

        boolean islighton = true;
        System.out.println("is the light on?" + (islighton) ) ;

        boolean isItBreakTimeYet = false;
        System.out.println(isItBreakTimeYet);
        System.out.println(isItBreakTimeYet);
        System.out.println(isItBreakTimeYet);
        System.out.println(isItBreakTimeYet);
        System.out.println(isItBreakTimeYet);
        System.out.println(isItBreakTimeYet);

        System.out.println( "===============================" );
        // ! ---> to make a boolean condition to its opposite

        boolean hasMoney = true;
        System.out.println(hasMoney); // true
        System.out.println(!hasMoney); // false

        boolean nightTime = !false;
        System.out.println(nightTime);//true
        System.out.println(!nightTime);//false

        System.out.println(2 == 2); //true
        System.out.println(2 != 2);//false

    }
}
