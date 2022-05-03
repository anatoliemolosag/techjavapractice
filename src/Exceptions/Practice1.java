package Exceptions;


import java.util.Arrays;

public class Practice1 {


    public static void main(String[] args) {

        try {
            String str = "B12";

            //parse to convert string to number
            int result = 12 / 0;
            int number = Integer.parseInt(str);
            System.out.println(number);


            System.out.println(result);

        } catch (NumberFormatException exception) {
            System.out.println("I caught the number format exception!!!");
            System.out.println(exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
            System.out.println();
        } catch (ArithmeticException exception) {
            System.out.println("This is second catch block");
        } catch (RuntimeException exception) {
            System.out.println("This is third block");
        }


        System.out.println("I want to see this execution");

        study("Break");

    }


    public static void study(String question) {

        System.out.println("this question is not making sense "+question);
        try {
            int result = 12 / 0;

        } catch (ArithmeticException exception) {
            System.out.println("This is another Try-Catch");

            try{
                int result =12;
            }catch (Exception e){
                System.out.println("nested exception");
            }

        }finally {
            System.out.println("Finally block");
        }

    }

}
