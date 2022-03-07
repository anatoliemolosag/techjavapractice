package Loops;

public class while3 {
    public static void main(String[] args) {

        //your age is now 21
        //"my age is ... "till you get to age of 30

        int age =21;
        while (age <= 30){
            System.out.println("My age is " + age);
            age++;
        }

        //find the sum of numbers between 12 to 18 and show final sum
        //13+14+15+16+17=75

        int number = 12;
        int sum = 0;
        while (number <=18){
            //int t =25;//t is at local variable
            sum = sum+number;

            number++;

        }
        System.out.println("Total is " + sum);
        //System.out.println(t);//t is a local variable



    }
}
