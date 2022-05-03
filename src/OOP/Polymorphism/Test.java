package OOP.Polymorphism;

public class Test {

    public static void main(String[] args) {
        A a = new B();
        //B is child of A so B is also A
        Object o = new String();
        //String extends the object so String is an also object

        A a1 = new A();
        a.m1(a1);
        a1.m1(a1);

        B b = new B();
        b.m1(a1);
        a1=b;
        a1.m1(a1);

        B b2 = new B();
        b2.m1(new B());

        A a3 = new A();
        a3.m1(new B());//from class A
        //We can alway instatntiate super class object with sub class




        ////reference and pointer













    }

}
