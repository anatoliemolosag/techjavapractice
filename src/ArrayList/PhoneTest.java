package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.List.*;

public class PhoneTest {
    public static void main(String[] args) {

        Phone phone1 = new Phone("A",10);
        Phone phone2 = new Phone("B",20);
        Phone phone3 = new Phone("C",30);

        ArrayList<Phone> storage = new ArrayList<>();



        storage.add(phone1);
        storage.add(phone2);
        storage.add(phone3);

        System.out.println(storage);


        storage.set(0,new Phone("Google",30));

        List<Phone> list =new ArrayList<>();
        list.addAll(storage);
        list.size();
        Phone z = list.get(0);
        System.out.println(z);

    }

}
