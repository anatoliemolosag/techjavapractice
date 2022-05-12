public class ArraySecondLargest {
    public static void main(String[] args) {


        int[] numbers = { 100,300,200,450,350 };

        int largest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>largest){
                thirdLargest=largest;
                secondLargest=largest;
                largest=numbers[i];
            } else if (numbers[i]>secondLargest&&numbers[i]!=largest){
                secondLargest=numbers[i];
            }else if (numbers[i]>thirdLargest&&numbers[i]!=secondLargest&&numbers[i]!=largest){
                thirdLargest=numbers[i];
            }

        }
        System.out.println(largest);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);













    }
































}
