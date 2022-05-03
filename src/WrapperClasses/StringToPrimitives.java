package WrapperClasses;

public class StringToPrimitives {

    public static void main(String[] args) {

        String a = "10";

        String b = "20";

        System.out.println(a+b);//1020

        //parse
        int number = Integer.parseInt(a);
        int number2 = Integer.parseInt(b);
        System.out.println(number+number2);
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b) );

        String c = "L";
        //you can not parse string to character

//        int numberC = Integer.parseInt(c);//NumberFormatException.java:67)
//        System.out.println(numberC);//NumberFormatException.java:67)

        String d = "false";
        boolean primitiveD = Boolean.parseBoolean(d);
        System.out.println(primitiveD);//true (true as a boolean (converted))
        System.out.println(primitiveD==false);

        String d1 = "x";

        boolean D1 = Boolean.parseBoolean(d1);
        System.out.println(D1);//false
        System.out.println("---");
        System.out.println(Boolean.parseBoolean(d1));








    }
}
