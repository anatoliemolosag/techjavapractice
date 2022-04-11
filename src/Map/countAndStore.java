package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class countAndStore {
    public static void main(String[] args) {


        LinkedHashMap<Character,Integer> map =  new LinkedHashMap<>();

        String str="SSpring will come soon!";
/*
 S-1
 p-1
 r-1
 i-2
 n-2
 ...
 0-3
 outcome {S=1,p=1,r=1,i=2,...*/

        for (int i =0 ; i<str.length(); i++ ){

            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            }else {
                //int count =map.get(str.charAt(i));
                map.put(str.charAt(i), map.get(str.charAt(i))+1 );



            }
        }
        System.out.println(map);


    }
}
