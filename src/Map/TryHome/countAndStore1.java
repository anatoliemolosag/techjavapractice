package Map.TryHome;

import java.util.LinkedHashMap;

public class countAndStore1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        String[] array = {"Green","Green","Green", "Yellow", "Yellow","Blue"};

        for (int i = 0; i < array.length; i++) {

            if(!map.containsKey(array[i])){

                map.put(array[i],1);

            }else {
                map.put(array[i],map.get(array[i])+1);
            }


        }
        System.out.println(map);
    }
}
