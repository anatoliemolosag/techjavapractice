package Loops;

public class PerfectNumberTask {
    public static void main(String[] args) {
        //check if the given number is perfect of not
        //6==> 1+2+3 , sum of divisors is equal to the number itself(excluding number itself a divisor)

        int number = 6;
        int divisor = 1;
        int sum = 0;

        for (; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;


            }

        }
        if (number == sum) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
}