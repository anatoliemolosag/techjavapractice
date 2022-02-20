package primitives;

public class DataTypes {
    public static void main(String[] args) {

        byte number = 127;
        byte number1 = -13;
        number = number1;

        System.out.println(number);

        System.out.println(number1);

        short number2 = 55;

        short number3 = number;
        System.out.println("This is number3 --> " + number3);
        number =99;
        int number4 = number;
        System.out.println(number4);

        int number5 = 1215637258;

        int number6 = 5;

        float number8 = 3; // 3.0
        float number9 =2.9f;

        float num1 = number6;
        System.out.println(number6);
        System.out.println(num1);

        double d = 5.6d;
        double a = 4.5d ;
        double c = d ;

        System.out.println(d + c);

        long longNumb = 2131323232l;
        long longNum1 = 1_0_00_000_000l;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        boolean bl = true;
        System.out.println(bl);









    }

    }

