package StaticPractice;

public class Pet {

    String name;
    String color;
    int age;
    static int food =20;

    public static void eat(){
        food-=1;
        System.out.println("This is the food amount " + food);

    Pet pet6= new Pet();
    pet6.sleep();

    //sleep() sleep methode cannot be called in static eat;
        //by only it's name

    }

     public void run(){
         System.out.println("pet is running");

         Pet pet7= new Pet();
         eat();
     }
     public void sleep(){
         System.out.println("Pet is sleeping");
         eat();
     }

    public Pet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Pet(){

    }
    public Pet(int food){
        this.food =food;
    }


    public static void main(String[] args) {
        eat();
        //run();
        Pet.eat();
        //Pet.run();
        Pet cat = new Pet();
        cat.eat();
        cat.run();
        cat.name="king";
        cat.food =100;

        food =250;//static  variables can be call in static field without
        //object
        //color = "White" ; non-static fields variables cannot be
        //called in static field with no object

    }
}
