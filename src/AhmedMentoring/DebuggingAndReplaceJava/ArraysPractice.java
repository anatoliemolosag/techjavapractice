package AhmedMentoring.DebuggingAndReplaceJava;

import java.util.Arrays;

public class ArraysPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS
    1) what is the difference between Array and Arraylist

    Arrays:
    *1)Array is a storage dor primitives and objects
    **2)Array is a fixed size
    3)Array has multidimentional form
    4)Array has a length feature.
    5)Array's elements cannot be manipulated(there is no methode of array)

     */

    public static void main(String[] args) {

        String[] arrays =new String[5];//i have to provide size
        String[] array1 = {"1", "2", "ahmet", "mehment", "ahmet1"};

        System.out.println(Arrays.toString(array1));

        /*
        TASK 1

       write a implementation that declare int array and find the:
       1-sum of the even number
       2-sum of odd number
       3-difference between them

       int[] array ={1,2,3,8,12,65,76,5,22,17};
       output =120 sum of even number
       output =91 sum of odd number
       difference = --> 29 not minus 29
         */

        //where am i supposed to start

        int[] array ={1,2,3,8,12,65,76,5,22,17};

//        for(int i = 0; i<array.length; i++){
//
//            if(array[i] % 2 ==0){
////                System.out.println(array[i]);
//            }
//            if(array[i]%2 !=0){
//                System.out.println(array[i]);
//
//            }
//
//        }

        int sumOfEven= 0;
        int sumOfOdd=0;
        for(int number :array){
            if(number%2==0){
                sumOfEven+=number;

            }else if (number%2!=0){
                sumOfOdd+=number;

            }
        }

        if(sumOfEven>sumOfOdd){
            System.out.println(sumOfEven-sumOfOdd);
        }else {
            System.out.println(sumOfEven-sumOfOdd);
        }
        System.out.println(sumOfOdd);
        System.out.println(sumOfEven);


        /*
for(int i=0;i<array.length;i++){
if(array[i]%2==0){
sout(this is even number)
}


 */






    }
}
