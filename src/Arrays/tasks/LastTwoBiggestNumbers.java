package Arrays.tasks;

public class LastTwoBiggestNumbers {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,7,8,9, };
        int largest = numbers[0];
        int secondLargest = numbers[0];
        int thirdLargest =numbers[0];
        int fourthLargest = numbers[0];

        for (int i= 1 ; i<numbers.length ; i++){
            if(numbers[i]>largest){
                secondLargest=largest;
                largest=numbers[i];
            }
            if (numbers[i]!= largest && numbers[i]>secondLargest){
                secondLargest=numbers[i];
            }
            if (numbers[i]!=largest&& numbers[i]!= secondLargest && numbers[i] > thirdLargest ){
                thirdLargest = numbers[i];

            }
            if (numbers[i]!=largest&& numbers[i]!= secondLargest && numbers[i] != thirdLargest &&numbers[i]>fourthLargest ){
                fourthLargest = numbers[i];

            }

        }
        System.out.println(largest);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);
        System.out.println(fourthLargest);
    }
}
