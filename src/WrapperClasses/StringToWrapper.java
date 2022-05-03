package WrapperClasses;

import com.sun.jdi.IntegerValue;

public class StringToWrapper {

    public static void main(String[] args) {

        String city = "5";

        System.out.println(city+2);//52
        System.out.println(Integer.valueOf(city));//5
        Integer cityNumber = Integer.valueOf(city);
        System.out.println(cityNumber+2);//7

        Integer a = Integer.parseInt(city);//autoboxing is happening itself , since parseInt() methode is
        //returning primitive int number ,  java is converting it to wrapper

        int b = Integer.valueOf(city);//autoboxing is happening itself , since parseInt() methode is
        //returning primitive int number ,  java is converting it to wrapper

        String condition = "true";
        Boolean bl1 = Boolean.valueOf(condition);
        System.out.println(bl1);//true

        String condition1 = "!true";
        Boolean bl2 = Boolean.valueOf(condition1);
        System.out.println(bl2);//false

        boolean bl3 = Boolean.valueOf(condition1);

        String test = "Today is April 2";
        //task  the number 2 from the given string and add 5 it and show result

//        test = test.substring(test.length()-1);
//
//        int number = Integer.parseInt(test);
//        System.out.println(number+5);

        String[] words =test.split(" ");
        System.out.println(Integer.parseInt(words[words.length-1])+5);

sumInt("Today is april 2");


    }

    public static Integer sumInt(String test){


        String[] words =test.split(" ");
        System.out.println(Integer.parseInt(words[words.length-1])+5);
        return Integer.parseInt(words[words.length-1])+5;


    }

}
