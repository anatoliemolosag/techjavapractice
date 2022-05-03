package OOP.Inheritance2;

public class Car extends Vehicle{

    String model;
    double engineType;

    public Car(String model, double engineType) {
        super("911",2022,"Porsche");
        this.model= model;
        this.engineType=engineType;
    }

    @Override
    void move(){
        System.out.println("Car is moving");
    }

    Car accelerate(){
        super.model = "S";

        System.out.println("Car is accelerating slowly");
        return new Car("Corolla",1.8);
    }

    public static void main(String[] args) {

        Car car = new Car("911",4.0);
        System.out.println(car.model);

        Car car2 = car.accelerate();
        System.out.println(car2.model);

        Vehicle car5 = new Car("Porsche",3);
        Vehicle v1 = car5;
        v1.start();

//        Car c3 = (Car)new Vehicle("xx",2020, "honda");//exception
//        c3.move();//exception

    }

}
