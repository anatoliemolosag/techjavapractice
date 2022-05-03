package Super;

public class cat extends Animal{

    public cat(){
        super(18,"Tony");
        System.out.println("super");


    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Meow Meow Meow!");
    }

    public void jump(){


    }

    public static void main(String[] args) {
        // cat myCat = new cat();
        Animal myAnimal = new Animal(18," Toni");
        System.out.println(myAnimal.age+myAnimal.name);





    }

}
