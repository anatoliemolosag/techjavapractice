package InterviewQuestions;

import java.util.Arrays;

public class ArraySecondLargestNumber {
    public static void main(String[] args) {

        int[] num ={12,13,12,15,0,-1};

        Arrays.sort(num);

       // System.out.println(num[num.length-2]);

        int[] array = {100,300,200, 450, 350};
        int largest= 0;
        int secondLargest = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i]>largest){
                //secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i]!= largest) {

                secondLargest=array[i];
            }

        }
        System.out.println(largest);
        System.out.println(secondLargest);


    }
}
