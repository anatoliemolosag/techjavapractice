package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {

        HashMap<String , String> studentInfo = new HashMap();

        studentInfo.put("21", "Candan");
        studentInfo.put("2","Hacer");
        studentInfo.put("5", "Ahmed");
        studentInfo.put("8","Alex");

        System.out.println(studentInfo);//{2=Hacer, 5=Ahmed, 8=Alex, 21=Candan}

       studentInfo.put("9","Alex");
        System.out.println(studentInfo);//{2=Hacer, 5=Ahmed, 8=Alex, 9=Alex, 21=Candan}

        studentInfo.put("2","Bekjan");//if you put new value for the an existing key , it will update the value for that existing key
        System.out.println(studentInfo);//{2=Bekjan, 5=Ahmed, 8=Alex, 9=Alex, 21=Candan}

        studentInfo.put("4","");
        System.out.println(studentInfo);//{2=Bekjan, 4=, 5=Ahmed, 8=Alex, 9=Alex, 21=Candan}

        //get(); it takes key as a parameter and return matching value
        studentInfo.get("9");
        System.out.println(studentInfo.get("9"));//Alex

        System.out.println(studentInfo.get("4"));// nothing gives you back


        //null keys
        studentInfo.put(null,"Sam");
        System.out.println(studentInfo);//{null=Sam, 2=Bekjan, 4=, 5=Ahmed, 8=Alex, 9=Alex, 21=Candan}

        // null values
        studentInfo.put("10", null);
        studentInfo.put("11", null);
        studentInfo.put("12", null);
        studentInfo.put("13", null);
        System.out.println(studentInfo);//{null=Sam, 11=null, 12=null, 2=Bekjan, 13=null, 4=, 5=Ahmed, 8=Alex, 9=Alex, 21=Candan, 10=null}

        System.out.println(studentInfo.get("13"));//null
        System.out.println(studentInfo.get("100"));//null
        System.out.println("========================================================================");

        HashMap<Integer,String> map = new HashMap<>();
        map.put(6,"Phone");
        map.put(11,"Microphone");
        map.put(22, "Screen");
        System.out.println(studentInfo.get(5));//null
        System.out.println(map.get(11));//Microphone

        //only keys
        //keySet() --> return all the keys from given map

        System.out.println(map.keySet());//[6, 22, 11]

        HashSet keys = new HashSet(map.keySet());

        Set<Integer> allKeys =  map.keySet();
        System.out.println(allKeys);//[6, 22, 11]


        String x = learn();
        System.out.println(map.get(6));

        map.putIfAbsent(5,"Mouse");

        System.out.println(map);

        System.out.println("==========================");

        for(Integer key : allKeys){

            System.out.println(key);

        }

        //what if you want to get one at a time by using these keys

        System.out.println(map.get(22));// ->value of 22 --> "Screen"

        for(Integer key : allKeys){

            System.out.println(map.get(22));

        }









    }

public static String learn(){
        return "study";

}

}
