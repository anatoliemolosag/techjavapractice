package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Practice2 {

    public static void main(String[] args) {

        HashMap<String , String> cityStates = new HashMap<>();

        cityStates.put("Chicago" , "IL");
        cityStates.put("Des Plaines" , "IL");
        cityStates.put("Lake Forest" , "IL");
        cityStates.put("Columbus" , "IL");
        cityStates.put("Miami" , "FL");

        //remove(); it will remove the value(Object) for given key
        cityStates.remove("Des Plaines");
        System.out.println(cityStates);//{Chicago=IL, Lake Forest=IL, Columbus=IL, Miami=FL}

        //replace();
        cityStates.replace("Miami", "Florida");
        System.out.println(cityStates);//{Chicago=IL, Lake Forest=IL, Columbus=IL, Miami=Florida}

        cityStates.replace("Miami","Florida","New York");
        System.out.println(cityStates);//{Chicago=IL, Lake Forest=IL, Columbus=IL, Miami=New York}

        //containsValue
        System.out.println(cityStates.containsValue("New York"));//true
        System.out.println(cityStates.containsValue("xxx"));//false

        //containsKey();

        System.out.println(cityStates.containsKey("Chicago"));//true
        System.out.println(cityStates.containsKey("Des Plaines"));//false


        //size();

        Integer size = cityStates.size();
        System.out.println(size);//4

        Double size1 = (double)cityStates.size();
        System.out.println(size1);//4.0

        //isEmpty();
        System.out.println(cityStates.isEmpty());//false

        //clear();
//        cityStates.clear();
//        System.out.println(cityStates.isEmpty());//true

        //value()
        System.out.println(cityStates.values());

        Collection<String> values =cityStates.values();

        for (String value : values){
            System.out.println(value.toLowerCase());

        }

        ArrayList list = new ArrayList(cityStates.values());
        System.out.println(list);//[IL, IL, IL, New York]

        System.out.println(list.get(3));//New York

        HashSet set = new HashSet<>(cityStates.values());
        System.out.println(set);//[New York, IL]




    }
}
