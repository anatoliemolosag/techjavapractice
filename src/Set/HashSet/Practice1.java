package Set.HashSet;

import java.util.*;

public class Practice1 {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------");

        HashSet<String> names = new HashSet<String>();
        names.add("lulu");
        names.add(("Marcel"));
        names.add("gigel");
        names.add("Cosmin");
        names.remove("gigel");

        Iterator<String> it = names.iterator();


        while (it.hasNext()) {

            System.out.println(it.next());
        }

        for(String n : names ){
            //System.out.println(n);

        }

        System.out.println("--------------------------------------------------------------------------");


        LinkedHashSet<Integer> numbers = new LinkedHashSet();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        for(int num : numbers){
            System.out.println(num);
        }


        System.out.println("--------------------------------------------------------------------------");


        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Bananas");

       for(String fruit : fruits){

           System.out.println(fruit);

       }


       Iterator<String> i = fruits.iterator();
       while (i.hasNext()){
           System.out.println(i.next());
       }
        System.out.println("=================");















    }
}
