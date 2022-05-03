package HOMEWORK.Homework5;

import java.util.Scanner;

public class PrintFirstUnique {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[7];
        int number=array.length;

        boolean flag = false;

        for(int i=0; i<array.length ; i++) {
            System.out.println("Enter number for array");
            int userNumber = input.nextInt();
            array[i] = userNumber;
        }

            for (int i = 0; i < number; i++) {
                int j;
                for (j = 0; j < number; j++){
                    if (i != j && array[i] == array[j])
                        break;}
                if (j == number){
                    System.out.println(array[i]);
            flag=true;
            }}

        if(!flag)System.out.println("Array doesn't have any unique element");
        }

        /*
        Create the array size of 7 and store every number by asking user via scanner in the loop.
When asking user please use the text -> "Enter number for array" .
After having all numbers for array print ONLY the first unique value from this array.
If the array doesn't have any unique element print the text below
"Array doesn't have any unique element"

EXAMPLE OUTPUT

Enter number for array
1
Enter number for array
2
Enter number for array
4
Enter number for array
1
Enter number for array
2
Enter number for array
3
Enter number for array
4
3  -> 3 is printed because array have [1,2,4,1,2,3,4] and first unique element from array is 3
         */
    }

