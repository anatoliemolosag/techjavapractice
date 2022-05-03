package Map.TryHome;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class countAndStore {

    public static void main(String[] args) {

        LinkedHashMap <Character,Integer> map = new LinkedHashMap<>();

        String str = "I love java";

        for (int i = 0; i < str.length(); i++) {

            if (!map.containsKey(str.charAt(i))){

                map.put(str.charAt(i),1);
            }
            else {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }


        }
        System.out.println(map);


    }
}
