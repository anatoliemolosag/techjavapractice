package AccessModifiers;

public class Dog extends Animal{

    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.sleepDefault(2);

        Dog dog = new Dog();

        dog.genderDefault = "Female";



    }
}
