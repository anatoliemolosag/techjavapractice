package ArrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("orange");
        fruits.add("Apple");
        fruits.add("grape");
        fruits.add("banana");
        fruits.add("kiwi");
        System.out.println(fruits);//[orange, Apple, grape, banana]
        System.out.println(fruits.size());//5
        System.out.println("=====================================");
        //remove
        fruits.remove(1);
        System.out.println(fruits);//[orange, grape, banana]
        System.out.println(fruits.size());//4

        System.out.println("========================================");
        fruits.remove("orange");
        System.out.println(fruits);//[grape, banana]
        System.out.println(fruits.size());//3

        System.out.println("==========================================");

        ArrayList<String> drinks = new ArrayList<String>();

        drinks.add("coke");
        drinks.add("tea");
        drinks.add("water");


        fruits.addAll(drinks);
        System.out.println(fruits);//[grape, banana, kiwi, coke, tea, water]

        fruits.removeAll(drinks);
        System.out.println(fruits);//[grape, banana, kiwi]

        fruits.removeAll(fruits);
        System.out.println(fruits);//[]
        System.out.println("===============================================");

        ArrayList<Integer>zipCodes = new ArrayList<>();

        zipCodes.add(111);
        zipCodes.add(222);
        System.out.println(zipCodes);

        //fruits.addAll(zipCodes ; will not compile because of different data types

        //clear();
        zipCodes.clear();
        System.out.println(zipCodes);

        //replace();
        String string = "Java";
        string = string.replace("a", "i");
        System.out.println(string);//Jivi
        System.out.println("==================================================================");

        //set();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);
        numbers.add(66);

        numbers.set(3,300);
        System.out.println(numbers);//[11, 22, 33, 300, 55, 66]

        boolean b1 = numbers.isEmpty();
        System.out.println(b1);//false

        System.out.println(fruits.isEmpty());//true
        System.out.println(drinks.isEmpty());//false
        System.out.println(drinks);
        System.out.println("=======================================================");

        //contains
        boolean b2 = drinks.contains("water");
        System.out.println(b2);//true
        boolean b3 = drinks.contains("WATER");
        System.out.println(b3);//false

        boolean b4 = drinks.get(2).equalsIgnoreCase("WATER");
        System.out.println(b4);//true
        int index = drinks.indexOf("tea");
        System.out.println(index);//1



        //clone();

        Object name = drinks.clone();
        System.out.println(name);

        //ArrayList<Object> cloneOf drinks.clone();








    }
}
