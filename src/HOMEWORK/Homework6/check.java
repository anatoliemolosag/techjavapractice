package HOMEWORK.Homework6;

import java.util.Arrays;

public class check {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,45,6,6,7,9,8};
        int[] array2 = {2,3,9,10,11,12};
        int[] array3=new int[20];


        for (int i=0 ; i<array1.length;i++){

            for (int k=0;i<array2.length;k++){

                if(array1[i]==array2[k]){
                    //array3[i]++;
                    System.out.println(Arrays.toString(array3));
                }
            }
        }
    }
}
