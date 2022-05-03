package OOP.Inheritance;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.name);//Animal
        animal.name= "King";
        System.out.println(animal.name);//King

        Domestic domestic = new Domestic();
        System.out.println(domestic.name);//Animal
        domestic.name = "Domestic";
        System.out.println(domestic.name);//Domestic

        Cat cat = new Cat();
        System.out.println("Cat name is " + cat.name);//Cat name is null
      //  System.out.println(cat.age);private field from parent not allowed

        cat.name = "flufy";
        System.out.println(cat.name);//flufy

        Wild wild = new Wild();
        System.out.println(wild.name);//Wild

        Wild wild1 = new Wild();
        System.out.println(wild1.name);//Wild

        cat.name = "Ginger";
        System.out.println("cat's name is : " + cat.name);//cat's name is : Ginger

        Cat cat1 = new Cat();

        System.out.println("CAT1 name is : " + cat1.name);//CAT1 name is : Lola

       // System.out.println(animal.eyeColor);eyecolor is is existing on Domestic // you can not inherit from child to parrent
        System.out.println(cat.eyeColor);
        System.out.println(domestic.eyeColor);
        //System.out.println(wild.eyeColor); // you  cannot inherit from sibling to sibling

        animal.sleep();

        domestic.sleep();

        cat.sleep();

        wild.sleep();

        cat.eat();
        cat.eat(2);
        cat.eat("Chicago");

        Animal a1 =new Cat();

        a1.eat();

        Domestic d1 = cat.sound();

        Animal animal1 = cat.sound();

        Domestic d2 = domestic.sound();
        Animal a2 = domestic.sound();
        System.out.println("--------------------");
        Cat c2 = (Cat)domestic.sound();//casting to Cat object
        System.out.println(c2);












    }
}
