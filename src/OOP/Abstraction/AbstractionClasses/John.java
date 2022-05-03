package OOP.Abstraction.AbstractionClasses;

public class John extends SelfLerner{

    @Override
    public void read() {
        System.out.println("John is reading");
    }

    @Override
    public void attend() {

        System.out.println("John is attending");

    }

    @Override
    void watch() {

        System.out.println("John is watching");

    }

    public John(){

    }

}
