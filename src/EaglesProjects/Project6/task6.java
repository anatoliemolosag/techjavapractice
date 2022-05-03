package EaglesProjects.Project6;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 8, 3, 2, 7, 9, 9};
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            String currentNumber = nums[i] + "";
            if (!str.contains(currentNumber)) {
                str+=currentNumber;
            }
        }
        System.out.println(str);
        // String to Array
        String[] unique= str.split("");
        System.out.println(Arrays.toString(unique));

    }
}
