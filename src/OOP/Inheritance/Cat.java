package OOP.Inheritance;

public class Cat extends Domestic {



    String name = "Lola";
    String eyeColor = "Brown";
    @Override
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    @Override
    public void sleep(int hour) {
        System.out.println("cat is sleeping: "+ hour);
    }

    public void sleep(int hour,String location) {
        System.out.println("cat is sleeping: "+ hour + "in" + location);
    }

    public void eat(String location){
        System.out.println("Cat is eating at: "+ location);
    }

    public Domestic sound(){
        System.out.println("Cat is making sound");
        return new Cat();
    }

    @Override
    public String toString() {
        return eyeColor;
    }
}
