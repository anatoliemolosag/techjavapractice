package AccessModifiersTest;

import AccessModifiers.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Cat cat = new Cat();

        cat.colorProtected="orange";
        cat.namePublic = "Ginger";
        List list = new ArrayList<>();
        Animal cat1 = new Animal();

        cat1.sleepPrivate(3);


    }

}
