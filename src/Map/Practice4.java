package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice4 {

    /*
    Create a methode that will take a map<Integer, String> as a parameter
    This method will print out keys one by one
    test the method if it works
     */
    public static void printKeys (Map<Integer, String>map1){

        Set<Integer> keys =map1.keySet();

        for(Integer key : keys){
            System.out.println(key);
        }




    }

    /*
    Create a methode that will take a map<Integer, String> as a parameter
    This method will print out keys one by one
    test the method if it works
     */
    public static void printValues (Map<Integer,String > map2 ){

    Collection<String> values = map2.values();

        for (String value: values){
            System.out.println(value);
        }
    }

    /*
    Create a methode that will take a map<Integer, String> as a parameter
    This method will print out pairs one by one
    test the method if it works
     */
    public static void printPairs (Map<Integer,String > map3){

        //Collection<String> values = map3.values();

        for (Map.Entry<Integer,String > pairs: map3.entrySet()){
            System.out.println(pairs);
        }
    }

    public static void main(String[] args) {

        HashMap<Integer,String> departments = new HashMap<>();
        departments.put(5,"HR");
        departments.put(1,"Main Office");
        departments.put(3,"IT");
        departments.put(4,"Security");

        printKeys(departments);
        printValues(departments);
        printPairs(departments);
    }
}
