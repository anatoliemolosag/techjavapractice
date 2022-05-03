package Arrays.tasks;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = { 3,4,6,7,9};

        int sum =0;
        for(int i = 0; i<numbers.length; i++){
            sum = sum+numbers[i];
        }
        System.out.println(sum);
    }

    //SumArray -- Given an array of ints , return the sum of array
}
