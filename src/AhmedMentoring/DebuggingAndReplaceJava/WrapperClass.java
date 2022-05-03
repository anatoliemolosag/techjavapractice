package AhmedMentoring.DebuggingAndReplaceJava;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

    /*OCA
    Interview Questions
    1-What is wrapper class?
    Wrapper Class : is a way(process) to to convert data into different forms.
       *primitive to object
       *Object to primitives

     2)How many ways(types) of wrapper class do you know?
     *I know 2 types of wrapper classes SIR/MADAM
     First type : Auto-Boxing -->  primitive to object
     Second type : Unboxing --> object to primitive

     3) Where do you use wrapper class in your project?
     I use wrapper class mostly in collections


     */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();//it stores only object
        int age =30;//primitive
        numbers.add(age);//AutoBoxing
        //numbers.get(0).equals();//in here a proof that your primitive data converted to object

        //Special Notes : String is not a type of wrapper class
       //Optional for you : String example =  String.valueOf(age);//autoboxing because it accepts primitive and return return object(string)
        // return object string
        String testNumber ="12";
        int test = Integer.parseInt(testNumber);//unboxing because it accepts object and returns primitive(int)
        //test ==> it is a proof that the object is converted to primitive.
        //double test1 =Double.parseDouble();




    }

}
