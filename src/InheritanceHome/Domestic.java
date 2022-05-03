package InheritanceHome;

public class Domestic extends Animal{

    String eyeColor ="blue";

    @Override
    public void sleep() {
        System.out.println("Domestic is sleeping");
    }


    public void sleep(int hour) {
        System.out.println("Domestic sleeping : "+hour);

    }
    public void eat(int hour) {
        System.out.println("Domestic is eating "+hour);
    }

    public Domestic sound(){
        System.out.println("Domestic is making sound");
        return new Cat();
    }

    @Override
    public String toString() {
        return eyeColor;
    }
}
