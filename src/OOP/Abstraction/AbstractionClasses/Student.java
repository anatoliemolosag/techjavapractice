package OOP.Abstraction.AbstractionClasses;

public abstract class Student {

    String name ;
    int age;

    public Student(String name , int age){
        this.name=name;
        this.age=age;
    }

    public abstract void attend();

    abstract void watch();

    void sleep(){
        System.out.println("Everybody sleeping");
    }


}
