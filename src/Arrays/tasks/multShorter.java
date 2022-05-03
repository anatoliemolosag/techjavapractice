package Arrays.tasks;

import java.util.Arrays;

public class multShorter {
    public static void main(String[] args) {

        int[] a= {1,2,3,4,5};
        int[] b ={8,6};

        int[] prod = new int[a.length];

        for(int i =0 ; i<a.length;i++){
            prod[i] = a[i]*b[i % b.length];
        }
        System.out.println(Arrays.toString(prod));

    }
}
/*
you are two int arrays .The second may be shorter than first. Return a new array whose elements are the products of the
corresponding elements of the two given arrays .
If the second array is shorter , repeat it as many times as necessary .
Ex: multShort[1,2,3,4,5],[8,6]=[8,12,24,24,40]
 */