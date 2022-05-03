package MethodPractice;

public class task1 {
    /*
    -create a method that will take an integer array as a parameter
    -it will find the sum of numbers from the given array and returns the sum
    -run that method to see the result

     */


    public int sum(int[] number){

        int sum=0;

        for(int i = 0; i<number.length;i++){
            sum+=number[i];
        }
        return sum;
    }
    public double sum(double[] number){

        int sum=0;

        for(int i = 0; i<number.length;i++){
            sum+=number[i];
        }
        return sum;
    }



}

