import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {


        //prevent from duplicates

        ArrayList aList = new ArrayList<>();

        aList.add("John");
        aList.add("James");
        aList.add("Jane");
        aList.add("John");
        aList.add("James");
        aList.add("Jane");
        System.out.println(aList);

        HashSet set = new HashSet<>(aList);

        System.out.println(set);


        HashSet set1 = new HashSet<>();

        for (Object name  : aList){

            set1.add(name);


        }

        System.out.println(set1);












    }


}
