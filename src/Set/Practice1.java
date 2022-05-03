package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        HashSet<String> days = new HashSet();

        HashSet days1 = new HashSet();

        HashSet<String> days2 = new HashSet();

        HashSet<String> days3 = new HashSet<>();

        Set day4 = new HashSet();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add(null);
        System.out.println(days);//[null, Monday, Wednesday, Tuesday]//hashSet does not have order

        //hashSet does not have get() methode

        for (String day : days){
            System.out.println(day);//null Monday Wednesday Tuesday
        }
        System.out.println("This are the days before adding Monday");
        System.out.println(days);
        days.add("Monday");
        System.out.println("This are the days before adding Monday");
        System.out.println(days);
        days.add(null);
        System.out.println(days);
        days.add("MONDAY");
        System.out.println(days);

        int size = days.size();
//by using iterator object you can iterate over collection ,like HashSet
        Iterator<String> iterator = days.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //days.remove("Monday");
            System.out.println(iterator.next());
            if(iterator.next().equals("Tuesday")){
                days.remove("Tuesday");

            }
        }
        System.out.println("================");
        System.out.println(days);
        System.out.println("================");


        Boolean b1 = days.contains("Friday");
        System.out.println(b1);//false

        boolean b2 = days.isEmpty();
        System.out.println(b2);//false

        days.remove(4);
        days.remove("Monday");
        System.out.println("After removing Monday: " +days);//After removing Monday: [null, MONDAY, Wednesday, Tuesday]
        Object d =days.clone();

        days.removeIf(x -> x.equalsIgnoreCase("wednesday"));


        System.out.println();

        days.clear();
        System.out.println(days);//[]

        System.out.println(d);//[null, MONDAY, Tuesday, Monday, Wednesday]







    }
}
