package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {

        /*
        222 --> find the product(multiply) of digits from given number
        2 * 2 * 2 = 8

        */



        int number =222, digitfirst, digitsecond , digitthird ;

        digitfirst = number%10;

        number=number/10;//22

        digitsecond = number%10;

        number = number/10;//2

        digitthird = number%10;

        System.out.println("The product of given number is " + (digitfirst * digitsecond *digitthird));



        int number1 = 222;

        int digit1 = number1 %10;
        System.out.println(digit1);

        number1 = number1/10;
        int digit2 = number1%10;
        System.out.println(digit2);

        number1 = number1/10;
        int digit3 =number1%10;
        System.out.println(digit3);

        int sumOfDigits = digit1*digit2*digit3;
        System.out.println("The product of given naumber is " + sumOfDigits);





    }
}
