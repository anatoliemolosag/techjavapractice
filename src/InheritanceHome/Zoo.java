package InheritanceHome;

public class Zoo {

    public static void main(String[] args) {

        Animal animal =new Animal();
        System.out.println(animal.name);
        animal.name="king";
        System.out.println(animal.name);


        Domestic domestic = new Domestic();
        System.out.println(domestic.name);
        domestic.name = "Domestic";
        System.out.println(domestic.name);


        Cat cat =new Cat();
        System.out.println(cat.name);

        Wild wild = new Wild();
        System.out.println(wild.name);

        wild.name="wild2";
        System.out.println(wild.name);

        cat.name="Ginger";
        System.out.println(cat.name);

        Cat cat1 = new Cat();

        System.out.println("Cat1 name is : " + cat1.name);

        System.out.println(cat.eyeColor);
        System.out.println(domestic.eyeColor);

        animal.sleep();//Animal is sleeping

        domestic.sleep();//Animal is sleeping

        cat.sleep();

        wild.sleep();

        System.out.println();

        cat.sleep();
        System.out.println("====================");
        cat.eat();
        cat.eat(2);
        cat.eat("Chicago");

        Animal a1 =new Cat();

        Domestic d1 =cat.sound();
        System.out.println(d1.toString());

        Domestic d2 = domestic.sound();
        Animal a2 = domestic.sound();
        Cat c2 =(Cat) domestic.sound();
        System.out.println("-----------");
        System.out.println(c2);




    }
}
