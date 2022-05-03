package Objects;

public class Car {
    /*
    Create instance field as brand of car
    create move methode that show that car is moving
    create 5 objects and run garbadge collector
    show that gc works
    override toString message to show which car you are showing /printing

     */

    String brand;

      static void move(){

          System.out.println( "car is moving");
    }
    Car(String brand){

          this.brand=brand;
    }
    protected void finalize(){
        System.out.println(brand);
        System.out.println("is going to garbage" );
    }

    public String toString(){

         return brand+ " is the best car";
    }

    public static void main(String[] args) {
        move();
         Car car1 =new Car("Toyota");
        Car car2 =new Car("mercedes");
        Car car3 =new Car("porsche");
        Car car4 =new Car("dacia");
        Car car5 =new Car(" acura");

        car5 = null;


        System.gc();
        System.out.println(car3);
        System.out.println(car1);


    }



}
