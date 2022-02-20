package primitives;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int num = 9 ;

        // addition --> +
        int sum = num + 3 ;
        System.out.println(sum);

        int num1 = 34;

        // substraction

        int result = sum - num1;
        System.out.println(result);

        double result1 = sum - num;
        System.out.println(result1);

        // multiplication --> *

        double multiply = result1 * sum ;

        System.out.println(multiply);      //36

        int multiply1 = 5*8;
        System.out.println(multiply1); //40

        //division --> /

        int num2 = 12 ;
        int num3 = 4;

        float divison =  num2 / num3;
        System.out.println(divison); //3.0

        float division1 = num2 / 2.5f;
        System.out.println(division1);

        int division3 = 15 / 4 ;
        System.out.println(division3);

        double division4 = 15 / 4d ;
        System.out.println(division4);

        //modulus ( remainder) -- % --> find remainder of division problem

        int remainder = 15 % 6 ;
        System.out.println(remainder);// 3

        int reminder2 = 6 % 4 ;
        System.out.println(reminder2);

        double x = 12, a =5, b = x+a, k = b /2;
        System.out.println(k - a );

        int people =10;
        int burger =45;
        int leftoverBurgers = burger % people;
        System.out.println(leftoverBurgers + " burgers left over after people shared them evenly");

        char ch = 'd';













    }
}
