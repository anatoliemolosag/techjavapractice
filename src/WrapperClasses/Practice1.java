package WrapperClasses;

import StaticPractice.Bottle;

public class Practice1 {
    public static void main(String[] args) {

        byte b =5;
        Byte bt = new Byte(b);

        short s =4;
        Short sh = new Short(s);

        Integer i1 = new Integer(2);

        Long lg  = new Long(2);

        Float fl = new Float(4.5);

        Double db = new Double(6.7);

        Boolean bl = new Boolean(true);

        Character ch = new Character('L');

        System.out.println(db);

        Integer number = 25 ;//AutoBoxing  --> converting primitive to Wrapper class object

        Boolean yesNo = false ; //AutoBoxing  --> converting primitive to Wrapper class object

        Double count = 2.3;

        double primitiveCount = count; //Unboxing --> converting from Wrapper Class to Primitives

        char symbol = ch ;//Unboxing --> converting from Wrapper Class to Primitives

        Character lulu = symbol;




    }
}
