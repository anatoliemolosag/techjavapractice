package Objects;

public class TestAnimal {
    public static void main(String[] args) {

        Animal cat = new Animal();

        System.out.println(cat.name);//null

        cat.name= "Leo";

        System.out.println(cat.name);//Leo

        cat.age =2;
        cat.numberOfLegs = 4;

        System.out.println(cat.color);//null
        cat.color ="orange";

        System.out.println(cat.color);//orange

        Animal cat1 = new Animal();

        System.out.println(cat1.color);//White

        cat1.color="Brown";
        System.out.println(cat1.color);//Brown

        //create a new dog object and initialize color, legs, age of the dog
        //show them

       Animal dog  = new Animal();
       dog.color= "white";
       dog.name="Marcel";
       dog.numberOfLegs=4;
       dog.age=39;

       System.out.println("***************");
       System.out.println("Info of my dog");
       System.out.println(dog.color);//white
        System.out.println(dog.name);//Marcel
        System.out.println(dog.numberOfLegs);//4
        System.out.println(dog.age);//39

        cat.run();//Leo is running

        dog.sleep();//Marcel is sleeping
        //you can not use methods with void return type in the sout
        //System.out.println(dog.sleep());

        System.out.println(cat.energy);//0
        cat.sleep();
        System.out.println(cat.energy);//100
        System.out.println(dog.energy);//100
        cat.run();//Leo is running.Energi is 90
        cat.run();//Leo is running.Energi is 80

        cat.sum();//8
        System.out.println(cat.sum());//8
        int result =cat.sum();
        System.out.println(result);//8
        System.out.println(cat1.run());//-10

        dog.printInfo();//Info of my dog//white//Marcel//4//39

        Animal elephant = new Animal();
        elephant.printInfo();
        elephant.color="Grey";
        elephant.name = "Damboo";
        elephant.age=12;
        elephant.numberOfLegs = 4;
        elephant.energy = 200;
        elephant.printInfo();////white//Damboo//4//39//200



    }
}
