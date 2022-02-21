package primitives;

public class ComparisonOperators {
    public static void main(String[] args) {
        //==
        int a = 4, b =4;

        boolean result1 = a==b;
        System.out.println(result1);//true
        System.out.println(!result1);//false
        //!=
        boolean result2 = a !=b;
        System.out.println(result2);//false
        //> greater than
        boolean result3 = a >b ;
        System.out.println(result3);

        //< less than
        boolean result4 = a <b ;
        System.out.println(result4);

        //>=
        boolean result5 = a >=b ;
        System.out.println(result5);

        //<=

        boolean result6 = a <=b ;
        System.out.println(result6);


        System.out.println(50==50);//true
        System.out.println('c' > 'd');//false
        System.out.println('d' > 'c');//true
        System.out.println(67 != 67);//false
        System.out.println('c' > 'b');//true
        System.out.println(true != false);//true


        ///














    }
}
