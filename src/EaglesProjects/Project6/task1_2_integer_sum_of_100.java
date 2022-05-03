package EaglesProjects.Project6;

import java.util.Scanner;

public class task1_2_integer_sum_of_100 {


    //        /**
//         * Write a method that takes an array of ints
//         * print true if that array contains two numbers anywhere in the array
//         *
//         *
//         * inputs 2 integers
//         * whose sum is 100
//         */
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
    int userInput = input.nextInt();

    int[] array = new int[userInput];

        for(int i=0; i<array.length;i++) {
        System.out.println("please enter a number");
        array[i] = input.nextInt();
        //System.out.println(Arrays.toString(array));

    } boolean flag =false;


            for(int j=0 ; j<array.length-1;j++) {

        for (int k = j + 1; k < array.length; k++) {


            if (array[j] + array[k] == 100) {
                System.out.println("true");
                flag=true;
            }
        }
    }
                if(!flag){
        System.out.println("not matching");
    }
}
}
