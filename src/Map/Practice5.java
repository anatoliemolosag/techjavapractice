package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practice5 {
    public static void main(String[] args) {



    HashMap<String , String> map1 = new HashMap<>();
        LinkedHashMap<String ,String> map2 = new LinkedHashMap<>();
        TreeMap<String,String> map3 = new TreeMap<>();

        map1.put("Chicago" , "IL");           map2.put("Chicago" , "IL");               map3.put("Chicago" , "IL");
        map1.put("Des Plaines" , "IL");       map2.put("Des Plaines" , "IL");           map3.put("Des Plaines" , "IL");
        map1.put("Lake Forest" , "IL");       map2.put("Lake Forest" , "IL");           map3.put("Lake Forest" , "IL");
        map1.put("Columbus" , "IL");          map2.put("Columbus" , "IL");              map3.put("Columbus" , "IL");
        map1.put("Miami" , "FL");             map2.put("Miami" , "FL");                 map3.put("Miami" , "FL");

        //comparing the keys to see if each type of map is using different implementation for their key structure
        //System.out.println(map1);             System.out.println(map2);                 System.out.println(map3);
        System.out.println("************************************************************************************");
//putting null keys for each map
       // map1.put(null,"Tx");                  map2.put(null,"Tx");                     // map3.put(null,"Tx");

        System.out.println(map1);             System.out.println(map2);                 System.out.println(map3);

        System.out.println("*********************************************************************************");
        //putting null values for each map
        map1.put("Denver", null);             map2.put("Denver" , null);                map3.put("Denver" , null);
        System.out.println(map1);             System.out.println(map2);                 System.out.println(map3);

        System.out.println("*********************************************************************************");

        map3.put("a", "a");
        map3.put("b","b");
        map1.putAll(map3);


        System.out.println(map1);
        System.out.println("----------------------------------------------------------------------------------");










    }

}
