package OOP.Abstraction.AbstractionClasses;

public class OnlineStudentsClass extends Student {

    public OnlineStudentsClass(){
        super("David",23);


    }
    @Override
    public void attend(){
        System.out.println("Online student is attending via zoom meeting");
    }
    @Override
    void watch (){
        System.out.println("Online student is watching the lecture");
    }

    void study(){
        System.out.println("Online student studies more");
    }

}
