package OOP.Abstraction.Interfaces.Interface2;

public class test {

    public static void main(String[] args) {
        //Fish,Owl , Duck

        Fish fish = new Fish();
        fish.swim();
        fish.makeNoise();
        fish.eat();//static methods are not inherited to child classes

        Owl owl =new Owl();
        owl.fly();
        owl.printInfo();
        owl.makeNoise();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        duck.makeNoise();


    }
}
