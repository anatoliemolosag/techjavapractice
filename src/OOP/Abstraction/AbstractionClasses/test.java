package OOP.Abstraction.AbstractionClasses;

public class test {

    public static void main(String[] args) {

       // Student student = new Student();
       // B12 b12 = new B12() ;

        Campus campus = new Campus();

        campus.watch();
        campus.study();

        OnlineStudentsClass onlineStudentsClass=new OnlineStudentsClass();
        onlineStudentsClass.watch();

        John john = new John();

        john.sleep();



    }
}
