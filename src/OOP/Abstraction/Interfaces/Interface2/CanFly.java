package OOP.Abstraction.Interfaces.Interface2;

public interface CanFly {

    int WINGS =2;
    int TAIL=1;

    void fly();

    default void printInfo(){
        System.out.println("Wings: "+WINGS);
    }

}
