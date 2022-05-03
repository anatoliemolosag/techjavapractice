package HashTable;

import java.io.PrintStream;
import java.util.Hashtable;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

        Hashtable <String,Integer> table =  new Hashtable<>();

        table.put("Java", 100);
        table.put("Selenium",200);
        table.put("History", 300);
        table.put("Math", 400);

        System.out.println(table.get("History"));

        //table.put(null,500);we can not store null keys//
        //table.put("Softskill",null); we can not store null values//
        System.out.println(table);

        //get all the keys from this table and print out a "History is at 300"

        for (String key : table.keySet()){
            System.out.println(key + " is @ " + table.get(key));
        }


        //entrySet
        System.out.println("==================================================");
        for (Map.Entry<String,Integer> pairs :table.entrySet()){
            System.out.println(pairs);
            System.out.println("key " + pairs.getKey());
            System.out.println("Value " + pairs.getValue());
        }

    }
}
