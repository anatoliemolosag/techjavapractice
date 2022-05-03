package Super;

public class Animal {
    int age;
    String name;

    public Animal(int age ,String name){
        this.age=age;
        this.name=name;
        System.out.println("hello i am constructor");

    }

    public void makeNoise(){

        System.out.println("Hello i am an animal");

    }
    public void eat(){
        System.out.println(" Munch Munch");
    }

}
