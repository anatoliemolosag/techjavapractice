package Arrays;

import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int[] numbers = {4,7,8,12,1,25,380,3};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));//[1, 3, 4, 7, 8, 12, 25, 380]

        System.out.println(Arrays.binarySearch(numbers , 12));//5
        System.out.println(Arrays.binarySearch(numbers , 2));//-2
        System.out.println(Arrays.binarySearch(numbers , 9));//-6
        int num= Arrays.binarySearch(numbers , 12);
        System.out.println(num);//5

    }
}
