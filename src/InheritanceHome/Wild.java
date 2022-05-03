package InheritanceHome;

public class Wild extends Animal{

    String name ;

    @Override
    public void sleep() {
        System.out.println("Wild is sleeping");
    }

    @Override
   public void move() {
        System.out.println("Wild animal is moving fast");
    }
    private void move(int speed){
        System.out.println("Wild animal is moving privately");
    }

    @Override
    public Wild sound() {
        System.out.println("Wild is making sound");
        return new Wild();
    }
}
