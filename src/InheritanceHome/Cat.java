package InheritanceHome;

public class Cat extends Domestic{

    String name ="fluffy";
    String eyeColor="Brown";
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");

    }

    @Override
    public void sleep(int hour) {
        System.out.println("Cat is sleeping : "+hour);
    }

    public void sleep(int hour,String location) {
        System.out.println("Cat is sleeping : "+hour + "in "+ location);
    }


    public void eat(String location) {
        System.out.println("Cat is eating at: "+location);
    }

    public Domestic sound(){
        System.out.println("cat is making sound");
        return new Domestic();

    }

    @Override
    public String toString() {
        return eyeColor;
    }
}
