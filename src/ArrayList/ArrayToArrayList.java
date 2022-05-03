package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        List<Integer> numbers1 =Arrays.asList(111,222,333,444,555,666);
        System.out.println(numbers1);

        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        list.add(6);
        System.out.println(list);
        System.out.println("--------------------------");

        int[]numbers={4,5,6,7};
        List<int[]> nums =Arrays.asList(numbers);

       // nums.add(9);
        System.out.println(Arrays.toString(nums.get(0)));


    }
}
