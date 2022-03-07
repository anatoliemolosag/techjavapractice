package TernaryOperators;

public class Practice {
    public static void main(String[] args) {

        int number1 =5;
        int number2 =6;


        //  ?   :  ---->Ternary Operators

        String result1 = number1 > number2 ? "First number" : "Hello";
        System.out.println(result1);//Hello
        int result2 = number1 != number2 ? 8+2 : 8*2;
        System.out.println(result2);//10

        char result3 = number2 > number1 ?  't' : '&';
        System.out.println(result3);//t

        System.out.println( number1 > number2 ? 77 : "99");//99


       int result4 =  number1 != number2 ?  number1++ + ++ number2 : number1 * number2;
        System.out.println(result4);





    }
}
