package OOP.Abstraction.AbstractionClasses;

public class Campus extends Student{

    @Override
    public void attend() {
        System.out.println("Campus student is attending in person");
    }

    @Override
    void watch() {
        System.out.println();
    }
    public Campus(){
        super("Ahmed",23);
    }
    public void study(){
        System.out.println("Study");
    }
}
