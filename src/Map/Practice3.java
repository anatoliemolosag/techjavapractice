package Map;

import java.util.*;
import java.util.Map.Entry;

public class Practice3 {

    public static void main(String[] args) {

        HashMap<String , String> cityStates = new HashMap<>();

        cityStates.put("Chicago" , "IL");
        cityStates.put("Des Plaines" , "IL");
        cityStates.put("Lake Forest" , "IL");
        cityStates.put("Columbus" , "IL");
        cityStates.put("Miami" , "FL");

        System.out.println(cityStates.get("Chicago"));//IL
        System.out.println(cityStates.keySet());//[Chicago, Des Plaines, Lake Forest, Columbus, Miami]
        System.out.println(cityStates.values());//[IL, IL, IL, IL, FL]

        //entrySet();
          Set a = cityStates.entrySet();

        System.out.println(cityStates.entrySet());//return as List , [Chicago=IL, Des Plaines=IL, Lake Forest=IL, Columbus=IL, Miami=FL]

        Set<Entry<String,String>> pairs = cityStates.entrySet();

        for(Map.Entry<String,String> pair : pairs){
            System.out.println(pair);
        }
       

    }
}
