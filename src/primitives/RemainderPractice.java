package primitives;

public class RemainderPractice {
    public static void main(String[] args) {

        /*
         456 ---> 4 + 5 + 6 = 15 --> sout( sumof de digits is 15)
        123 ---> 1+2+3=6

        */

        int number = 456;

        int digit1 = number %10;


        System.out.println(digit1);

        number = number/10;

        int digit2 = number%10;
        System.out.println(digit2);

        number = number/10;

        int digit3 = number %10;
        System.out.println(digit3);

        int sumOfDigits = digit1+digit2+digit3;
        System.out.println(sumOfDigits);

        //456 % 100 --> 56


    }
}
