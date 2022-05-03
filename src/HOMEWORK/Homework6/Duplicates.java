package HOMEWORK.Homework6;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {

public int[] duplicates (int [] nums1 ,int[]  nums2) {

    String commons ="";

    for(int i=0; i<nums1.length; i++){
        for (int j=0; j< nums2.length;j++){
            if(nums1[i]==nums2[j]){
                commons+=nums1[i]+" ";

            }
        }
    }
if(commons.length()==0){
    return null;
}

String[] commonArray = commons.trim().split(" ");

String commonsWithoutDuplicate = " ";

for (int i=0;i<commonArray.length;i++) {
    if (!commonsWithoutDuplicate.contains(" " + commonArray[i] + " ")) {
        commonsWithoutDuplicate += commonArray[i] + " ";
    }
}
    String [] commonsWithoutDuplicateArray=commonsWithoutDuplicate.trim().split(" ");

int[] commonNumbers = new int[commonsWithoutDuplicateArray.length];

for (int i=0;i<commonNumbers.length;i++){
    commonNumbers[i]=Integer.parseInt(commonsWithoutDuplicateArray[i]);
}
    Arrays.sort(commonNumbers);
    System.out.println(Arrays.toString(commonNumbers));
return commonNumbers;
}

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Duplicates obj = new Duplicates();

        System.out.println("Enter first array");


    int[] nums1= {input.nextInt()};
    int[] nums2 = {3,4,5,6,9,10};

        obj.duplicates(nums1,nums2);
    }

}
/*
Create a public method named duplicates that takes
two int arrays as parameters and returns common elements of both arrays as an int array.
IF there is no common element of arrays, return null.
NOTE: USE SORT METHOD ON ARRAY BEFORE YOU RETURN IT.
For example:
 array 1 -> [1,2,3,45,6,6,7,9,8] and array 2 [2,3,9,10,11,12]

 return int array is [2,3,9] -> !!array is sorted

 example 2: array 1 -> [1,1,1,1,1,1,1,1] array 2 -> [1,1,2]

 return int array is [1]

 example 3 : array 1 -> [0,1,1,1,0]  array 2 -> [2,9,90]

 return null   -> because there is no common element for arrays.

 NOTE: This question might be harder than it seems, and it can take time .
 Please make sure you covered all the  posibilities and your return type name etc. are all correct.
 If you cover all possibilities with your method, tests shall pass.
 GOOD LUCK !
 */