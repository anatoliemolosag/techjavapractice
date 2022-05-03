package ArrayList;

import java.util.ArrayList;

public class Practice {

    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList(4);
        ArrayList <Integer>  list2 = new ArrayList();
        ArrayList list3 = new ArrayList<Integer>();
        ArrayList<String> list4 = new ArrayList<String>();

        System.out.println(list);//[]

        list.add(34);
        System.out.println(list);//[34]

        list.add(5);
        System.out.println(list);//[34, 5]

        list.add(77);
        System.out.println(list);//[34, 5, 77]

        list.add(1,66);
        System.out.println(list);//[34, 66, 5, 77]

        list.add(0,100);//[100, 34, 66, 5, 77]
        System.out.println(list);

//        list.add(11,99);
//        System.out.println(list);//IndexOutOfBoundsException Index: 11, Size: 5

        list.add("Saturday");
        System.out.println(list);//[100, 34, 66, 5, 77, Saturday]

        list.get(5);
        System.out.println(list.get(5));//Saturday

        System.out.println(list.get(list.size()-1));//Saturday

        System.out.println(list.size());//list size number returns

        for ( int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("======================================================");

        for(Object element : list ){
            System.out.println(element);
        }







    }
}
