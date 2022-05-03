package OOP.Inheritance;

import java.lang.reflect.AnnotatedArrayType;

public class Animal {

    String name = "Animal";
    private int age;
    String color;
    String eyeColor;

    public void  sleep(){

        int a =1 , b = 2 , c = 0;
        System.out.println(a+b+c);

        System.out.println(" animal is sleeping");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
    void move(){
        System.out.println("Animal is moving");
    }

    public Animal sound(){

        System.out.println("Animal is making sound");
        return new Animal();
    }

    @Override
    public String toString() {
return eyeColor;
    }
}
