package InheritanceHome;

public class Animal {
    String name= "animal";
    int age;
    String color;

    public void sleep(){

        int a= 1, b=2,c=0;
        System.out.println(a+b+c);
        System.out.println("Animal is sleeping");
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



}
