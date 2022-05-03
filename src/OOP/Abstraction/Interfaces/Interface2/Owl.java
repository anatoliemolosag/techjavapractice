package OOP.Abstraction.Interfaces.Interface2;

public class Owl extends Animal implements CanFly{

    @Override
    public void fly() {
        System.out.println("Owl is flying");
    }

    @Override
    public void printInfo() {
        CanFly.super.printInfo();
    }
}
