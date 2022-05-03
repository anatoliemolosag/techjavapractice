package HOMEWORK.Homework5;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = {10,4,3,55,32,145,443,234,98,32};

        int number=array.length;
        boolean flag =false;
        System.out.println("Please enter number from array");
        int userNumber = input.nextInt();

        for(int i=0; i<array.length ; i++) {
            if(userNumber==array[i]){
                flag=true;
                array[i]=0;
            }

        }if(flag==true) {

            System.out.print(Arrays.toString(array));
        }
        if(!flag){
            System.out.println(false);
        }


        /*
        Create the int array with  numbers following,
 10,4,3,55,32,145,443,234,98,32 .
Then, using scanner  ask user to provide any number from given array, then remove the
value from array and put 0 instead of that number and PRINT the array.
If array doesn't contain the number PRINT "false".


Example:
Given Number:
145
Output:
[10, 4, 3, 55, 32, 0, 443, 234, 98, 32]

Example 2:
Given Number:
2000
Output:
false

Example 2:
Given Number:
32
Output:
[10, 4, 3, 55, 0, 145, 443, 234, 98, 0]


         */
    }
}
