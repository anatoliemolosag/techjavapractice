package AhmedMentoring.Overloading;

public class Vehicle {

    //vehicle is the class name and is called template

    //create instance variables--> it belongs to class and it has default values

    String length;
    int passengerCapacity;//0
    int topSpeed;
    String color;//null
    double doorNumber;

    //creating the methods(behaviors)(functions) for my object
    public void move(){
        System.out.println("There is no extraEnginePower and booster for this car");
    }
    public void move(double extraEnginePower){
        System.out.println("There is extraEnginePower for this car");
    }

    public void move(double doorNumber, int booster ) {
        //for the overloading methods ONLY YOU MUST CARE ABOUT IS METHODE SIGNATURE (REFFERENCE + PARAMETERS)
        System.out.println("there is extraEnginePower and booster");
    }

    public void moveTires(double tires){

        }





}
