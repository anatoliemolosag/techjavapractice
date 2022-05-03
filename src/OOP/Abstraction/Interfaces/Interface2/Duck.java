package OOP.Abstraction.Interfaces.Interface2;

public class Duck extends Animal implements CanFly,CanSwim {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }

    @Override
    public void printInfo() {
        CanFly.super.printInfo();
    }
    @Override
    public void makeNoise(){
        System.out.println("duck is making noise");
    }
}
