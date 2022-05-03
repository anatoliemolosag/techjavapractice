package AhmedMentoring.Overloading;

public class VehicleTest {
    public static void main(String[] args) {


        Vehicle corvette = new Vehicle();
        corvette.move();
        System.out.println(corvette.passengerCapacity);//0
        corvette.passengerCapacity=5;
        System.out.println(corvette.passengerCapacity);//5

        Vehicle bmw = new Vehicle();
        bmw.move();//There is no extraEnginePower and booster for this car
        bmw.move(4.5);//There is extraEnginePower for this car
        bmw.move(4.5,4);

    }
}
