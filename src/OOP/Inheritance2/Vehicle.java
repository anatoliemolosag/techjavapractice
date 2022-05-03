package OOP.Inheritance2;

public class Vehicle {

    protected String model;
    int year;
    public String brand;



     void move(){
        System.out.println("Vehicle is moving");
    }

    protected boolean start(){
        System.out.println("Vehicle is starting");
        return true;
    }

    public boolean stop(){
        System.out.println("Vehicle is stoping");
        return true;
    }
    Object accelerate(){
        System.out.println("Vehicle is getting faster");
        return new Vehicle("911",2022,"Porsche");
    }

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }
    /*
    ===================TASK===================
-Vehicle
  Variables:
    protected  model;
    default year;
    public brand;
  Methods:
    move(); --> vehicle is moving
    stop(); --> return true, vehicle is stopping
    protected start(); --> return true, vehicle is starting
    default accelerate(); --> return Object
  Constructor: create a constructor to initiliaze instance variables
-Car
  *extends Vehicle
  variables:
    model;
    engineType;
  Methods:
    Override move(); --> Car is moving
    Override accelerate(); --> return Integer and calls model from parent class
     */
}
