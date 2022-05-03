package StaticPractice;

public class TestPet {
    public static void main(String[] args) {
        Pet pet1 =new Pet("Leo", "orange",5);

        pet1.run();
        String str = pet1.color;
        System.out.println(str);

        Pet pet2 =new Pet("Leo", "orange",5);
        System.out.println(pet2.color);

        Pet pet3 = new Pet();
        System.out.println(pet3.color);//null
        pet3.color="brown";
        Pet pet4 = new Pet();
        System.out.println(pet4.color);//null

        System.out.println(pet1.food);
        pet1.eat();//This is the food amount 19

        pet2.eat();//This is the food amount 19
        pet1.eat();//This is the food amount 18

        pet2.food=25;

        pet3.eat();//This is the food amount 24

        Pet pet5 = new Pet(55);
        pet3.eat();//This is the food amount 54

        Pet.eat();
        Pet.food = 44;

        //Pet.run(); you can not call non static run(); methode
        //by just using class name



    }
}
