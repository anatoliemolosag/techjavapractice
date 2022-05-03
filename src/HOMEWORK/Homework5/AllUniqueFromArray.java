package HOMEWORK.Homework5;

import java.util.Arrays;
import java.util.Scanner;

public class AllUniqueFromArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[13];
        boolean flag=false;

        for(int i=0; i<array.length ; i++) {
            System.out.println("Enter number for array");
            int userNumber = input.nextInt();
            array[i] = userNumber;
        }
            for(int j=0; j<array.length;j++){
                int count=0;

            for(int k=0; k<array.length;k++){
                if(array[j]==array[k]){
                    count++;
                }
            }
                if(count==1){
                    System.out.print(array[j]+" ");
                    flag=true;
                }

            }

        if(!flag){
            System.out.println("Array doesn't have any unique element");
        }
    }
}
/*
Create the int array size of 13 and store every number by asking user via scanner in the loop.
When asking user please use the text -> "Enter number for array" .
After having all numbers for array print ALL unique values from this array.
If the array doesn't have any unique element print the text below
"Array doesn't have any unique element"

EXAMPLE OUTPUT:
Enter number for array
5
Enter number for array
6
Enter number for array
4
Enter number for array
5
Enter number for array
6
Enter number for array
7
Enter number for array
9
Enter number for array
0
Enter number for array
0
Enter number for array
0
Enter number for array
0
Enter number for array
0
Enter number for array
0
4 7 9  -> Since the array is [5,6,4,5,6,7,9,0,0,0,0,0,0] only unique numbers are 4 7 9

NOTE: When you print unique numbers put space between them
 */