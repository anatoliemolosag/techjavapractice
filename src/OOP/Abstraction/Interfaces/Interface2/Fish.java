package OOP.Abstraction.Interfaces.Interface2;

public class Fish extends Animal implements CanSwim {

    public void swim(){
        System.out.println("Fish can swim");
    }

    public void makeNoise(){
        System.out.println("Blah, Blah");
    }
    public static void eat(){
        System.out.println("Fish is eating");
    }

}
