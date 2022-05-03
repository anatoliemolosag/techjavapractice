package Arrays;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {


        int[] studentNumbers = {3, 4, 6, 8, 2, 11, 12, 0, 9};
        System.out.println(studentNumbers[0]);//3
        System.out.println(studentNumbers.length);//9
        System.out.println(Arrays.toString(studentNumbers));//[3, 4, 6, 8, 2, 11, 12, 0, 9]
        studentNumbers[5] = 500;
        System.out.println(Arrays.toString(studentNumbers));//[3, 4, 6, 8, 2, 500, 12, 0, 9]
        studentNumbers[5]=789;
        System.out.println(Arrays.toString(studentNumbers));//[3, 4, 6, 8, 2, 789, 12, 0, 9]

        for (int k = studentNumbers.length-1; k>=0 ; k--){
            System.out.println(studentNumbers[k]);//9, 0, 12, 789, 2, 8, 6, 4, 3 ---> shows as oposite way form Array
        }

        int[] ids ={1,2,3,4};

        //studentNumbers[0]=ids;//this is not going to work , data type require to be the same

        ids[0] = studentNumbers[0];
        System.out.println(Arrays.toString(ids));//[3, 2, 3, 4]





    }
}