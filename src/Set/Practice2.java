package Set;

import javax.swing.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {


        HashSet<String> color1 = new HashSet<>();//no order
        LinkedHashSet<String> color2 = new LinkedHashSet<>();//aranging the same as you declare
        TreeSet<String> color3 = new TreeSet<>();//arranging A to Z
        color1.add("Green");    color2.add("Green");        color3.add("Green");
        color1.add("Yellow");   color2.add("Yellow");       color3.add("Yellow");
        color1.add("Blue");     color2.add("Blue");         color3.add("Blue");
        color1.add("Black");    color2.add("Black");        color3.add("Black");
        color1.add(null);       color2.add(null);           //color3.add(null);
        System.out.println(color1);//[null,Yellow, Blue, Black, Green]
        System.out.println(color2);//[Green, Yellow, Blue, Black,null]
        System.out.println(color3);//[Black, Blue, Green, Yellow]

        System.out.println(color3.first());//Black

        System.out.println(color3.last());//Yellow

        //System.out.println(color3.pollFirst());//Black

        //System.out.println(color3.pollLast());//Yellow


        color3.descendingSet();
        System.out.println(color3);


    }
}