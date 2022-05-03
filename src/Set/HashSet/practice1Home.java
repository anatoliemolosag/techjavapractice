package Set.HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class practice1Home {
    public static void main(String[] args) {

        HashSet<String> days = new HashSet();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
       //ays.add(null);
        days.remove("Tbuesday");


        Iterator<String> it = days.iterator();

        while (it.hasNext()){
            if(it.next().equals("Monday")){
days.remove("Monday");
break;

            }

        }

    }
}
