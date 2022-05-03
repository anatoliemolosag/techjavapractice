package MethodPractice;

import java.util.Arrays;

public class VarArgExample {

    String color ;

    public static void example(String color){
        System.out.println(color);
    }

    public static void example1(String[] colors){
        System.out.println(Arrays.toString(colors));
    }


    public static void example2(String ... color){
        System.out.println(Arrays.toString(color));

        for(String element : color ){
            System.out.println(element);
        }
    }
    //create a sumCalculator by using Var arg implementation

    public static int sumCalculator( int ... numbers){

        int sum=0;

        for(int num : numbers){
            sum+=num;
        }
        System.out.println(sum);
      return sum;
    }

    public static int sumCalculator(String color , int number , int ... numbers){

        int sum=0;

        for(int num : numbers){
            sum+=num;
        }
        System.out.println(sum);
        System.out.println(color);
        System.out.println(number);
        return sum;

    }





    public static void main(String[] args) {

       example("pink");
       String[] clrs = {"violet", "red", "White"};
       example1(clrs);
        System.out.println("=========================");
       example2("Red","White", "Purple", "Blue");
       sumCalculator( 2,3,4,5,6);
       sumCalculator("blue", 10 , 23,45,67,23,55);
       example2(clrs);

    }
}
