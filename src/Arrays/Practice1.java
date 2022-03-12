package Arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        //4,12,5,6,17
        int[] number = new int[5];

        //int nums[] = new int[1];

        number[0] = 4;
        number[3] = 12;

        System.out.println(number);//location of the array in the memory

        System.out.println(number[0]);//4
        System.out.println(number[3]);//12
        System.out.println(number[1]);//0


        System.out.println(number.length);//size or capacity of the array
        System.out.println("===================");
        for (int i = 0 ; i <number.length ; i++){
            System.out.println(number[i]);

        }
        System.out.println("*********************************");

        //print out values from the array without using loop
        //to String method
        System.out.println(Arrays.toString(number));//[4,0,0,12,0]
        String a = Arrays.toString(number);
        System.out.println(a.substring(3));//

        //number[5]=23;//ArrayIndexOutBoundException

       // System.out.println(number[6]);//ArrayIndexOutBoundException

        number[number.length-1]= 99;
        System.out.println(number[number.length-1]);
    }
}
