package Arrays;

import java.util.Arrays;

public class ForEachPractice {
    public static void main(String[] args) {


        String[] colors = {"Red", "Blue", "white", "pink", "Violet", "Green", "Yellow", "BROWN"};

        for( String color  : colors){
            System.out.println(color);
            System.out.println(color.toUpperCase());
        }
        System.out.println(Arrays.toString(colors));//[Red, Blue, white, pink, Violet, Green, Yellow, BROWN]

        double[] paychecks = { 250,350,450,567.99, 10.99};
        //find out sum of my money by using for each loop
        double balance =0 ;
        for(double pay : paychecks){
            balance+=pay ;

            System.out.println(balance);
        }

    }
}