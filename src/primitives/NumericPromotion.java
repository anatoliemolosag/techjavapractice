package primitives;

public class NumericPromotion {
    public static void main(String[] args) {

        byte b1 = 3;
        byte b2 = 6;

        //byte r1 = b1 + b2;
        //short r1 = b1+ b2 ;//

        int r1 = b1 + b2;
        System.out.println(r1);

        float f1 = 2.5f;
        float f2 = 3.1f;

        float r2 = f1 + f2;
        //float r3 = 4.5 + 5;//compile time error
        float r3 = 4.5f + 5;

        double r4 = f1 + f2;

        double d1 = 6;

        double r5 = r3 + d1;

        short sh1 = 45;

        long r6 = sh1 + b2;
        int i2 =45;
        long lng = i2;




        System.out.println(r3 + d1);//15.5
        System.out.println(r3);
        System.out.println(r4);

        System.out.println(r6);



    }
}
