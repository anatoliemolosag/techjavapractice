package OOP.Polymorphism;

import java.util.HashMap;
import java.util.Map;

public class StaticPoly1 {
    int num=5;
    int num2=6;
    static int num3=6;
    public int findMultiplication(){
        return num*num2;
    }
    public static void method(String s){
        System.out.println(s);
        main(s.split(" "));
    }


    public static void main(String[] args) {
        method();}
    public static void main(){}
    public static void method(){
        String s= "Overloading is compile time (static) polymorphism";
        main();
        main(s.split(" "));
    }
    Map<String,Integer> m= new HashMap<>();
    // m.put()--> method in HashMap class overrides the put method // this would work m.put("s", 3);
    // it is going to use until run time
    // After we run java figures out which method to use
    // That's why overriding is called run time (dynamic) polymorphism,

}
// All static variables and methods will compile first in the class, and we can do interaction between all statics
// than all non-static methods or variables will compile, and we can do interaction
// we cannot override the static method ,  because  being static happens in a compile time
// and overriding happens in run time
