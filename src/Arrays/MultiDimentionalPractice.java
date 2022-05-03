package Arrays;

import java.util.Arrays;

public class MultiDimentionalPractice {

    public static void main(String[] args) {

        int [][] numbers = new int[3][5];
        System.out.println(Arrays.deepToString(numbers));//[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        numbers[0][0]=11;//11
        System.out.println(Arrays.deepToString(numbers));//[[11, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        numbers[0][4]=22;
        System.out.println(Arrays.deepToString(numbers));//[[11, 0, 0, 0, 22], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        numbers[2][4]=6;
        System.out.println(Arrays.deepToString(numbers));//[[11, 0, 0, 0, 22], [0, 0, 0, 0, 0], [0, 0, 0, 0, 6]]

        System.out.println(numbers[0][4]);//22

        //numbers[1][5] = 77;//.ArrayIndexOutOfBoundsException

        //numbers[3][3]=9;//.ArrayIndexOutOfBoundsException

        int[] nums = new int[6];

        nums[3] = 8 ;
        System.out.println(Arrays.toString(nums));//[0, 0, 0, 8, 0, 0]

        numbers[0][0]= 200;
        System.out.println(numbers[0][0]);//200
        System.out.println(Arrays.deepToString(numbers));//[[200, 0, 0, 0, 22], [0, 0, 0, 0, 0], [0, 0, 0, 0, 6]]
        System.out.println(Arrays.toString(numbers[0]));//[200, 0, 0, 0, 22]

        System.out.println(Arrays.toString(numbers[2]));//[0, 0, 0, 0, 6]

        for(int i =0 ; i< numbers.length; i++){
            for(int j =0 ; j <numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
