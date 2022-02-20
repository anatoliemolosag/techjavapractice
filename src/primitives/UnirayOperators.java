package primitives;

public class UnirayOperators {
    public static void main(String[] args) {


        int studentNumbers = 25;
        System.out.println(studentNumbers);//25

        studentNumbers++;
        System.out.println(studentNumbers);//26
        System.out.println(studentNumbers++);//26 , shows 26 , studentNumber = 27
        System.out.println(studentNumbers);//27

        ++studentNumbers;
        System.out.println(studentNumbers);//28
        System.out.println(++studentNumbers);//29 shows , studenNumber 29
        System.out.println(studentNumbers);//29

        int a =5 ;
        int i = a++;
        int k = --i + ++a;

        System.out.println("value od a >> " +a );
        System.out.println("value of i>> " + i);
        System.out.println("value of k >> " + k );

        System.out.println(--k);
        System.out.println(k--);

        /*int a = 5;
          System.out.println(a);
          int i = a++;
          System.out.println(a+" "+i);
          int k = --i + ++a;
          System.out.println("Value of a >>" + a);
          System.out.println("Value of i >>" + i);
          System.out.println("Value of k >>" + k);
          
         */


    }
}