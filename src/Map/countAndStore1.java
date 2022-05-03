package Map;

import java.util.HashMap;

public class countAndStore1 {
    public static void main(String[] args) {

        String[] colors = {"Green", "Yellow","blue" , "red" , "red" , "Orange", "Orange", "Orange"};
        HashMap<String ,Integer> map = new HashMap<>();

        for(String color : colors){

            if(map.containsKey(color)) {
                map.put(color, map.get(color)+1 );
            }
            else {
                map.put(color, 1);


            }
        }

        System.out.println(map);
    }
}
