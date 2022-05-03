package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");

        Object[] array = list.toArray();

        System.out.println(Arrays.toString(array));

        array[1]= "test";
        System.out.println(Arrays.toString(array));

        list.add("orange");

        System.out.println(list);
        System.out.println("--------------------");
        System.out.println(Arrays.toString(array));




    }


}
