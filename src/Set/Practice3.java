package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Practice3 {
    public static void main(String[] args) {

        //ArrayList to HashSet

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(5);
        numbers.add(11);
        numbers.add(4);
        numbers.add(7);
        numbers.add(5);

        System.out.println(numbers);//[7, 5, 11, 4, 7, 5]

        HashSet<Integer> setOfNumbers = new HashSet<>(numbers);
        System.out.println(setOfNumbers);//[4, 5, 7, 11] (removed duplicates)

        TreeSet<Integer> treeSet = new TreeSet<>(numbers);
        System.out.println(treeSet);//[4, 5, 7, 11]

        treeSet.add(2);
        System.out.println(treeSet);//[2, 4, 5, 7, 11]

        //Convert from set to arrayList

        ArrayList<Integer> arrayList = new ArrayList(treeSet);
        System.out.println(arrayList);//[2, 4, 5, 7, 11]

        System.out.println(arrayList);
        System.out.println(arrayList.get(0)*2);//4

        //storing Integer Objects from set to ArrayList as String Objects while we convert from set to ArrayList
        ArrayList<String > arrayList2 = new ArrayList(treeSet);

        System.out.println(arrayList2);

        //System.out.println(arrayList2.get(0));

        //System.out.println(Integer.parseInt(arrayList2.get(0))*3);


    }


}
